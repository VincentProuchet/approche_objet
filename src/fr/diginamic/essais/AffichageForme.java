package fr.diginamic.essais;

import fr.diginamic.formes.Formes;
/** Classe d'affichage des propriétés des formes 
 * 
 * 
 * @author Vincent
 *
 */
public class AffichageForme {

	/** affiches les propriétés périmètre et surface d'une formes passé en paramètre
	 * 
	 * @param formes
	 */
	public static void Afficher(Formes formes) {
		System.out.println("\n périmétre : " + formes.CalculerPerimetre()
				+ "\n surface : " +formes.CalculerSurface() 
						);
	}
	/**  affiche les propriétés périmètre et surface de chaque forme d'un tableau de formes passé en paramètres 
	 * 
	 * @param formes
	 */
	public static void Afficher(Formes[] formes) {
		for(int i=0; i<formes.length;i++) {
			AffichageForme.Afficher(formes[i]);
		}
	}

}
