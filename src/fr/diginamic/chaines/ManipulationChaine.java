package fr.diginamic.chaines;

import fr.diginamic.entities.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
		String chaine = "Durand;Marcel;2 523.5";
		char premierCaractere = chaine.charAt(0);
		int longueur = chaine.length();
		System.out.println("Premier caractère " + premierCaractere);
		System.out.println("la chaine fait "  + longueur + "  caractères.");
		System.out.println("Le premier ; est a "+ chaine.indexOf(';')+ " caractère du début" );
		System.out.println(chaine.substring(0,chaine.indexOf(';')).toUpperCase() );
		System.out.println(chaine.substring(0,chaine.indexOf(';')).toLowerCase() );
		
		Salarie values = new Salarie(chaine.split(";"));
		//AfficheTableau(values);
		
		System.out.println( "le salarié "+ values.getNom() +" " + values.getPrenom() 
								+ " est rémunéré " + values.getSalaire()+ "€."  );
		
		
		
	}
	
	
	public static void  AfficheTableau(String[]tableau) {
			System.out.println("Le tableau contient ");
		
		for (int i = 0; i < tableau.length; i++) {
				System.out.println(tableau[i]);
			}
			System.out.println("");
		}
	}


