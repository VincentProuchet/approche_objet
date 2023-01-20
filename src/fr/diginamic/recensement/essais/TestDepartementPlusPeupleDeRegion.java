package fr.diginamic.recensement.essais;

import java.io.IOException;
import java.util.Scanner;

import fr.diginamic.recensement.DepartementPlusPeupleDeRegion;
import fr.diginamic.recensement.Recensement;
/**
 * classe de test 
 * 
 * @author Vincent
 *
 */
public class TestDepartementPlusPeupleDeRegion {

	public static String dataFile = "F:\\dev\\approche_objet\\data";
	public static String fileName = "recensement.csv";
	private static Recensement enregistrements;

	public static void main(String[] args) throws IOException {
		enregistrements = new Recensement(dataFile + "\\" + fileName);
		
		new TestRecensement(enregistrements);
		DepartementPlusPeupleDeRegion regions = new DepartementPlusPeupleDeRegion();
		regions.traiter(enregistrements, new Scanner("    OccitAnie      "));
		regions.afficher();
		regions.traiter(enregistrements, new Scanner("Hauts-de-france"));
		regions.afficher();
		
		regions.traiter(enregistrements, new Scanner("11"));
		regions.afficher();
		
		
	}

}
