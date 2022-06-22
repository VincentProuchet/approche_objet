package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Iterator;

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
		HashMap<Integer, String> map = fusionMap(map1, map2);
		afficherMap(map);
		
	}
	
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
	
	public static <K, V> void afficherMap(HashMap<K, V>map1) {
		Iterator<K> iterKey = map1.keySet().iterator();
		Iterator<V> iterValue = map1.values().iterator();
		
		
		while(iterValue.hasNext()&&iterKey.hasNext()) {
			
			System.out.println(iterKey.next() +"  " + iterValue.next() );
		}
		
		System.out.println("il y a :"+map1.size()+ " élements dans la table");

	}

}
