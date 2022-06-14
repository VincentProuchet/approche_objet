package fr.diginamic.essais;

import fr.diginamic.entities.Theatre;
/** TP j3
 * Theatre
 * @author Vincent
 *
 */
public class TestTheatre {

	public static void main(String[] args) {
		Theatre newPlace = new Theatre("The last theatre before the and of the world",2000);
		
		
		newPlace.Incrire(200, 50);
		newPlace.Incrire(100, 200);
		newPlace.Incrire(30, 300);
		newPlace.Incrire(500, 30);
		newPlace.Incrire(1000, 10);
		newPlace.Incrire(300, 5);
		
		System.out.println(newPlace.totalInscripts());
		System.out.println(newPlace.Recette());
		
		
		
		
		
		
		
	}

}
