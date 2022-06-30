package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** Classe de test des liste de String
 * @author Vincent
 *
 */
public class TestListeString {

	public static void main(String[] args) {

		String[] arrayVille = { "Nice", "Carcassonne", "Narbonne", "Lyon", "Folx", "Pau", "Marsellle", "Tarbes" };
		List<String> villes = setInArrayList(arrayVille);
		String PlusGrandeLongueur = "";

		for (int i = 0; i < villes.size(); i++) {
			if (villes.get(i).length() > PlusGrandeLongueur.length()) {
				PlusGrandeLongueur = villes.get(i);
			}
			// mise en majuscules
			villes.set(i, villes.get(i).toUpperCase());
		}

		// retrait des villes commençant par

		Iterator<String> iter = villes.iterator();

		while (iter.hasNext()) {
			String ville = iter.next();
			if (ville.startsWith("N")) {
				iter.remove();
			}
		}

		for (String list : villes) {
			System.out.println(list);
		}
	}

	/**
	 * transforme un tableau en liste
	 * 
	 * @param <T>
	 * @param tableau de valeurs
	 * @return une liste contenant les valeurs du tableau
	 */
	public static <T> List<T> setInArrayList(T[] tableau) {
		List<T> listeRetour = new ArrayList<>();
		for (int i = 0; i < tableau.length; i++) {
			listeRetour.add(tableau[i]);
		}

		return listeRetour;

	}
}
