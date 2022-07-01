package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Iterator;
/**
 * Classe pour montrer la facilité d'usage à la fusion des Hashmap
 * 
 * @author Vincent
 *
 */
public class FusionMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		// Création map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");
		//HashMap<Integer, String> map = fusionMap(map1, map2);
		HashMap<Integer, String> map  =new HashMap<>();
		map.putAll(map1);
		map.putAll(map2);
		
		afficherMap(map);
		
	}
	/**et cette horreur ben c'est ce que j'avais crée pour faire un truc qui se fait en deux lignes
	 * 
	 * @param <K>
	 * @param <V>
	 * @param map1
	 * @param map2
	 * @return
	 */
	public static <K, V> HashMap<K, V> fusionMap(HashMap<K, V>map1, HashMap<K, V>map2){
		HashMap<K, V> map = new HashMap<>();
		Iterator <K> iterKey = map1.keySet().iterator();
		Iterator<V> iterValue = map1.values().iterator();
		
		while (iterKey.hasNext() && iterValue.hasNext()) {
			map.put(iterKey.next(), iterValue.next());			
		}
		 iterKey = map2.keySet().iterator();
		 iterValue = map2.values().iterator();
		while (iterKey.hasNext() && iterValue.hasNext()) {
			map.put(iterKey.next(), iterValue.next());			
		}
		
		
		
		
		return map;
		
	}
	/**
	 * pour afficher les hashmap
	 * 
	 * @param <K>
	 * @param <V>
	 * @param map1
	 */
public static <K, V> void afficherMap(HashMap<K, V>map1) {
		
		for(K key:map1.keySet()) {	
			System.out.println(key +"  " + map1.get(key) );
		}
		


	}

}
