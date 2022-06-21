package fr.diginamic.recensement;

import java.util.Scanner;

public abstract class MenuService {
	protected InputType inputType;

	public abstract void traiter(Recensement recensement, Scanner scanner);

	 
	/*chargé de qualifier l'entrée utilisateur
	 * serviras à traiter des commandes spécifiques
	 * @param scanner
	 * @return
	 */
	protected String getUserInput(Scanner scanner) {
		//Scanner scanner1 =new Scanner(System.in);
<<<<<<< Upstream, based on 505aeee201c44823aeabc80c485db1e1d3ecba91
		String Recherche ="Rien";
		Recherche = scanner.nextLine().trim().toLowerCase();
		System.out.println("\n terme recherché : " + Recherche);
=======
		scanner.nextLine();
		String Recherche = scanner.nextLine().trim().toLowerCase();
		//scanner1.close();
		//System.out.println("terme recherché : " + Recherche);
>>>>>>> 91747a1 TP Recensement Fonctionnalité Regions les plus peuplées terminée
		if (Recherche.length() > 2) {
			this.inputType = InputType.Nom;
		} else if (!Recherche.equals("0")) {
			this.inputType = InputType.Code;
		} else {
			System.out.println("Entrée non valide");
		}
		
		return Recherche;
<<<<<<< Upstream, based on 505aeee201c44823aeabc80c485db1e1d3ecba91

	}
	/**
	 *  Seulement pour tests unitaires
	 * @param scanner
	 * @return
	 */
	protected String getUserInput(String scanner) {
		//Scanner scanner1 =new Scanner(System.in);
		String Recherche = scanner.trim().toLowerCase();
		
		//scanner1.close();
		System.out.println("\n terme recherché : " + Recherche);
		if (Recherche.length() > 2) {
			this.inputType = InputType.Nom;
		} else if (!Recherche.equals("0")) {
			this.inputType = InputType.Code;
		} else {
			System.out.println("Entrée non valide");
		}
		
		return Recherche;
=======
>>>>>>> 91747a1 TP Recensement Fonctionnalité Regions les plus peuplées terminée

	}
}
