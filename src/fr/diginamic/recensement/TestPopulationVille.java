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
		Scanner scanner = new Scanner(System.in);	
		enregistrements = new Recensement(dataFile+"\\"+fileName);
		PopulationVille ville = new PopulationVille();
		ville.traiter(enregistrements, new Scanner("MontPELlier"));
		System.out.println(ville.getVille());
		ville.traiter(enregistrements, new Scanner("olargUes   "));
		System.out.println(ville.getVille());
		ville.traiter(enregistrements,new Scanner( "  grenoble"));
		System.out.println(ville.getVille());
		ville.traiter(enregistrements, new Scanner("	béziers   "));
		System.out.println(ville.getVille());
		ville.traiter(enregistrements, new Scanner("	pia   "));
		System.out.println(ville.getVille());
		ville.traiter(enregistrements, scanner);
		System.out.println(ville.getVille());
	}
}
