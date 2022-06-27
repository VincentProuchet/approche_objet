package fr.diginamic.testenumeration;

public class TesteEnumeration {

	public static void main(String[] args) {
		
		for(Saison s: Saison.values()) {
			System.out.println(s);
		}
		System.out.println("_____________________________________________________________________________");
		
		System.out.println(Saison.HIVER.getNom());
		System.out.println(Saison.ETE.nom);
		
		String libele = "Hiver";
		Saison saison =  Saison.getSaison(libele);
		System.out.println(saison);
		
	
	}
}
