package fr.diginamic.jdr;

import java.util.Random;
import java.util.Scanner;

public class JeuxDeRoles {
	
	static JeuxDeRoles jeux;
	Scanner UserEntry;
	Random random;
	Personnage joueur;
	Creature ennemie;
	int selection =  0; // selection dans les menus
	
	public static void main(String[] args) {
		
		JeuxDeRoles.jeux = new JeuxDeRoles();
		jeux.creationDePersonnage();
		
		///////////////////////
		// boucle principale //
		///////////////////////
		do {			
			clearConsole();
			jeux.MenuPrincipal();
			try {
				String input = jeux.UserEntry.next();
				jeux.selection = Integer.parseInt(input);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			
		switch(jeux.selection ) {
			case 1:
				jeux.creationDePersonnage();
				jeux.creationEnnemi();
				
				System.out.println("\n Un "
								+ jeux.ennemie.getClass().getSimpleName()
								+ " est devant vous \n"
						);
				break;
			case 2:
				do {
					jeux.combat();
				}while(jeux.joueur.getPointsDeVie()>0);
				break;			
			case 3:
				jeux.afficheScore();
				break;
			case 4:
				jeux.quitterJeux();			
				break;
			default:
				break;
		}
		}while(jeux.selection != 4);
	}
	/** CONSTRUCTEUR
	 * 
	 */
	public JeuxDeRoles() {
		this.UserEntry = new Scanner(System.in);
		this.random = new Random();
		
		
	}
	
	
	public void MenuPrincipal() {
		System.out.println(
				" Que voulez-vous faire ? \n"
				+ 	"1 Créer un personnage \n"
				+ 	"2 Combattre une créature \n"
				+ 	"3 afficher votre score \n"
				+	"4 quitter le programme \n"
		);
	}
	/**
	 * créer un nouveau personnage pour le joueur
	 */
	public void creationDePersonnage() {
		jeux.joueur = new Personnage();
		System.out.println(
				"Personnage Crée \n"
				+"\n force : " + jeux.joueur.getForce()
				+"\n points de vie : " + jeux.joueur.getPointsDeVie()
				+"\n");
		jeux.creationEnnemi();
	}
	/** créer une créature selectionnée aléatoirement
	 * 
	 */
	public void creationEnnemi(){
		
		switch (this.random.nextInt(1, 4)) {
		case 1:
			this.ennemie = new Loup();
			break;
		case 2:
			this.ennemie = new Gobelin();
			break;
		case 3:
			this.ennemie = new Troll();
			break;
		default:
			break;

		}
		
		
	}
	/**
	 * 
	 */
	public void afficheScore() {
		// TODO
		if(jeux.joueur != null) {
			System.out.println(
					"score : " +
					((Personnage) jeux.joueur).getScore()
					+"\n");
		}
	}
	/**
	 * 
	 */
	public void combat() {
		String rapport = "\n Le personnage est mort"
				+ "vous devez en créer un nouveau "
				+ "pour combattre";
		if (this.joueur.getPointsDeVie() > 0) {
			
				int attaqueJoueur = this.joueur.attaque();
				int attaqueEnnemie = this.ennemie.attaque();
				
				// si le joueur remporte la manche
				// oui on donne un petit avantage au joueur
				if (attaqueJoueur >= attaqueEnnemie) {
					this.ennemie.prendreDegat(attaqueJoueur - attaqueEnnemie);
					// si l'ennemi meurt
					if (this.ennemie.getPointsDeVie() <= 0) {
						
						rapport ="\n le "
								+ this.ennemie.getClass().getSimpleName() + " est mort "
								;
						// on attribue les points au personnage
						this.joueur.Score(this.ennemie);
						// on créer un nouvel ennemi
						this.creationEnnemi();
						rapport += "\n Un " 
								+ this.ennemie.getClass().getSimpleName()
								+ " apparait";
						
					}
					else {
						rapport = "\n vous blessez le " 
								+ this.ennemie.getClass().getSimpleName()
								+ "\n il lui reste " 
								+ this.ennemie.getPointsDeVie()
								;
					}
				} 
				// si le joueur perd la manche
				else {
					this.joueur.prendreDegat(attaqueJoueur - attaqueEnnemie);
					rapport = "\n le " 
							+ this.ennemie.getClass().getSimpleName() 
							+ " blesse votre personnage "
							+ "\n il lui reste " 
							+ this.joueur.getPointsDeVie();
					if(this.joueur.getPointsDeVie()<= 0) {
						rapport += "\n"
								+ "votre personage est mort."
								;
					}
				
				}
				System.out.println(rapport);

		
		
		
		}
		// si le personnage est déjà mort
		else {
			System.out.println(rapport);
			
		}
	}
	/**
	 * 
	 */
	public void quitterJeux() {
		//TODO gerer ici toute logique lorsque le joueur quitte le jeu
		System.out.println("Merci d'avoir joué !");
	}
	/**
	 * NOT MINE 
	 * Merci StackOverFlow
	 * https://stackoverflow.com/questions/2979383/how-to-clear-the-console
	 */
	public final static void clearConsole()
	{
	    try
	    {
	        final String os = System.getProperty("os.name");
	        
	        if (os.contains("Windows"))
	        {
	        	 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        }
	        else if (os.contains("Linux"))
	        {
	        	System.out.print("\033\143");
	        }
	        else {
	        	System.out.print('\u000C');
	        }
	    }
	    catch (final Exception e)
	    {
	        //  Handle any exceptions.
	    }
	}
}
	


