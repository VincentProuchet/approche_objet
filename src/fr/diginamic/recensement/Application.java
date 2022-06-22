package fr.diginamic.recensement;

import java.io.IOException;
import java.util.Scanner;

public class Application {

	static Application self;
	private ApplicationState etat = ApplicationState.Demarrage;
	private int choixMenu;
	private Scanner scanner;
	public String dataFile = "F:\\dev\\approche_objet\\data";
	public String fileName = "recensement.csv";
	private Recensement enregistrements;

	public static void main(String[] args) throws IOException {

		System.out.println("Bienvenu dans le service de recensement.");
		self = new Application();
		self.enregistrements = new Recensement(self.dataFile + "\\" + self.fileName);
		self.etat = ApplicationState.AfficherMenuPrincipal;
		do {
			// permet de ne pas ré-afficher systématiquement le menu principal
			if (self.etat == ApplicationState.AfficherMenuPrincipal) {
				afficherMenuPrincipal();
				self.etat = ApplicationState.PrendreSaisieUtilisateur;
			}
			// permet de ne pas redemander une saisie dans le cas ou l'utilisateur
			// souhaiterais
			// faire le même type d'opération
			if (self.etat == ApplicationState.PrendreSaisieUtilisateur) {
				self.getMenuImput();
			}
			switch (self.getChoix()) {
			// population d'une ville donnée
			case 1:
				PopulationVille ville = new PopulationVille();
				ville.traiter(self.enregistrements, self.scanner);
				System.out.println(ville.getVille());
				self.etat = ApplicationState.Continuer;
				break;
			// population d'un département donné
			case 2:
				PopulationDepartement departement = new PopulationDepartement();
				departement.traiter(self.enregistrements, self.scanner);
				System.out.println(departement.getResultat());
				self.etat = ApplicationState.Continuer;
				break;
			// population d'une région données
			case 3:
				PopulationRegion region = new PopulationRegion();
				region.traiter(self.enregistrements, self.scanner);
				System.out.println(region.getResultat() + " habitants");
				self.etat = ApplicationState.Continuer;
				break;
			// les 10 régions plus peuplées
			case 4:
				RegionsPlusPeuplee regionPP = new RegionsPlusPeuplee();
				regionPP.traiter(self.enregistrements, self.scanner);
				regionPP.afficher();
				self.etat = ApplicationState.PrendreSaisieUtilisateur;
				break;
			// les 10 départements plus peuplés d'une région donnée
			case 5:
				DepartementPlusPeupleDeRegion depPPR = new DepartementPlusPeupleDeRegion();
				depPPR.traiter(self.enregistrements, self.scanner);
				depPPR.afficher();
				self.etat = ApplicationState.Continuer;
				break;
			// les 10 villes plus peuplés d'un département donné
			case 6:
				VillePlusPleupleDeDepartement villesPPD = new VillePlusPleupleDeDepartement();
				villesPPD.traiter(self.enregistrements, self.scanner);
				villesPPD.afficher();
				self.etat = ApplicationState.Continuer;
				break;
			case 7:
				VillesPlusPeupleRegion villesPPR = new VillesPlusPeupleRegion();
				villesPPR.traiter(self.enregistrements, self.scanner);
				villesPPR.afficher();
				self.etat = ApplicationState.Continuer;
				break;
			// les 10 ville les plus peuplées du pays
			case 8:
				VillesPlusPeuple villesPPP = new VillesPlusPeuple();
				villesPPP.traiter(self.enregistrements, self.scanner);
				villesPPP.afficher();
				self.etat = ApplicationState.Continuer;
				break;
			case 9:
				self.etat = ApplicationState.Fermeture;
				self.scanner.close();
				break;
			default:
				self.etat = ApplicationState.PrendreSaisieUtilisateur;
				break;

			}
			if (self.etat == ApplicationState.Continuer) {

				self.continuer();
			}

		} while (self.etat != ApplicationState.Fermeture);

	}

	public static void afficherMenuPrincipal() {
		System.out.println("" + "\n \n" + "- 1. Population d’une ville donnée\r\n"
				+ "- 2. Population d’un département donné\r\n" + "- 3. Population d’une région donnée\r\n"
				+ "- 4. Afficher les 10 régions les plus peuplées\r\n"
				+ "- 5. Afficher les 10 départements les plus peuplés\r\n"
				+ "- 6. Afficher les 10 villes les plus peuplées d’un département\r\n"
				+ "- 7. Afficher les 10 villes les plus peuplées d’une région\r\n"
				+ "- 8. Afficher les 10 villes les plus peuplées de France\r\n" + "- 9. Sortir");

	}

	public static Application get() {
		if (self != null) {
			return self;
		}
		return new Application();

	}

	public int getChoix() {
		return this.choixMenu;
	}

	private Application() {
		this.choixMenu = 0;
		this.scanner = new Scanner(System.in);
	}

	/**
	 * Permet de prendre une entrée utilisateur seulement pour les nombres
	 * 
	 */
	private void getMenuImput() {
		this.choixMenu = 0;
		do {
			System.out.println(" Entrez le numéro de votre action :");
			String input = self.scanner.nextLine().trim().toLowerCase();

			switch (input) {
			case "choix":
			case "list":
				this.etat = ApplicationState.AfficherMenuPrincipal;
				this.choixMenu = 10;
				break;
			case "exit":
				this.etat = ApplicationState.Fermeture;
				this.choixMenu = 9;
				break;
			default:
				try {

					self.choixMenu = Integer.parseInt(input);
				}

				catch (Exception e) {
					System.out.println(" Merci de n'entrer que des chiffres ");
				}
			}
		} while (this.etat != ApplicationState.PrendreSaisieUtilisateur);
	}

	/**
	 * demande et attend une saisie utilisateur pour savoir si il souhaite continuer
	 * un refus entraineras l'arrêt du programme.
	 */
	private void continuer() {
		this.choixMenu = 0;
		System.out.println("continuer y/n ?");
		try {
			String input = self.scanner.nextLine().trim().toLowerCase();

			switch (input) {

			case "n":
			case "no":
			case "nope":
				this.etat = ApplicationState.Fermeture;
				break;
			default:
				this.etat = ApplicationState.PrendreSaisieUtilisateur;
				break;

			}
		}

		catch (Exception e) {
			System.out.println(" Merci de n'entrer que des chiffres ");
		}
	}

}
