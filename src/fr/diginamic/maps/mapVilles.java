package fr.diginamic.maps;

import java.io.IOException;
import java.util.HashMap;

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
				data.put(v.getNom(), v);
			}
		System.out.println("il y a :"+data.size()+ " villes dans la table");
		
		/// on cherche la moins peuplé
		Ville lemoinspeuple = null;
		
		for(Ville v : data.values()) {
			if(lemoinspeuple == null) {
				lemoinspeuple = v;
			}
			else if(lemoinspeuple.getPopulationTotale()>  v.getPopulationTotale()) {
				lemoinspeuple = v;
				
			}
		}
		System.out.println("_________________________________________________________________");
		System.out.println("la moins peuplé :" +lemoinspeuple );
		data.remove(lemoinspeuple.getNom());
		System.out.println("retiré :" +lemoinspeuple );
		System.out.println("il reste :"+data.size()+ " villes dans la table");
		System.out.println("_________________________________________________________________");
		afficherMap(data);
		
	}
	
public static <K, V> void afficherMap(HashMap<K, V>map1) {
		
		for(K key:map1.keySet()) {	
			System.out.println(key +"  " + map1.get(key) );
		}
		


	}

}
