package fr.diginamic.tri;

import java.util.Comparator;

import fr.diginamic.entities.Ville;
import fr.diginamic.recensement.Departement;

public class DepartmentComparator implements Comparator<Departement> {

	private TriType trierPar;
	private Departement v1;
	private Departement v2;

	public DepartmentComparator(TriType tri) {
		this.trierPar = tri;
	}

	public DepartmentComparator() {
		this.trierPar = TriType.ParIdentifiant;
	}

	@Override
	public int compare(Departement o1, Departement o2) {
		this.v1 = o1;
		this.v2 = o2;
		switch (this.trierPar) {
		case ParPopulation:
			return this.parPopulation();
		case ParNom:
			break;
		case ParIdentifiant:
			return this.parIdentifiant();
		case ParRegion:

		default:
			return 0;

		}
		return 0;

	}

	private int parPopulation() {
		if (v1.population() > v2.population()) {
			return -1;
		} else if (v1.population() < v2.population()) {
			return 1;
		}

		return 0;
	}

	private int parIdentifiant() {
		return this.v1.codeDepartement().compareTo(this.v2.codeDepartement());
	}

}
