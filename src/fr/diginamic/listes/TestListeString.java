package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.List;

public class TestListeString {

	public static void main(String[] args) {
		
		String[] arrayVille = {"Nice", "Carcassonne", "Narbonne", "Lyon", "Folx", "Pau"
								, "Marsellle", "Tarbes"};
		List<String> villes = setInArrayList(arrayVille);
		String PlusGrandeLongueur = "";
		
		for(int i=0; i<villes.size();i++) {
			if(villes.get(i).length()> PlusGrandeLongueur.length()) {
				PlusGrandeLongueur =villes.get(i); 
			}
			if(villes.get(i).startsWith("N")) {
				villes.remove(i);
			}
			// mise en majuscules
			villes.set(i, villes.get(i).toUpperCase()   );
		}
		for(String list: villes) {
			System.out.println(list);
		}
	
	

	}
	public static <T> List<T> setInArrayList( T [] liste){
		List<T>listeRetour = new ArrayList<>();
		for (int i =0;i<liste.length;i++) {
			listeRetour.add(liste[i]);
		}
		
		return listeRetour;
		
	}
}
