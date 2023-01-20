package fr.diginamic.tri;

import java.util.Comparator;

import fr.diginamic.recensement.Departement;


/**
 * compare les départements	
 * 
 * @author Vincent
 *
 */
public class DepartmentComparator implements Comparator<Departement> {

	/** trierPar */
	private TriType trierPar;
	/** v1 */
	private Departement v1;
	/** v2 */
	private Departement v2;
	
	/** Constructeur
	 * @param tri
	 */
	public DepartmentComparator(TriType tri) {
		this.trierPar = tri;
	}

	/** 
	 * Constructeur
	 * par défaut configure le tri par identifiant de département
	 */
	public DepartmentComparator() {
		this.trierPar = TriType.ParIdentifiant;
	}

	/**
	 * compare deux départements
	 * en fonction du type de tri
	 * par identifiant, par noms , par population
	 * 
	 */
	@Override
	public int compare(Departement o1, Departement o2) {
		this.v1 = o1;
		this.v2 = o2;
		switch (this.trierPar) {
		case ParPopulation:
			return this.parPopulation();
		case ParNom:
			return this.v1.nom().compareTo(v2.nom());
		case ParIdentifiant:
			return this.v1.codeDepartement().compareTo(this.v2.codeDepartement());
		case ParRegion:
			return this.v1.nomRegion().compareTo(v2.nomRegion());
		default:
			return 0;

		}
		

	}
	/**
	 * Comparateur pour les Département
	 * compare par nombre d'habitants
	 * @return 	1 => si la d1 < d2
	 * @return -1 => si la d1 > d2
	 * @return  0 => si la d1 = d2
	 * @author Vincent
	 *
	 */
	private int parPopulation() {
		if (v1.population() > v2.population()) {
			return -1;
		} else if (v1.population() < v2.population()) {
			return 1;
		}

		return 0;
	}

}
