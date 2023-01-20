package fr.diginamic.tri;

import java.util.Comparator;

import fr.diginamic.entities.Ville;

/**
 * @author Vincent
 *
 */
public class VilleComparator implements Comparator<Ville> {

	/** trierPar */
	private TriType trierPar;
	/** v1 */
	private Ville v1;
	/** v2 */
	private Ville v2;

	/**
	 * Constructeur
	 * 
	 * @param tri
	 */
	public VilleComparator(TriType tri) {
		this.trierPar = tri;
	}

	/**
	 * Constructeur
	 * 
	 */
	public VilleComparator() {
		this.trierPar = TriType.ParNom;
	}

	@Override
	public int compare(Ville o1, Ville o2) {
		this.v1 = o1;
		this.v2 = o2;
		switch (this.trierPar) {
		case ParPopulation:
			return this.parPopulation();
		case ParNom:
			return this.v1.getNom().compareTo(this.v2.getNom());
		case ParRegion:
			return this.v1.getCodeDeRegion().compareTo(this.v2.getCodeDeRegion());
		case ParDepartement:
			return this.v1.getCodeDepartement().compareTo(this.v2.getCodeDepartement());
		default:
			return 0;

		}

	}

	/**
	 * @return
	 */
	private int parPopulation() {
		if (v1.getPopulationTotale() > v2.getPopulationTotale()) {
			return -1;
		} else if (v1.getPopulationTotale() < v2.getPopulationTotale()) {
			return 1;
		}
		return 0;
	}
}
