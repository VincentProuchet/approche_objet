package entities;

import entities2.Personnes;

public class TestPersonnes {

	public static void main(String[] args) {
		
		Personnes humain1 = new Personnes();
		Personnes humain2 = new Personnes();
		
		
		humain1.nom = "Ericson";
		humain1.prenom = "Mike";
		humain1.adresse.numeroDeRue = 1;
		humain1.adresse.rue = " de la boustiffaille";
		humain1.adresse.codePostal = 34500;
		humain1.adresse.ville = "Béziers";
		
		
		
		
		humain2.nom = "Shlassosvensky";
		humain2.prenom = "Piotr";
		humain2.adresse.numeroDeRue = 6;
		humain2.adresse.rue = " de la bataille en braise";
		humain2.adresse.codePostal = 34420;
		humain2.adresse.ville = "Portiragnes";
		
		
	}

}
