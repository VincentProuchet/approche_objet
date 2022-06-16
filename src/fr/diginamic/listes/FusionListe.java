package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {

	public static void main(String[] args) {
		
		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		List<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
		
		
		List<String>list3 = fusion(liste1,liste2);
		for(String nb : list3){
			System.out.println(nb);
		}
	}
	
	
	public static <T> List<T> fusion(List<T> list1,List<T> list2){
		
		List<T> listRetour = new ArrayList<T>();
		
		for(T s: list1) {
			listRetour.add(s);
		}
		for(T s: list2) {
			listRetour.add(s);
		}
			
		return listRetour;
	}

}
