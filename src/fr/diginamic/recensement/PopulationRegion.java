package fr.diginamic.recensement;

import java.util.Scanner;

import fr.diginamic.entities.Ville;

public class PopulationRegion extends MenuService {
	private int population;
	private String regionRecherchee;

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		this.population = 0;
		this.regionRecherchee = this.getUserInput(scanner);
		// si la recherche ressemble à un code
		switch (this.inputType) {

		case Code:
			for (Ville v : recensement.getVilles()) {
				if (v.codeDeRegion().strip().toLowerCase().equals(this.regionRecherchee)) {
					this.population += v.getPopulation();
				}
			}
			break;
		case Nom:
			for (Ville v : recensement.getVilles()) {
				if (v.nomRegion().strip().toLowerCase().equals(this.regionRecherchee)) {
					this.population += v.getPopulation();
				}
			}
			break;
		default:
			
			break;

		}
		
	}
	public int getResultat() {
		return this.population ;
	}

}
