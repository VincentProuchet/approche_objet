package fr.diginamic.testenumeration;

public class TesteEnumeration {

	public static void main(String[] args) {
		System.out.println(Saison.HIVER.nom());
		System.out.println(Saison.ETE.nom());
		
		String libele = "Hiver";
		System.out.println(Saison.getSaison(libele));
	}
}
