package fr.diginamic.tri;

import java.util.Comparator;

import fr.diginamic.entities.Ville;

public class ComparatorNom implements Comparator<Ville> {

	@Override
	public int compare(Ville o1, Ville o2) {
		
		return o1.nom().compareTo(o2.nom());
	}

}
