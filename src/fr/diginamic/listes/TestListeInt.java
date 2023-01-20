package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.List;



/**
 * tester les liste d'entiers
 * @author Vincent
 *
 */
public class TestListeInt {

	public static void main(String[] args) {
		
		List<Integer> nombres = new ArrayList<>();
		nombres.add(-1);
		nombres.add(5);
		nombres.add(7);
		nombres.add(3);
		nombres.add(-2);
		nombres.add(4);
		nombres.add(8);
		nombres.add(5);
		Integer plusGrandNombre = nombres.get(0);
		Integer plusPetitNombre = nombres.get(0);
		
		
		System.out.println("Les nombres dans la listes sont :");
		
		for(Integer list: nombres) {
			// je n'ai pas trouvé de méthode intégré pour ça
			
			plusGrandNombre = Math.max(plusGrandNombre,list);
			plusPetitNombre = Math.min(plusPetitNombre, list);
			System.out.println(list);
		}
		System.out.println("________________________________________________________________");
		System.out.println("Taille de la liste:" +nombres.size() );
		System.out.println("Plus grand entier dans la liste : " + plusGrandNombre.intValue()) ;
		nombres.remove(plusPetitNombre);
		System.out.println("On retire le plus petit :");
		for(Integer list: nombres) {
			System.out.println(list);
		}
	
		for(int i=0; i<nombres.size();i++) {
			nombres.set(i, Math.abs(nombres.get(i)));
		}
		System.out.println("________________________________________________________________");
		System.out.println("Les nombres rendus positif :");
		for(Integer list: nombres) {
			System.out.println(list);
		}
	}

}
