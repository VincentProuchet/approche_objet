package fr.diginamic.recensement;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import fr.diginamic.entities.Ville;
import fr.diginamic.tri.RegionComparator;
import fr.diginamic.tri.TriType;

/**
 * Classe de traitement 
 * Calcule et trie les régions les plus peuplées 
 * @author Vincent
 *
 */
public class RegionsPlusPeuplee extends MenuService {
	public List<Region> regions;
	public int listeSize = 10;
	private static String separator = "-------------------------------------------------\n" ;
	
	public RegionsPlusPeuplee() {
	}

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		this.regions = new ArrayList<Region>(recensement.getRegions());
		this.regions.sort(new RegionComparator(TriType.ParPopulation));

	}
	@Override
	public void afficher() {
		Iterator<Region> iterRegion = this.regions.iterator();
		
		int i=0;
		while(iterRegion.hasNext()&& i<listeSize) {
			Region region = iterRegion.next();
			
			System.out.println(region  +"__________________ "+NumberFormat.getInstance(Locale.FRANCE).format(region.population()) +" habitants");
			i++;
		}
		
	}
	
	
	
	
	
	/**
	 * afficheras une liste formatée de toutes les régions en mémoire
	 * utilisé pour le débugging
	 */
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
			System.out.println(separator);
		}
		
		
	}
	/**
	 * refactoring de la fontion afficher
	 * avec une string builder pour de meilleures performances
	 */
	public void afficherTout2() {
		StringBuilder out =new StringBuilder();
		for (Region r: this.regions) {
				out.append(r.nom()).append("\n")
					.append(separator)
					;
			for(Departement d:r.listeDepartement() ) {
				out.append("\t").append(d.codeDepartement()).append("\n\n")
						.append(separator)
						;
				
				for(Ville v:d.villes()) {
					out.append("\t\t").append(v.getNom()).append("\n");
				}
			}
			out.append(separator);
			System.out.println(out.toString());
		}
		
	}

}
