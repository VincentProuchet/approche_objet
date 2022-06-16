package fr.diginamic.listes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

import fr.diginamic.sets.Pays;

public class TestPays {
	

	public static void main(String[] args)
	{
		// sourcehttps://github.com/Nabile-2022/approche-objet/blob/8cdfa6f4e7dbbfd43f7c8c7de740f0bedcc13f61/src/fr/diginamic/sets/TestPays.java#L11-L24
		// Meerci Nabile
		// https://fr.wikipedia.org/wiki/Liste_des_pays_par_PIB_(PPA)_par_habitant
		// https://fr.wikipedia.org/wiki/Liste_des_pays_par_population#Classement_par_population_totale_en_2022
		var pays = new HashSet<Pays>(Arrays.asList
		(
				new Pays("USA", 334_805_000, 59_495),
				new Pays("France", 65_585_000, 43_551),
				new Pays("Allemagne", 83_884_000, 50_206),
				new Pays("UK", 68_498_000, 43_620),
				new Pays("Italie", 60_263_000, 37_970),
				new Pays("Japon", 125_585_000, 42_659),
				new Pays("Chine", 1_448_471_000, 16_624),
				new Pays("Russie", 145_806_000, 24_789),
				new Pays("Inde", 1_406_632_000, 6_571)
		));
		Iterator<Pays> iter = pays.iterator();
		Pays first =iter.next();		
		Pays plusGrandPIB = first;
		Pays plusPetitPIB = first;
		Pays plusGrandPIBParHabitant = first;
		
		for(Pays p : pays) {
			// trouver la plus peuplée
			if(p.getPIBPerHabitant() > plusGrandPIBParHabitant.getPIBPerHabitant() ) {
				plusGrandPIBParHabitant =p; 
			}
			
			// trouver la moins peuplée
			if(p.getPIBTotal()< plusPetitPIB.getPIBTotal()) {
				plusPetitPIB =p;				
			}
			
		}
		plusPetitPIB.capitaliserNom();
		System.out.println(plusPetitPIB);
		System.out.println("-------------------------------------------------");
		
		pays.remove(plusPetitPIB);
		for(Pays list: pays) {
			System.out.println(list);
		}
	}
}
