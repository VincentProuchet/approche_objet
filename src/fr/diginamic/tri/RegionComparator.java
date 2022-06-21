package fr.diginamic.tri;

import java.util.Comparator;

import fr.diginamic.recensement.Region;

public class RegionComparator implements Comparator<Region> {
	
	private TriType trierPar;
	private Region v1;
	private Region v2;

	public RegionComparator(TriType tri) {
		this.trierPar = tri;
	}

	public RegionComparator() {
		this.trierPar = TriType.ParNom;
	}

	@Override
	public int compare(Region o1, Region o2) {
		int response ;
		this.v1 = o1;
		this.v2 = o2;
		switch (this.trierPar) {
		case ParPopulation:
			 response  = this.parPopulation();
			 break;
		case ParNom:
			response = this.parOrdreAlphabetique();
			break;
		case ParIdentifiant:
			response = this.parIdentifiant();
			break;
		default:
			response = 0;
			

		}
		return response;

	}

	private int parPopulation() {
		if (v1.population() > v2.population()) {
			return -1;
		} else if (v1.population() < v2.population()) {
			return 1;
		}

		return 0;
	}
	private int parOrdreAlphabetique() {
		return this.v1.nom().compareTo(this.v2.nom());
	}
	private int parIdentifiant() {
		return this.v1.code().compareTo(this.v2.code());
	}

}
