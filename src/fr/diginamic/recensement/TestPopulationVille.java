package fr.diginamic.recensement;

import java.io.IOException;
import java.util.Scanner;
/**
 * 
 * @author Vincent
 *
 */
public class TestPopulationVille {
	public 	static  String dataFile = "F:\\dev\\approche_objet\\data";
	public  static String fileName = "recensement.csv";
	private static Recensement enregistrements;

	public static void main(String[] args) throws IOException {
//		Scanner scanner = new Scanner(System.in);
		enregistrements = new Recensement(dataFile+"\\"+fileName);
		PopulationVille ville = new PopulationVille();
		ville.traiter(enregistrements, "Montpellier");
		
		System.out.println(ville.getVille());
		ville.traiter(enregistrements, "Olargues");
		System.out.println(ville.getVille());
		ville.traiter(enregistrements, "Grenoble");
		System.out.println(ville.getVille());
	}
}
