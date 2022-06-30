package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

/** TP J3
 * Test la classe CalculMoyenne
 * 
 * @author Vincent
 *
 */
public class TestMoyenne {

	public static void main(String[] args) {
		CalculMoyenne classe1 = TestMoyenne.WhatAreTheNumbers( new double[]{1,5,4,6,7,12,0,5}) ;
		System.out.println("moyenne : " +classe1.Calcul());
		classe1 = TestMoyenne.WhatAreTheNumbers( new double[]{1,5,4,6,0,5}) ;
		System.out.println("moyenne : " +classe1.Calcul());
		classe1 = TestMoyenne.WhatAreTheNumbers( new double[]{15,15,14,16,17,12,10,9}) ;
		System.out.println("moyenne : " +classe1.Calcul());
	}

	/** créer le jeux de donnée à partir d'un tableaux
	 * 
	 * @param a
	 * @return une instance de calcul moyenne
	 */
	private static CalculMoyenne WhatAreTheNumbers(double[] a) {
		CalculMoyenne table = new CalculMoyenne();
		for (int i = 0; i < a.length; i++) {
			table.Push(a[i]);
		}
		return table;
	}
	
}