package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Formes;
import fr.diginamic.formes.Rectangle;
/** 
 * classe de test des Formes 
 * Cercle
 * Rectangle 
 * Carre
 * @author Vincent
 *
 */
public class TestForme {

	public static void main(String[] args) {
		Formes[] formes = new Formes[3];
		
		formes[0] = new Cercle(4);
		formes[1] = new Rectangle(2, 5);
		formes[2] = new Carre(4);
		AffichageForme.Afficher(formes);
		
		

	}

}
