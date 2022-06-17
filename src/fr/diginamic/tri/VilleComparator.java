package fr.diginamic.tri;

import java.util.Comparator;

import fr.diginamic.entities.Ville;

public class VilleComparator implements Comparator<Ville> {
	public enum TriType {
		ParNom,ParNomInverse, ParPopulation,ParPopulationInverse
	}

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

		switch (this.trierPar) {
		case ParPopulation:
			return this.parPopulation();
		case ParNom:
			return this.parOrdreAlphabetique();
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
		return v1.nom().compareTo(v2.nom());
	}
}
