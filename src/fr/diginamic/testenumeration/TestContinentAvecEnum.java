package fr.diginamic.testenumeration;

import java.util.ArrayList;
import java.util.List;

import fr.diginamic.entities.Ville;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		List <Ville> villes  = new ArrayList<>();
		villes.add(new Ville("New York",Continent.AMERIQUENORD));
		villes.add(new Ville("Paris",Continent.EUROPE));
		villes.add(new Ville("Pékin",Continent.ASIE));
		villes.add(new Ville("Moscou",Continent.ASIE));
		villes.add(new Ville("Berlin",Continent.EUROPE));
		villes.add(new Ville("Sydney",Continent.AUSTRALIE));
		villes.add(new Ville("Sao paulo",Continent.AMERIQUESUD));
		villes.add(new Ville("Dakar",Continent.AFRIQUE));
		
		
		
		for (Ville v: villes) {
			System.out.println(v);
		}
		
	}

}
