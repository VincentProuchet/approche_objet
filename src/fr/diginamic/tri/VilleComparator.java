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
		if (v1.populationTotale() > v2.populationTotale()) {
			return -1;
		} else if (v1.populationTotale() < v2.populationTotale()) {
			return 1;
		}

		return 0;
	}
	private int parOrdreAlphabetique() {
		return this.v1.nom().compareTo(this.v2.nom());
	}
	private int parDepartement() {
		return this.v1.codeDeDepartement().compareTo(this.v2.codeDeDepartement());
	}
	private int parRegion() {
		return this.v1.codeDeRegion().compareTo(this.v2.codeDeRegion());
	}
}
