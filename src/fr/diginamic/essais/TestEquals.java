package fr.diginamic.essais;

import fr.diginamic.entities.Ville;

public class TestEquals {

	public static void main(String[] args) {
		//String stringVille1= "0;0;34;0;0;55;moncul;2500 ";

		// on  créer deux ville
		Ville ville1 = new Ville("0;0;34;0;0;55;moncul;2500 ");
		Ville ville2 = new Ville("0;0;34;0;0;55;moncul;2500 ");
		
		Ville ville4 = new Ville("0;0;34;0;0;null;moncul;2500 ");
		Ville ville5 = new Ville("0;0;34;0;0;52;moncul;2500 ");
		Ville ville6 = new Ville("0;0;34;0;0;55;moncul;2500 ");
		// on copie ville1 dans ville3
		Ville ville3 = ville1;
		/**
		 * la méthode equals est implémenté  
		 */
		System.out.println("1 equals 2 ? "+ ville1.equals(ville2));
		System.out.println("1 equals 3 ? "+ville1.equals(ville3));
		System.out.println("1 equals 4 ? "+ville1.equals(ville4));
		System.out.println("1 equals 5 ? "+ville1.equals(ville5));
		System.out.println("1 equals 6 ? "+ville1.equals(ville6));
		
		System.out.println("==");
		// cet opérateur ne teste pas les valeurs des propriétées
		// mais les valeurs des adresses mémoires
		System.out.println("1 == 2 ? "+ (ville1.getNom() == ville2.getNom()));
		System.out.println("1 equals 2 ? "+ville1.getNom().equals(ville2.getNom()));
		// cet opérateur ne teste pas les valeurs des propriétées
		// mais les valeurs des adresses mémoires
		System.out.println("1 == 3 ? "+(ville1 == ville3));
	}

}
