package fr.diginamic.tri;

import java.util.Comparator;

import fr.diginamic.entities.Ville;

/**
 * Comparteur 
 * compare les noms 
 * utilise le comparateur de texte
 * @author Vincent
 *
 */
public class ComparatorNom implements Comparator<Ville> {

	@Override
	public int compare(Ville o1, Ville o2) {
		
		return o1.getNom().compareTo(o2.getNom());
	}

}
