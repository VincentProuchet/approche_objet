package fr.diginamic.maps;

import java.util.HashMap;
/**
 * classe d'exemple pour montrer les mécanisme de remplissage des hashmap
 * @author Vincent
 *
 */
public class CreationMap {

	public static void main(String[] args) {
		HashMap <String,Double> mapSalaire = new HashMap<>();
		mapSalaire.put("Paul", 1750d);
		mapSalaire.put("Hicham", 1825d);
		mapSalaire.put("Yu", 2250d);
		mapSalaire.put("Ingrid", 2015d);
		mapSalaire.put("Chantal", 2418d);
		
		System.out.println(mapSalaire.size());
		
		
	}

}
