package fr.diginamic.tri;

import java.util.Comparator;

import fr.diginamic.entities.Ville;

public class ComparatorHabitant implements Comparator<Ville> {

	@Override
	public int compare(Ville o1, Ville o2) {
		if(o1.getPopulationTotale()> o2.getPopulationTotale()) {
			return -1;
		}
		else if(o1.getPopulationTotale()< o2.getPopulationTotale()) {
			return 1;
		}
		
		return 0;
	}
	
}
