package fr.diginamic.recensement;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import fr.diginamic.entities.Ville;
import fr.diginamic.tri.RegionComparator;
import fr.diginamic.tri.TriType;

public class RegionsPlusPeuplee extends MenuService {
	public List<Region> regions;
	public int listeSize = 10;

	public RegionsPlusPeuplee() {
	}

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		this.regions = new ArrayList<Region>(recensement.getRegions());
		this.regions.sort(new RegionComparator(TriType.ParPopulation));

	}
	public void afficher() {
		Iterator<Region> iterRegion = this.regions.iterator();
		
		int i=0;
		while(iterRegion.hasNext()&& i<listeSize) {
			Region region = iterRegion.next();
			
			System.out.println(region  +"__________________ "+NumberFormat.getInstance(Locale.FRANCE).format(region.population()) +" habitants");
			i++;
		}
		
	}
	
	
	
	
	
	public void afficherTout() {
		for (Region r: this.regions) {
			System.out.println(r.nom()+"\n"
					+ "-------------------------------------------------"
					);
			for(Departement d:r.listeDepartement() ) {
				System.out.println("\t"+d.codeDepartement()+"\n"
						+ "-----------------------------------------------"
						);
				
				for(Ville v:d.villes()) {
					System.out.println("\t\t"+v.getNom());
				}
			}
			System.out.println("----------------------------------------------");
		}
		
		
	}

}
