package fr.diginamic.sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class TestSetString {

	public static void main(String[] args) {
		String[] tableau = {"USA","France","Allemagne","UK","Italie","Japon","Chine"
							,"Russie","Inde"};

		HashSet<String> pays = setInArrayList(tableau);
		
		
		
		String chaineLaPlusLongue= "";
		
		Iterator<String> iter = pays.iterator();
		while(iter.hasNext()) {
			String place = iter.next();
			if(place.length()> chaineLaPlusLongue.length()) {
				chaineLaPlusLongue = place;
				
			}
			
		}
		System.out.println("nom de pays le plus long : "+ chaineLaPlusLongue);
		pays.remove(chaineLaPlusLongue);
		System.out.println("---------------------------------");
		
		iter = pays.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());				
		}
		
		
		
		
	}
	/**
	 * Ne semble pas vouloir fonctionner sur de Double<-->double
	 * 
	 * @param <T>
	 * @param tableau
	 * @return
	 */
	public static <T> HashSet<T> setInArrayList(T[] tableau) {
		List<T> liste = new ArrayList<>();
		for (int i = 0; i < tableau.length; i++) {
			liste.add(tableau[i]);
		}
		HashSet<T> hashRetour = new HashSet<>(liste);

		return hashRetour;

	}


}
