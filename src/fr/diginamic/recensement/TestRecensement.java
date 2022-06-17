package fr.diginamic.recensement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import fr.diginamic.entities.Ville;

public class TestRecensement {

	public static void main(String[] args) throws IOException {
		String dataFile = "F:\\dev\\approche_objet\\data";
		String fileName = "recensement.csv";
		
		Recensement records = new Recensement(dataFile+"\\"+fileName);		
		// un jolie ligne d'entête pour mon tableau excel
		//newLignes.add(" nom de la commune ; code département; Région; population totale;");		
		
		consoleOut(records.getVilles());
	}
	/**
	 * Affiche le contenu de villes dans la console
	 * sers au test
	 * 
	 * @param <T>
	 * @param lines
	 */
	public static void consoleOut(List<Ville> villes) {
		
		Iterator<Ville> iter = villes.iterator();
		iter.next();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	
}
