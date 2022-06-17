package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.List;

import fr.diginamic.entities.Ville;

public class TestVille {

	public static void main(String[] args) {
		List<Ville> villes = new ArrayList<>();
		
		villes.add(new Ville("Nice",  343_000));
		
		villes.add(new Ville("Carcassonne",  47_800));
		villes.add(new Ville("Narbonne", 53_400));
		villes.add(new Ville("Lyon", 484_000));
		villes.add(new Ville("Folx", 9_700));
		villes.add(new Ville("Pau", 77_200));
		villes.add(new Ville("Marseille", 850_700));
		villes.add(new Ville("Tarbes", 40_600));
		
		Ville laPlusPeuplee = villes.get(0);
		Ville laMoinsPeuplee = villes.get(0);
		
		for(Ville ville : villes) {
			// trouver la plus peuplée
			if(ville.getPopulation()> laPlusPeuplee.getPopulation()) {
				laPlusPeuplee =ville; 
			}
			// majuscule pour les villes de plus de 100 000 habitants
			if(ville.getPopulation()> 100_000) {
				ville.capitalizeNom(); 
			}
			// trouver la moins peuplée
			if(ville.getPopulation()< laMoinsPeuplee.getPopulation()) {
				laMoinsPeuplee =ville;				
			}
			
		}
		villes.remove(laMoinsPeuplee);
		for(Ville list: villes) {
			System.out.println("- "+list.getNom()+", "+list.getPopulation()+" habitants.");
		}
		
	}

}
