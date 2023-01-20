package fr.diginamic.recensement;

import java.util.Scanner;
/**
 * classe de service 
 * doit être dérivée pour être utilisée
 * le but est d'avoir une classe contenant un code commun pour la gestion des entrées utilisateur
 * 
 *   
 * @author Vincent
 *
 */
public abstract class MenuService {
	/**
	 * type d'éntrée saisie par l'utilisateur
	 */
	protected InputType inputType = InputType.Invalid;

	/**
	 * traite les donnée de Recensement 
	 * @param recensement les données chargée par le programme
	 * @param scanner pour l'entrée utilisateur
	 */
	public abstract void traiter(Recensement recensement, Scanner scanner);

	 
	/**
	 * chargé de qualifier l'entrée utilisateur
	 * serviras à traiter des commandes spécifiques
	 * @param scanner
	 * @return terme recherché
	 */
	protected String getUserInput(Scanner scanner) {
		this.inputType = InputType.Invalid;
		String Recherche ="Rien";
		Recherche = scanner.nextLine().trim().toLowerCase();
		System.out.println("\n terme recherché : " + Recherche);
		
		if (Recherche.length() > 2) {
			this.inputType = InputType.Nom;
		} else if (!Recherche.equals("0")) {
			this.inputType = InputType.Code;
		} else {			
			System.out.println("Entrée non valide");
		}
		
		return Recherche;


	}
	
	/**
	 * fonction d'affichage du résultat
	 * exécute la mise en forme des données
	 * 
	 */
	public void afficher() {
		
	}
	

	/**
	 * GETTER
	 * @return population du département
	 * -1 si le tratement n'a pas été effectué 
	 */
	public int getResultat() {
		return -1 ;
	}
	
}
