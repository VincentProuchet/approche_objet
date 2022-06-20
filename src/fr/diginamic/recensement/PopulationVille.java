package fr.diginamic.recensement;

import java.util.Scanner;

import fr.diginamic.entities.Ville;

public class PopulationVille extends MenuService {
	private Ville resultat;
	private String villeRecherchee;

	public void traiter(Recensement donnees, Scanner scanner) {
		this.resultat = null;
		this.villeRecherchee = this.getUserInput(scanner);
		
		for (Ville v : donnees.getVilles()) {
			if (v.getNom().strip().toLowerCase().equals(villeRecherchee)) {
				this.resultat = v;
			}
		}

	}	

	public Ville getVille() {
		return this.resultat;
	}
}
