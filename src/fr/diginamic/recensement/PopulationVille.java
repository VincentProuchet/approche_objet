package fr.diginamic.recensement;

import java.util.Scanner;

import fr.diginamic.entities.Ville;

public class PopulationVille extends MenuService {
	private Ville resultat;
	private String villeRecherchee;
	
	
	public void traiter(Recensement donnees, Scanner scanner) {
		
		this.getUserImput(scanner);
		for (Ville v: donnees.getVilles()) {
			if(v.getNom().equals(villeRecherchee)) {
				this.resultat = v;
			}			
		}	
	}
	/**utilisée pour dévellopement
	 * 
	 * @param donnees
	 * @param scanner
	 */
	public void traiter(Recensement donnees, String scanner) {
			
			for (Ville v: donnees.getVilles()) {
				if(v.getNom().equals(scanner)) {
					this.resultat = v;
				}			
			}	
		}
	
	public Ville getVille() {
		return this.resultat;
	}
	/** Permet de prendre une entrée utilisateur
	 * seulement pour les nombres
	 * 
	 */
	private void getUserImput(Scanner scanner) {
		try {
			this.villeRecherchee = scanner.next();
					}		
		catch (Exception e) {
			System.out.println(" Merci d'entrer un nom de commune.");
		}
	}
}
