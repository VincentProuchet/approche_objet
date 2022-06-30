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

public class VillesPlusPeuple extends MenuService{

	public List<Ville> villes;
	public int listeSize = 10;

	

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
			// on récupère directement les villes de récensement
			this.villes = new ArrayList<>(recensement.getVilles());
			this.villes.sort(new VilleComparator(TriType.ParPopulation));
		}

	

	public void afficher() {

		if (this.villes != null) {
			
			System.out.println(" les villes les plus peuplées du pays : \n"
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
			System.out.println("\n Aucune villes disponibles ");
		}
	}

}
