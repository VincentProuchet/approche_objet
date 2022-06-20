package fr.diginamic.recensement;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class TestPouplationDepartement {

	
		public 	static  String dataFile = "F:\\dev\\approche_objet\\data";
		public  static String fileName = "recensement.csv";
		private static Recensement enregistrements;

		public static void main(String[] args) throws IOException {
//			Scanner scanner = new Scanner(System.in);
			enregistrements = new Recensement(dataFile+"\\"+fileName);
			PopulationDepartement ville = new PopulationDepartement();
			
			
			ville.traiter(enregistrements,new Scanner("01"));
			System.out.println(NumberFormat.getInstance(Locale.FRANCE).format(ville.getResultat())+ " habitants" );
			ville.traiter(enregistrements,new Scanner( "34"));
			System.out.println(NumberFormat.getInstance(Locale.FRANCE).format(ville.getResultat())+ " habitants");
			ville.traiter(enregistrements,new Scanner( "71"));
			System.out.println(NumberFormat.getInstance(Locale.FRANCE).format(ville.getResultat())+ " habitants");
			ville.traiter(enregistrements,new Scanner( "158"));
			System.out.println(NumberFormat.getInstance(Locale.FRANCE).format(ville.getResultat())+ " habitants");
		}

}
