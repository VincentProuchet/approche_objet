package fr.diginamic.recensement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import fr.diginamic.entities.Ville;
import fr.diginamic.tri.DepartmentComparator;
import fr.diginamic.tri.RegionComparator;
import fr.diginamic.tri.TriType;
import fr.diginamic.tri.VilleComparator;


public class TestRecensement {

	public static void main(String[] args) throws IOException {
		String dataFile = "F:\\dev\\approche_objet\\data";
		String fileName = "recensement.csv";
		
		Recensement records = new Recensement(dataFile+"\\"+fileName);		
		TestRecensement rec = new TestRecensement(records);
		
	}
	public TestRecensement(Recensement records) {
		// un jolie ligne d'entête pour mon tableau excel
		//newLignes.add(" nom de la commune ; code département; Région; population totale;");		
		System.out.println("villes");
		List<Ville> villes =new ArrayList<>(records.getVilles()); 
		villes.sort(new VilleComparator(TriType.ParRegion));
		consoleOut(villes);
		System.out.println(
				"____________________________________________________\n"
			+ 	"Départements \n"
			+ 	"_____________________________________________________");
		List<Departement> departements =new ArrayList<>(records.getDepartement()); 
		departements.sort(new DepartmentComparator());
		consoleOut(departements);
		System.out.println(
					"____________________________________________________\n"
				+ 	"Regions \n"
				+ 	"_____________________________________________________");
		List<Region> regions =new ArrayList<>(records.getRegions()); 
		regions.sort(new RegionComparator(TriType.ParNom));
		consoleOut(regions);
	}
	
	
	/**
	 * Affiche le contenu de villes dans la console
	 * sers au test
	 * @param <T>
	 * 
	 * @param <T>
	 * @param lines
	 */
	public static <T> void consoleOut(List<T> villes) {
		
		Iterator<T> iter = villes.iterator();
		 
		while(iter.hasNext()) {
			T value = iter.next();
			System.out.println(value);
		}
	}public static <T> void consoleOut(HashSet<T> villes) {
		
		Iterator<T> iter = villes.iterator();
		
		while(iter.hasNext()) {
			T value = iter.next();
			System.out.println(value);
		}
	}
	
}
