package fr.diginamic.recensement;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import fr.diginamic.entities.Ville;
import fr.diginamic.tri.DepartmentComparator;
import fr.diginamic.tri.TriType;
import fr.diginamic.tri.VilleComparator;

public class VillePlusPleupleDeDepartement extends MenuService{

	public List<Ville> villes;
	public Departement departement;
	public int listeSize = 10;
	public String dapartementRecherchee;

	

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		this.departement = null;
		System.out.println("Quelle Région voulez-vous ? \n");
		this.dapartementRecherchee = this.getUserInput(scanner);
		for (Departement d : recensement.getDepartement()) {
			if (d.nom().equalsIgnoreCase(dapartementRecherchee) || d.codeDepartement().equals(dapartementRecherchee)) {
				this.departement = d;
				break;
			}
		}
		if (this.departement != null) {
			this.villes = new ArrayList<Ville>(this.departement.villes());
			this.villes.sort(new VilleComparator(TriType.ParPopulation));
		}

	}

	public void afficher() {

		if (this.departement != null) {
			Iterator<Ville> iterVille = this.villes.iterator();

			int i = 0;
			while (iterVille.hasNext() && i < listeSize) {
				Ville ville = iterVille.next();

				System.out.println(ville + "__________________ "
						+ NumberFormat.getInstance(Locale.FRANCE).format(ville.populationTotale()) + " habitants");
				i++;
			}
		} else {
			System.out.println("\n Aucuns Départements ne correspond à la recherche ");
		}
	}

}
