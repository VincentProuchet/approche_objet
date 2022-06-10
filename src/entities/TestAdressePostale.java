package entities;

public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdressePostale adresse1 = new AdressePostale();
		AdressePostale adresse2 = new AdressePostale();
							
		adresse1.numeroDeRue = 1;
		adresse1.rue = " de la boustiffaille";
		adresse1.codePostal = 34500;
		adresse1.ville = "Béziers";
		
		adresse2.numeroDeRue = 6;
		adresse2.rue = " de la bataille en braise";
		adresse2.codePostal = 34420;
		adresse2.ville = "Portiragnes";
	}

}
