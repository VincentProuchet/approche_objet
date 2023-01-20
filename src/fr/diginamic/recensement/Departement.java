package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.List;

import fr.diginamic.entities.Ville;


/**
 * Classe entitée
 * représente un Département  
 * @author Vincent
 *
 */
/**
 * @author Vincent
 *
 */
public class Departement {
	private List<Ville> villes;
	private String codeDepartement,nom, codeRegion, nomRegion;

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

			if (v.getCodeDepartement().equals(codeDepartement)) {
				this.villes.add(v);
				this.codeRegion = v.getCodeDeRegion();
				this.nomRegion = v.getNomRegion();
			}
		}

	}

	/**
	 * ajoute la ville si le code de département correspond
	 * au codeDepartement de l'instance 	 * 
	 * @param Ville à ajouter
	 */
	public void ajouter(Ville v) {
		if (v.getCodeDepartement().equals(codeDepartement)) {
			this.villes.add(v);
			this.codeRegion = v.getCodeDeRegion();
			this.nomRegion = v.getNomRegion();
		}
	}

	

	/**
	 * GETTER
	 * @return liste des villes 
	 */
	public List<Ville> villes() {
		return this.villes;
	}

	/**
	 * @return coptage de la population totale du département
	 */
	public int population() {
		int population = 0;
		for (Ville v : this.villes) {
			population += v.getPopulationTotale();
		}
		return population;
	}

	/**
	 * GETTER
	 * @return
	 */
	public String codeRegion() {
		return this.codeRegion;
	}
/**
 * GETTER
 * @return
 */
	public String nomRegion() {
		return this.nomRegion;
	}

	/**
	 * GETTER
	 * @return
	 */
	public String codeDepartement() {
		return this.codeDepartement;
	}
	
	/**
	 * GETTER
	 * @return
	 */
	public String nom() {
		return this.nom;
	}

	/**
	 * retourne une représentation textuel du département
	 * sous la forme
	 * codeDépartement + nom de région du département
	 */
	public String toString() {
		return new StringBuilder(this.codeDepartement).append(" dans ").append(this.nomRegion).toString();
	}
}