package fr.diginamic.recensement;

import java.io.IOException;

public class TestPouplationDepartement {

	
		public 	static  String dataFile = "F:\\dev\\approche_objet\\data";
		public  static String fileName = "recensement.csv";
		private static Recensement enregistrements;

		public static void main(String[] args) throws IOException {
//			Scanner scanner = new Scanner(System.in);
			enregistrements = new Recensement(dataFile+"\\"+fileName);
			PopulationDepartement ville = new PopulationDepartement();
			// à garder pour TestRegion
//			ville.traiter(enregistrements, "La Réunion");
//			System.out.println(ville.getResultat());
//			ville.traiter(enregistrements, "Nouvelle-Aquitaine");
//			System.out.println(ville.getResultat());
//			ville.traiter(enregistrements, "Occitanie");
//			System.out.println(ville.getResultat());
//			ville.traiter(enregistrements, "Auvergne-Rhône-Alpes");
//			System.out.println(ville.getResultat());
			ville.traiter(enregistrements, "01");
			System.out.println(ville.getResultat());
			ville.traiter(enregistrements, "34");
			System.out.println(ville.getResultat());
			ville.traiter(enregistrements, "71");
			System.out.println(ville.getResultat());
			
		}

}
