package fr.diginamic.recensement;

import java.util.Scanner;

import fr.diginamic.entities.Ville;
/**
 * Classe de traitement 
 * calcule la population d'un département
 * @author Vincent
 *
 */
/**
 * @author Vincent
 *
 */
public class PopulationDepartement extends MenuService {
	private int population = -1 ;
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
				if (v.getCodeDepartement().strip().toLowerCase().equals(this.departementRecherchee)) {
					this.population += v.getPopulationTotale();
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
@Override
	public int getResultat() {
		return this.population ;
	}
	

}
