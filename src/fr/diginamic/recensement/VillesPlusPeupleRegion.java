package fr.diginamic.recensement;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import fr.diginamic.entities.Ville;
import fr.diginamic.tri.TriType;
import fr.diginamic.tri.VilleComparator;

/**
 * Classe de traitement
 * 
 * calcule la ville la plus peuplé d'une région
 * 
 * @author Vincent
 *
 */
public class VillesPlusPeupleRegion extends MenuService {

	/** villes */
	public List<Ville> villes;
	/** region */
	public Region region;
	/** listeSize */
	public int listeSize = 10;
	/** dapartementRecherchee */
	public String dapartementRecherchee;

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		this.region = null;
		System.out.println("Quelle Région voulez-vous ? \n");
		this.dapartementRecherchee = this.getUserInput(scanner);
		// on parcours les régions
		for (Region d : recensement.getRegions()) {
			if (d.nom().equalsIgnoreCase(dapartementRecherchee) || d.code().equals(dapartementRecherchee)) {
				this.region = d;
				break;
			}
		}
		// si une région est trouvée
		if (this.region != null) {
			// on y récupère la liste à trier
			this.villes = new ArrayList<Ville>(this.region.villes());
			// puis on la trie
			this.villes.sort(new VilleComparator(TriType.ParPopulation));
		}

	}

	@Override
	public void afficher() {

		if (this.region != null) {

			System.out.println(" Région trouvée : " + this.region.nom() + "\n"
					+ "___________________________________________________");
			Iterator<Ville> iterVille = this.villes.iterator();

			int i = 0;
			while (iterVille.hasNext() && i < listeSize) {
				Ville ville = iterVille.next();

				System.out.println(ville + "__________________ "
						+ NumberFormat.getInstance(Locale.FRANCE).format(ville.getPopulationTotale()) + " habitants");
				i++;
			}
		} else {
			System.out.println("\n Aucune Région ne correspond à la recherche ");
		}
	}

}