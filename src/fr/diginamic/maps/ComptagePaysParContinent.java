package fr.diginamic.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

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

		HashMap<String, Integer> comptagePays = new HashMap<>();
		Iterator<String> iterKey;
		Iterator<Integer> iterValue;

		for (Pays p : pays) {
			iterKey = comptagePays.keySet().iterator();
			iterValue = comptagePays.values().iterator();
			String key;
			Integer compte = 0;
			boolean trouve = false;
			
			// si le set est vide
			if (comptagePays.size() < 1) {
				// on ajoute le courant
				comptagePays.put(p.continent, 1);
				trouve =true;
			} else {

				while (iterKey.hasNext() && iterValue.hasNext()) {
					key = iterKey.next();
					compte = iterValue.next();
					if (key == p.continent) {
						comptagePays.put(key, compte+1);
						trouve = true;
					}
				}
				if(!trouve) {
					comptagePays.put(p.continent,1);
					
				}
			}
			trouve = false;

		}
		
		afficherMap(comptagePays);

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
