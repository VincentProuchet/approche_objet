package fr.diginamic.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * cette classe sert d'exemple à l'usage des hashmap
 * 
 * @author Vincent
 *
 */
public class ComptagePaysParContinent {

	public static void main(String[] args) {
		List<Pays> pays = new ArrayList<>();
		pays.add(new Pays("France", "Europe", 65_000_000L));
		pays.add(new Pays("Allemagne", "Europe", 80_000_000L));
		pays.add(new Pays("Belgique", "Europe", 10_000_000L));
		pays.add(new Pays("Russie", "Asie", 150_000_000L));
		pays.add(new Pays("Chine", "Asie", 1_400_000_000L));
		pays.add(new Pays("Indonésie", "Océanie", 220_000_000L));
		pays.add(new Pays("Australie", "Océanie", 20_000_000L));

		HashMap<String, Integer> comptagePays = comptageComptinent(pays);
		afficherMap(comptagePays);

	}

	public static <K, V> void afficherMap(HashMap<K, V> map1) {

		for (K key : map1.keySet()) {
			System.out.println(key + "  " + map1.get(key));
		}

	}

	/**
	 * version corrigé
	 * 
	 * @param pays
	 * @return
	 */
	public static HashMap<String, Integer> comptageComptinent(List<Pays> pays) {
		HashMap<String, Integer> comptagePays = new HashMap<>();

		for (Pays p : pays) {
			String continent = p.continent;
			Integer compteur = comptagePays.get(continent); // parce que le get renvoie un null si aucune correspondance
															// n'est trouvé
			if (compteur == null) {
				comptagePays.put(continent, 1);
			} else {
				compteur++;
				comptagePays.put(continent, compteur);
			}

		}

		return comptagePays;
	}

	/**
	 * Version présenté par Vincent prouchet
	 * 
	 * @param pays
	 * @return
	 */
	public static HashMap<String, Integer> comptageComptinentVincent(List<Pays> pays) {
		HashMap<String, Integer> comptagePays = new HashMap<>();
		Iterator<String> iterKey;
		Iterator<Integer> iterValue;

		for (Pays p : pays) {

			iterKey = comptagePays.keySet().iterator();
			iterValue = comptagePays.values().iterator();
			String key;
			Integer compte = 0;
			// controle d'etat de la recherche
			boolean trouve = false;

			// si le set est vide
			if (comptagePays.size() < 1) {
				// on ajoute le courant
				comptagePays.put(p.continent, 1);
				trouve = true;
			} else {
				// on recherche un continent equivalent dans la liste
				while (iterKey.hasNext() && iterValue.hasNext()) {
					key = iterKey.next();
					compte = iterValue.next();
					// si une clé correpsond
					if (key == p.continent) {
						// on incrément par écrasement de la clé
						comptagePays.put(key, compte + 1);
						// et on marque que la recherche est valide
						trouve = true;
					}
				}
				// si la recherche est invalide
				if (!trouve) {
					// on ajoute la valeur au tableau
					comptagePays.put(p.continent, 1);

				}
			}
			// et on ré-initialize l'état de la recherche
			trouve = false;

		}

		return comptagePays;
	}

	/**
	 * Méthode présenté par Nabile Ramani Le mec est vraiment bon
	 * 
	 * @param pays
	 * @return
	 */
	public static Map<String, Integer> comptageComptinentNabile(List<Pays> pays) {

		Map<String, Integer> map = new HashMap<>();
		for (Pays p : pays) {
			String key = p.continent;// parce que c'est le nom du continent qui nous intéresse
			// on tente de recupérer l'information avec un renvoi de valeur par défaut si
			// null
			Integer count = map.getOrDefault(key, 0);
			// incrémentation
			count++;
			// écrasement
			map.put(key, count);// si la valeur key n'existe pas elle seras crée
		}
		return map;
	}
}
