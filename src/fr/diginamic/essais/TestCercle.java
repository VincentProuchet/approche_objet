package fr.diginamic.essais;

import fr.diginamic.banque.entites.Cercle;
import fr.diginamic.utils.CercleFactory;
/**	TP J3
 * 
 * @author Vincent
 *
 */
public class TestCercle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cercle cercle1 =CercleFactory.createNew(55.0);
		Cercle cercle2 =CercleFactory.createNew(32.3);
		
		
		System.out.println("Il a un rayon de : "+ cercle1.GetRayon() + " et une surface de : " + cercle1.surface());
		System.out.println("Il a un rayon de : "+ cercle2.GetRayon() + " et une surface de : " + cercle2.surface());
		
	}

}
