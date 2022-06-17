package fr.diginamic.essais;

import fr.diginamic.entities.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdressePostale adresse1 = new AdressePostale(1, " de la boustiffaille",34500,"Béziers");
		AdressePostale adresse2 = new AdressePostale(6, " de la bataille en braise", 34420, "Portiragnes");
		
		
		adresse1.AfficheAdresse();
		
		adresse2.AfficheAdresse();
	}

}
