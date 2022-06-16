package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.List;

public class TestVille {

	public static void main(String[] args) {
		List<Ville> villes = new ArrayList<>();
		
		villes.add(new Ville("Nice",  343_000));
		
		villes.add(new Ville("Carcassonne",  47_800));
		villes.add(new Ville("Narbonne", 53_400));
		villes.add(new Ville("Lyon", 484_000));
		villes.add(new Ville("Folx", 9_700));
		villes.add(new Ville("Pau", 77_200));
		villes.add(new Ville("Marsellle", 850_700));
		villes.add(new Ville("Tarbes", 40_600));
		
		Ville laPlusPeuplee = villes.get(0);
		Ville laMoinsPeuplee = villes.get(0);
		
		for(int i=0; i<villes.size();i++) {
			// trouver la plus peuplée
			if(villes.get(i).getPopulation()> laPlusPeuplee.getPopulation()) {
				laPlusPeuplee =villes.get(i); 
			}
			// majuscule pour les villes de plus de 100 000 habitants
			if(villes.get(i).getPopulation()> 100_000) {
				villes.get(i).capitalizeNom(); 
			}
			// trouver la moins peuplée
			if(villes.get(i).getPopulation()< laMoinsPeuplee.getPopulation()) {
				laMoinsPeuplee =villes.get(i);				
			}
			
		}
		villes.remove(laMoinsPeuplee);
		for(Ville list: villes) {
			System.out.println("- "+list.getNom()+", "+list.getPopulation()+" hab");
		}
		
	}

}
