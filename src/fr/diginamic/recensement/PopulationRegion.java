package fr.diginamic.recensement;

import java.util.Scanner;

import fr.diginamic.entities.Ville;

/**
 * Classe de traitement 
 * 
 * @author Vincent
 *
 */
public class PopulationRegion extends MenuService {
	private int population = -1;
	private String regionRecherchee;

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		this.population = 0;
		System.out.print("Quelle région voulez-vous ? ");
		
		this.regionRecherchee = this.getUserInput(scanner);
		// si la recherche ressemble à un code
		switch (this.inputType) {

		case Code:
			for (Ville v : recensement.getVilles()) {
				if (v.getCodeDeRegion().strip().toLowerCase().equals(this.regionRecherchee)) {
					this.population += v.getPopulationTotale();
				}
			}
			break;
		case Nom:
			for (Ville v : recensement.getVilles()) {
				if (v.getNomRegion().strip().toLowerCase().equals(this.regionRecherchee)) {
					this.population += v.getPopulationTotale();
				}
			}
			break;
		default:
			
			break;

		}
		
	}
	
	@Override
	public int getResultat() {
		return this.population ;
	}

}
