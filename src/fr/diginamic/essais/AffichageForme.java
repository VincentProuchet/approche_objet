package fr.diginamic.essais;

import fr.diginamic.formes.Formes;

public class AffichageForme {

	public static void Afficher(Formes formes) {
		System.out.println("\n périmétre : " + formes.CalculerPerimetre()
				+ "\n surface : " +formes.CalculerSurface() 
						);
	}
	public static void Afficher(Formes[] formes) {
		for(int i=0; i<formes.length;i++) {
			AffichageForme.Afficher(formes[i]);
		}
	}

}
