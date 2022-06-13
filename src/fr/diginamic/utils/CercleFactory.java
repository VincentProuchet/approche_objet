package fr.diginamic.utils;

import fr.diginamic.banque.entites.Cercle;
/**	TP J3
 * 
 * @author Vincent
 *
 */
public class CercleFactory {
	
	public static Cercle createNew(double rayon) {
		
		return new Cercle(rayon);
		
		
	}
}
