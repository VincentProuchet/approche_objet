package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.List;

import fr.diginamic.entities.Ville;

public class Departement {
	private List<Ville> villes;
<<<<<<< Upstream, based on 505aeee201c44823aeabc80c485db1e1d3ecba91
	private String codeDepartement,nom, codeRegion, nomRegion;
=======
	private String codeDepartement, codeRegion, nomRegion;
>>>>>>> 91747a1 TP Recensement Fonctionnalité Regions les plus peuplées terminée

	public Departement(String id) {
		this.villes = new ArrayList<>();
		this.codeDepartement = id;
		this.nom = "";
	}

	/**
	 * ajoute toutes les villes de la liste dont le code de département correspond
	 * au codeDepartement de l'instance dans la liste des villes de l'instance
	 * 
	 * @param liste
	 */
	public void ajouter(List<Ville> liste) {
		for (Ville v : liste) {

			if (v.codeDeDepartement().equals(codeDepartement)) {
				this.villes.add(v);
				this.codeRegion = v.codeDeRegion();
				this.nomRegion = v.nomRegion();
			}
		}

	}

	/**
	 * ajoute la ville si le code de département correspond
	 * au codeDepartement de l'instance 	 * 
	 * @param Ville à ajouter
	 */
	public void ajouter(Ville v) {
		if (v.codeDeDepartement().equals(codeDepartement)) {
			this.villes.add(v);
			this.codeRegion = v.codeDeRegion();
			this.nomRegion = v.nomRegion();
		}
	}

	

	public List<Ville> villes() {
		return this.villes;
	}

	public int population() {
		int population = 0;
		for (Ville v : this.villes) {
			population += v.getPopulation();
		}
		return population;
	}

	public String codeRegion() {
		return this.codeRegion;
	}

	public String nomRegion() {
		return this.nomRegion;
	}

	public String codeDepartement() {
		return this.codeDepartement;
	}
<<<<<<< Upstream, based on 505aeee201c44823aeabc80c485db1e1d3ecba91
	public String nom() {
		return this.nom;
	}

	public String toString() {
		return this.codeDepartement +" dans " + this.nomRegion;
	}
}
=======

	public String toString() {
		return this.codeDepartement +" dans " + this.nomRegion;
	}
}
>>>>>>> 91747a1 TP Recensement Fonctionnalité Regions les plus peuplées terminée
