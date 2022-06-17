package fr.diginamic.recensement;

import java.io.IOException;
import java.util.Scanner;

public class Application {

	static Application self;
	private int choixMenu;
	private Scanner scanner;
	public static final int CHOIXQUITTER = 9;
	public  String dataFile = "F:\\dev\\approche_objet\\data";
	public  String fileName = "recensement.csv";
	private  Recensement enregistrements;

	public static void main(String[] args) throws IOException {
		
		
		 	
		self = new Application();
		self.enregistrements = new Recensement(self.dataFile+"\\"+self.fileName);
		do {
			
			afficherMenuPrincipal();
			self.getMenuImput();
			switch(self.getChoix()) {
			// population d'une ville donnée 
			case 1:
				PopulationVille ville = new PopulationVille();
				ville.traiter(self.enregistrements,self.scanner);				
				System.out.println(ville.getVille());
				break;
				// population d'un département donné
			case 2:
				break;
				// population d'une région données
			case 3:
				break;
				// les 10 régions plus peuplées
			case 4:
				
				break;
				// les 10 départements plus peuplés d'un département donné
			case 5:
				
				break;
				// les 10 villes plus peuplés d'un département donné
			case 6:
				break;
				// les 10 villes plus peuplées d'une région donné 
			case 7:
				
				break;
				// les 10 plus peuplées
			case 8:
				break;
				
			default:
				// rien
				break;
			
			}
		
		
		
		}while(self.getChoix() != CHOIXQUITTER);

	}

	public static void afficherMenuPrincipal() {
		System.out.println("Bienvenu dans le service de recensement." 
				+ "\n \n" + "De quoi avez-vous besoin ?" + "\n\n"
				+ "- 1. Population d’une ville donnée\r\n" 
				+ "- 2. Population d’un département donné\r\n"
				+ "- 3. Population d’une région donnée\r\n" 
				+ "- 4. Afficher les 10 régions les plus peuplées\r\n"
				+ "- 5. Afficher les 10 départements les plus peuplés\r\n"
				+ "- 6. Afficher les 10 villes les plus peuplées d’un département\r\n"
				+ "- 7. Afficher les 10 villes les plus peuplées d’une région\r\n"
				+ "- 8. Afficher les 10 villes les plus peuplées de France\r\n" 
				+ "- 9. Sortir");

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
	
	/** Permet de prendre une entrée utilisateur
	 * seulement pour les nombres
	 * 
	 */
	private void getMenuImput() {
		self.choixMenu = 0;
		try {
			String input = self.scanner.next();
			self.choixMenu = Integer.parseInt(input);
		}
		
		
		catch (Exception e) {
			System.out.println(" Merci de n'entrer que des chiffres ");
		}
	}
	
}
