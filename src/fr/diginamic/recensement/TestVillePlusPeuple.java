package fr.diginamic.recensement;

import java.io.IOException;
import java.util.Scanner;

public class TestVillePlusPeuple {
	public static String dataFile = "F:\\dev\\approche_objet\\data";
	public static String fileName = "recensement.csv";
	private static Recensement enregistrements;
	
	public static void main(String[] args) throws IOException {

			enregistrements = new Recensement(dataFile + "\\" + fileName);
			
			//TestRecensement rec = new TestRecensement(enregistrements);
			VillesPlusPeuple regions = new VillesPlusPeuple();
			regions.traiter(enregistrements, new Scanner("    Occitanie     "));
			regions.afficher();

	}
	

}
