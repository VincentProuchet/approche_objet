package fr.diginamic.tri;

import java.util.Comparator;

import fr.diginamic.recensement.Region;

/**
 * Comparateur de Régions
 * 
 * @author Vincent
 *
 */
public class RegionComparator implements Comparator<Region> {

	/** trierPar */
	private TriType trierPar;
	/** v1 */
	private Region v1;
	/** v2 */
	private Region v2;

	/** Constructeur
	 * @param tri
	 */
	public RegionComparator(TriType tri) {
		this.trierPar = tri;
	}

	/** Constructeur
	 * 
	 */
	public RegionComparator() {
		this.trierPar = TriType.ParNom;
	}

	@Override
	public int compare(Region o1, Region o2) {
		this.v1 = o1;
		this.v2 = o2;
		switch (this.trierPar) {
		case ParPopulation:
			return this.parPopulation();
		case ParNom:
			return this.v1.nom().compareTo(this.v2.nom());
		case ParIdentifiant:
			return this.v1.code().compareTo(this.v2.code());
		default:
			return 0;
		}
	}

	/**
	 * @return
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
