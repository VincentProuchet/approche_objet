package fr.diginamic.recensement;

import java.util.Scanner;

import fr.diginamic.entities.Ville;

/**
 * Classe de traitement
 * Recherche une ville par le nom
 * @author Vincent
 *
 */
public class PopulationVille extends MenuService {
	private Ville resultat;
	private String villeRecherchee;

	public void traiter(Recensement donnees, Scanner scanner) {
		this.resultat = null;
		System.out.print("Quelle ville voulez-vous ? ");
		this.villeRecherchee = this.getUserInput(scanner);
		
		for (Ville v : donnees.getVilles()) {
			if (v.getNom().strip().toLowerCase().equals(villeRecherchee)) {
				this.resultat = v;
			}
		}

	}
	/**
	 * GETTER 
	 * @return la ville recherchée
	 */
	public Ville getVille() {
		return this.resultat;
	}
}
