package fr.diginamic.utils;

import geometrie.Cercle;
/**	TP J3
 * 
 * @author Vincent
 *
 */
public class CercleFactory {
	
	/**
	 * @param rayon
	 * @return
	 */
	public static Cercle createNew(double rayon) {
		
		return new Cercle(rayon);
		
		
	}
}
