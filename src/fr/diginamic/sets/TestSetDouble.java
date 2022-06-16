package fr.diginamic.sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class TestSetDouble {

	public static void main(String[] args) {
		double[] tableau = { 1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01 };

		// HashSet<Double> nombres = setInArrayList(tableau);
		HashSet<Double> nombres = new HashSet<>();

		for (int i = 0; i < tableau.length; i++) {
			nombres.add(tableau[i]);
		}
		Iterator<Double> iter = nombres.iterator();
		Double first = iter.next();
		Double plusGrandNombre = first;
		Double plusPetitNombre = first;

		for (Double d : nombres) {
			System.out.println(d);
			if (d.doubleValue() > plusGrandNombre.doubleValue()) {
				plusGrandNombre = d;
			}
			if (d.doubleValue() < plusPetitNombre.doubleValue()) {
				plusPetitNombre = d;
			}

		}
		System.out.println("------------------------------------");
		System.out.println("Plus grand nombre :"+plusGrandNombre);
		nombres.remove(plusPetitNombre);
		System.out.println("Liste modifié :");
		for (Double d : nombres) {
			System.out.println(d);
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
