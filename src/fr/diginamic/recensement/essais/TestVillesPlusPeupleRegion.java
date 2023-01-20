package fr.diginamic.recensement.essais;

import java.io.IOException;
import java.util.Scanner;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.VillesPlusPeupleRegion;

public class TestVillesPlusPeupleRegion {
	public static String dataFile = "F:\\dev\\approche_objet\\data";
	public static String fileName = "recensement.csv";
	private static Recensement enregistrements;
	
	public static void main(String[] args) throws IOException {

			enregistrements = new Recensement(dataFile + "\\" + fileName);
			
			new TestRecensement(enregistrements);
			VillesPlusPeupleRegion regions = new VillesPlusPeupleRegion();
			regions.traiter(enregistrements, new Scanner("    Occitanie     "));
			regions.afficher();
			regions.traiter(enregistrements, new Scanner("75"));
			regions.afficher();
			regions.traiter(enregistrements, new Scanner("11"));
			regions.afficher();
			
			regions.traiter(enregistrements, new Scanner("45"));
			regions.afficher();
			regions.traiter(enregistrements, new Scanner("île-de-FranCe    "));
			regions.afficher();

	}

}
