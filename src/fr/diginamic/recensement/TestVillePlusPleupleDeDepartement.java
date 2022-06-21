package fr.diginamic.recensement;

import java.io.IOException;
import java.util.Scanner;

public class TestVillePlusPleupleDeDepartement {
	public static String dataFile = "F:\\dev\\approche_objet\\data";
	public static String fileName = "recensement.csv";
	private static Recensement enregistrements;

	public static void main(String[] args) throws IOException {
		enregistrements = new Recensement(dataFile + "\\" + fileName);
		
		TestRecensement rec = new TestRecensement(enregistrements);
		VillePlusPleupleDeDepartement regions = new VillePlusPleupleDeDepartement();
		regions.traiter(enregistrements, new Scanner("    34      "));
		regions.afficher();
		regions.traiter(enregistrements, new Scanner("75"));
		regions.afficher();
		regions.traiter(enregistrements, new Scanner("11"));
		regions.afficher();
		
		regions.traiter(enregistrements, new Scanner("45"));
		regions.afficher();
		regions.traiter(enregistrements, new Scanner("sgszgsth"));
		regions.afficher();
		
		
	}

}
