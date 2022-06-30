package fr.diginamic.tri;

import java.util.Comparator;

import fr.diginamic.entities.Ville;

public class VilleComparator implements Comparator<Ville> {

	private TriType trierPar;
	private Ville v1;
	private Ville v2;

	public VilleComparator(TriType tri) {
		this.trierPar = tri;
	}

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
			return this.parOrdreAlphabetique();
		case ParRegion:
			return this.parRegion();
		case ParDepartement:
			return this.parDepartement();
		default:
			return 0;

		}

	}

	private int parPopulation() {
		if (v1.getPopulationTotale() > v2.getPopulationTotale()) {
			return -1;
		} else if (v1.getPopulationTotale() < v2.getPopulationTotale()) {
			return 1;
		}

		return 0;
	}
	private int parOrdreAlphabetique() {
		return this.v1.getNom().compareTo(this.v2.getNom());
	}
	private int parDepartement() {
		return this.v1.getCodeDepartement().compareTo(this.v2.getCodeDepartement());
	}
	private int parRegion() {
		return this.v1.getCodeDeRegion().compareTo(this.v2.getCodeDeRegion());
	}
}
