package fr.diginamic.recensement.essais;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import fr.diginamic.recensement.PopulationRegion;
import fr.diginamic.recensement.Recensement;

public class TestPopulationRegion {
	public 	static  String dataFile = "F:\\dev\\approche_objet\\data";
	public  static String fileName = "recensement.csv";
	private static Recensement enregistrements;

	public static void main(String[] args) throws IOException {
//		Scanner scanner = new Scanner(System.in);
		enregistrements = new Recensement(dataFile+"\\"+fileName);
		PopulationRegion region = new PopulationRegion();
		// à garder pour TestRegion
		region.traiter(enregistrements,new Scanner("La Réunion"));
		System.out.println(NumberFormat.getInstance(Locale.FRANCE).format(region.getResultat()));
		region.traiter(enregistrements, new Scanner("Nouvelle-Aquitaine"));
		System.out.println(NumberFormat.getInstance(Locale.FRANCE).format(region.getResultat()));
		region.traiter(enregistrements, new Scanner("Occitanie"));
		System.out.println(NumberFormat.getInstance(Locale.FRANCE).format(region.getResultat()));
		region.traiter(enregistrements, new Scanner("Auvergne-Rhône-Alpes"));
		System.out.println(NumberFormat.getInstance(Locale.FRANCE).format(region.getResultat()));
		region.traiter(enregistrements, new Scanner(System.in));
		System.out.println(NumberFormat.getInstance(Locale.FRANCE).format(region.getResultat()));
		
	}
}
