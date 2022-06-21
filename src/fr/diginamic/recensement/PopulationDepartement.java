package fr.diginamic.recensement;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import fr.diginamic.entities.Ville;

public class PopulationDepartement extends MenuService {
	private int population;
	private String departementRecherchee;
	

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		this.population = 0;
		System.out.print("Quelle Département voulez-vous ? ");
		this.departementRecherchee = this.getUserInput(scanner);
		// si la recherche ressemble à un code
		switch (this.inputType) {

		case Code:
			for (Ville v : recensement.getVilles()) {
				if (v.codeDeDepartement().strip().toLowerCase().equals(this.departementRecherchee)) {
					this.population += v.getPopulation();
				}
			}
			break;
		case Nom:
			System.out.println("Le système ne peux faire de recherche que sur les codes des départements");
		default:
			System.out.println("Entrée non valide");
			break;

		}

	}

	public int getResultat() {
		return this.population ;
	}
	

}
