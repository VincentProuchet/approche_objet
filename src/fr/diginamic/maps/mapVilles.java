package fr.diginamic.maps;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

import fr.diginamic.entities.Ville;
import fr.diginamic.recensement.Recensement;



public class mapVilles {
	public static HashMap<String, Ville> data;
	public static String dataFile = "F:\\dev\\approche_objet\\data";
	public static String fileName = "recensement.csv";
	public static void main(String[] args) throws IOException {
		// on invoque le sacroi-saint recensement 
		// qui va se charger de recupérer les donnée et de créer une belle liste
		Recensement records = new Recensement(dataFile+ "\\" +fileName);
		// on s'assure que data soit soit initialisé
		data = new HashMap<String,Ville>();
			for(Ville v: records.getVilles()) {
				data.put(v.nom(), v);
			}
		System.out.println("il y a :"+data.size()+ " villes dans la table");
		
		/// on cherche la moins peuplé
		Ville lemoinspeuple = null;
		Iterator<Ville> iterVille = data.values().iterator();
		while(iterVille.hasNext()) {
			Ville v = iterVille.next();
			if(lemoinspeuple == null) {
				lemoinspeuple = v;
			}
			else if(lemoinspeuple.populationTotale()>  v.populationTotale()) {
				lemoinspeuple = v;
				
			}
		}
		System.out.println("_________________________________________________________________");
		System.out.println("la moins peuplé :" +lemoinspeuple );
		data.remove(lemoinspeuple.getNom());
		System.out.println("retiré :" +lemoinspeuple );
		System.out.println("il y reste :"+data.size()+ " villes dans la table");
		System.out.println("_________________________________________________________________");
		afficherMap(data);
		
	}
	
	public static <K, V> void afficherMap(HashMap<K, V>map1) {
		Iterator<K> iterKey = map1.keySet().iterator();
		Iterator<V> iterValue = map1.values().iterator();
		
		
		while(iterValue.hasNext()&&iterKey.hasNext()) {
			
			System.out.println(iterKey.next() +"  " + iterValue.next() );
		}
		
		//System.out.println("il y a :"+map1.size()+ " élements dans la table");

	}

}
