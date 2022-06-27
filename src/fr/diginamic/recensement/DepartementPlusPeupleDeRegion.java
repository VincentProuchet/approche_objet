package fr.diginamic.recensement;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import fr.diginamic.tri.DepartmentComparator;
import fr.diginamic.tri.TriType;

public class DepartementPlusPeupleDeRegion extends MenuService {
	public List<Departement> departements;
	public Region region;
	public int listeSize = 10;
	public String regionRecherchee;

	public DepartementPlusPeupleDeRegion() {
	}

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		this.region = null;
		System.out.println("Quelle Région voulez-vous ? \n");
		this.regionRecherchee = this.getUserInput(scanner);
		for (Region r : recensement.getRegions()) {
			if (r.nom().equalsIgnoreCase(regionRecherchee) || r.code().equals(regionRecherchee)) {
				this.region = r;
				
				break;
			}
		}
		if (this.region != null) {
			this.departements = new ArrayList<Departement>(this.region.listeDepartement());
			this.departements.sort(new DepartmentComparator(TriType.ParPopulation));
		}

	}

	public void afficher() {

		if (this.region != null) {
			
			System.out.println("Pour " + this.region.nom()+"\n");
			Iterator<Departement> iterDepartement = this.departements.iterator();

			int i = 0;
			while (iterDepartement.hasNext() && i < listeSize) {
				Departement dep = iterDepartement.next();

				System.out.println(dep + "__________________ "
						+ NumberFormat.getInstance(Locale.FRANCE).format(dep.population()) + " habitants");
				i++;
			}
		} else {
			System.out.println("\n Aucune region ne correspond à la recherche ");
		}
	}
}
