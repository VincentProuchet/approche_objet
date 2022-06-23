package fr.diginamic.essais;

import fr.diginamic.entities.Ville;

public class TestEquals {

	public static void main(String[] args) {
		//String stringVille1= "0;0;34;0;0;55;moncul;2500 ";

		// on  créer deux ville
		Ville ville1 = new Ville("0;0;34;0;0;55;moncul;2500 ");
		Ville ville2 = new Ville("0;0;34;0;0;55;moncul;2500 ");
		// on copie ville1 dans ville3
		Ville ville3 = ville1;
		/**
		 * la méthode equals est implémenté  
		 */
		if(ville1.equals(ville2)) {
			System.out.println("Les villes sont identiques");
		}
		else {
			System.out.println("Les villes sont différentes");
		}
		// cet opérateur ne teste pas les valeurs des propriétées
		// mais les valeurs des adresses mémoires
		if(ville1 == ville2) {
			System.out.println("Les villes sont identiques");
		}
		else {
			System.out.println("Les villes sont différentes");
		}
		
		// cet opérateur ne teste pas les valeurs des propriétées
		// mais les valeurs des adresses mémoires
		if(ville1 == ville3) {
			System.out.println("Les villes sont identiques");
		}
		else {
			System.out.println("Les villes sont différentes");
		}
	}

}
