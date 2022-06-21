package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import fr.diginamic.entities.Ville;

public class Recensement {
	private HashSet<Ville> villes;
	private HashSet<Departement> departements;
	private HashSet<Region> regions;
	private EtatRecensement etat;

	private Region currentRegion;
	private Departement currentDepartement;

	public static String fichierSource;

	public Recensement(String fichier) throws IOException {
		this.etat = EtatRecensement.PremiersEnregistrements;
		this.villes = new HashSet<Ville>();
		this.departements = new HashSet<Departement>();
		this.regions = new HashSet<Region>();
		fichierSource = fichier;
		this.chargerDonnees();

	}

	private void chargerDonnees() throws IOException {
		List<String> liste = Recensement.getFile(Recensement.fichierSource);

		// création de la liste des villes
		for (String s : liste) {

			try {
				Ville v = new Ville(s);
				villes.add(v);
				// si l'on est dans une première initialisation les valeurs courantes sont
				// nulles
				// et les listes vides
				

				this.Departement(v);
				this.Region(v);
				this.etat = EtatRecensement.NouvelleVille;

			} catch (Exception e) {
				// I will ignore that
				// - Freeza
			}

		}

	}

	/**
	 * Traite le département il intégtre un controle d'intégrité avec une recherche
	 * d'enregistrement existant
	 * 
	 * @param ville
	 */
	private void Departement(Ville ville) {
		// on initialise les courants si ils ne le sont pas
		if (this.etat == EtatRecensement.PremiersEnregistrements) {
			// create a new département
			this.currentDepartement = new Departement(ville.codeDeDepartement());
			this.etat = EtatRecensement.NouveauDépartement;

		}
		// on vérifie le code demandé avec le courant
		if (!this.currentDepartement.codeDepartement().equals(ville.codeDeDepartement())) {
			// si ils ne correspondent pas
			// chercher dans la liste
			for (Departement d : this.departements) {
				// le mettre en courant si il existe
				if (ville.codeDeDepartement().equals(d.codeDepartement())) {
					this.currentDepartement = d;
				}

			}
			// on vérifie si il a été trouvé dans la liste
			if (!this.currentDepartement.codeDepartement().equals(ville.codeDeDepartement())) {
				// si il n'a pas été trouvé
				// on en créer un tout neuf
				this.currentDepartement = new Departement(ville.codeDeDepartement());
				// à voir si l'ont ne vas pas regrouper l'ajout des données
				// marqué pour ajout à la liste
				this.etat = EtatRecensement.NouveauDépartement;
			}

		}
		// a ce point
		// soit le département courant correspond à celui dont on a besoin
		// soit il à été trouvé
		// soit il à été crée
		// on y ajoute la nouvelle ville
		this.currentDepartement.ajouter(ville);
		// et si c'est un nouveau département on l'ajoute à la liste des départements
		if (this.etat == EtatRecensement.NouveauDépartement) {
			this.departements.add(currentDepartement);
		}
	}

	private void Region(Ville ville) {
		EtatRecensement etatPecedant = this.etat;  
		// on vérifie la region demandé avec le courant
		// chercher dans la liste
			if (this.regions.size() > 0) {// mais on vérifie d'abord qu'elle ne soit pas vide
				for (Region d : this.regions) {
					// le mettre en courant si il existe
					if (ville.codeDeRegion().equals(d.code())) {
						this.currentRegion = d;
					}

				}
			}
			else { // si la liste est vide 
				// on considère que la région courant est vide aussi  
				this.currentRegion = new Region(ville);
				this.etat = EtatRecensement.NouvelleRegion;
			}
			// on vérifie si il a été trouvé dans la liste
			if (!this.currentRegion.code().equals(ville.codeDeRegion())) {
				// si il n'a pas été trouvé
				// on en créer un tout neuf
				this.currentRegion = new Region(ville);
				// à voir si l'ont ne vas pas regrouper l'ajout des données
				// marqué pour ajout à la liste
				this.etat = EtatRecensement.NouvelleRegion;
			}
		// a ce point
		// soit la région courant correspond à celui dont on a besoin
		// soit il à été trouvé
		// soit il à été crée
		// si c'est une nouvelle région
			if(this.etat == EtatRecensement.NouvelleRegion) {
				this.regions.add(currentRegion);
				// les nouvelle région reçoivent toujours un nouveau département
				// on écrase l'état précédent
				etatPecedant = EtatRecensement.NouveauDépartement;
			}
		// on rend la main à l'état précédent
			this.etat = etatPecedant;
			
		// et si c'est un nouveau département on l'ajoute départements de la région
		if (this.etat == EtatRecensement.NouveauDépartement) {
			this.currentRegion.ajouter(currentDepartement);
		}

	}

	/**
	 * Récupérée un fichier fileName dans le repertoire filePath et rend une
	 * List<String> des lignes du fichier
	 * 
	 * @param fileName
	 * @param filePath
	 * @return List<String>
	 * @throws IOException
	 */
	public static List<String> getFile(String fileName, String filePath) throws IOException {
		// forme un path
		fileName = filePath.replace("/", "\\");
		Path path = Paths.get(filePath + "\\" + fileName);
		// s'assure que le fichier existe
		if (Files.exists(path)) {
			// recupére toutes les lignes du fichier
			List<String> lignes = Files.readAllLines(path, StandardCharsets.UTF_8);
			return lignes;

		} else {
			// dans le cas ou le fichier n'est pas trouvé
			System.out.println("Le fichier n'existe pas.");
			return null;
		}
	}

	/**
	 * Récupérée un fichier fileName dans le repertoire filePath et rend une
	 * List<String> des lignes du fichier
	 * 
	 * @param file
	 * @return List<String>
	 * @throws IOException
	 */
	public static List<String> getFile(String file) throws IOException {
		// forme un path
		file = file.replace("/", "\\");
		Path path = Paths.get(file);
		// s'assure que le fichier existe
		if (Files.exists(path)) {
			// recupére toutes les lignes du fichier
			List<String> lignes = Files.readAllLines(path, StandardCharsets.UTF_8);
			return lignes;

		} else {
			// dans le cas ou le fichier n'est pas trouvé
			System.out.println("Le fichier n'existe pas.");
			return null;
		}
	}

	public HashSet<Ville> getVilles() {
		return this.villes;
	}

	public HashSet<Region> getRegions() {
		return this.regions;
	}

	public HashSet<Departement> getDepartement() {
		return this.departements;
	}

}
