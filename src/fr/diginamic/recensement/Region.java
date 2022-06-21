package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import fr.diginamic.entities.Ville;

public class Region {
	private HashSet<Departement> departements;
	private String code, nom;

	public Region(String id) {
		this.departements = new HashSet<>();
		this.code = id;
	}
	public Region(Ville ville) {
		this.departements = new HashSet<>();
		this.code = ville.codeDeRegion();
		this.nom = ville.nomRegion();
	}

	public void ajouter(Departement departement) {
		if (departement.codeRegion().equals(code)) {
			this.departements.add(departement);
		}

	}

	/**
	 * ajouts à la list des départements tous les départements dont le codeRegion
	 * correspond au codeRegion de l'instance
	 * 
	 * @param liste
	 */
	public void ajouter(List<Departement> liste) {
		for (Departement d : liste) {
			if (d.codeRegion().equals(code)) {
				this.nom = d.nomRegion();
				this.departements.add(d);
			}
		}

	}

	public int population() {
		int population = 0;

		for (Departement d : this.departements) {
			population += d.population();
		}

		return population;
	}

	public HashSet<Departement> listeDepartement() {
		return this.departements;
	}

	public String nom() {
		return this.nom;
	}
	public String code() {
		return this.code;
	}

	public String toString() {

		return this.code+" ---- "  + this.nom;
	}
}
