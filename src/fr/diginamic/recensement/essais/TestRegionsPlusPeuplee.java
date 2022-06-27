package fr.diginamic.recensement.essais;

import java.io.IOException;
import java.util.Scanner;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.RegionsPlusPeuplee;

public class TestRegionsPlusPeuplee {
	public 	static  String dataFile = "F:\\dev\\approche_objet\\data";
	public  static String fileName = "recensement.csv";
	private static Recensement enregistrements;
	public static void main(String[] args) throws IOException {
		enregistrements = new Recensement(dataFile+"\\"+fileName);
		RegionsPlusPeuplee regions = new RegionsPlusPeuplee();
		regions.traiter(enregistrements, new Scanner(System.in));
		regions.afficher();
	}

}
