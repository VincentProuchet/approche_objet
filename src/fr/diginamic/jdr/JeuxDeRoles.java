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
		//jeux.creationDePersonnage();
		
		///////////////////////
		// boucle principale //
		///////////////////////
		do {			
			
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
				break;
			case 2:
				if (jeux.joueur != null) {
					// QoL
					// boucle automatique
					//
					do {
						jeux.combat();
					} while (jeux.joueur.getPointsDeVie() > 0);
				}
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
		String rapport = "\n Un " 
				+ this.ennemie.getClass().getSimpleName()
				+ " apparait";
		System.out.println(rapport);
		
	}
	/**
	 * 
	 */
	public void afficheScore() {
		// TODO
		if(jeux.joueur != null) {
			System.out.println(
					"Vous avez : " +
					((Personnage) jeux.joueur).getPoints()
					+" points \n");
		}
	}
	/**
	 * 
	 */
	public void combat() {
		// controle sur etat de l'ennemi avant combatS
		if(this.ennemie == null) {
			this.creationEnnemi();;
		}
		if(this.ennemie.getPointsDeVie()<=0) {
			this.creationEnnemi();
		}
		String rapport = "\n Le personnage est mort"
				+ "vous devez en créer un nouveau "
				+ "pour combattre";
		if (this.joueur.getPointsDeVie() > 0) {
				rapport = "";
				int attaqueJoueur = this.joueur.attaque();
				int attaqueEnnemie = this.ennemie.attaque();
				
				// si le joueur remporte la manche
				// oui on donne un petit avantage au joueur
				if (attaqueJoueur >= attaqueEnnemie) {
					this.ennemie.prendreDegat(attaqueJoueur - attaqueEnnemie);
					// si l'ennemi meurt
					if (this.ennemie.getPointsDeVie() <= 0) {
						
						// on attribue les points au personnage
						this.joueur.Score(this.ennemie);
						// affichage du rapport de combat
						this.rapportDeCombat();						
						// on créer un nouvel ennemi
						this.creationEnnemi();
						
						
					}
					else {
						/*
						 * rapport = "\n vous blessez le " + this.ennemie.getClass().getSimpleName() +
						 * "\n il lui reste " + this.ennemie.getPointsDeVie() ;
						 */
					}
				} 
				// si le joueur perd la manche
				else {
					this.joueur.prendreDegat(attaqueJoueur - attaqueEnnemie);
					/*
					 * rapport = "\n le " + this.ennemie.getClass().getSimpleName() +
					 * " blesse votre personnage " + "\n il lui reste " +
					 * this.joueur.getPointsDeVie();
					 */
					if(this.joueur.getPointsDeVie()<= 0) {
						rapport = "\n votre personage est mort."
								+ "\n vous avons gagné "+ this.joueur.getPoints()+" points"
								+ "\n"
								;
						System.out.println(rapport);
					}
				
				}
		}
		// si le personnage est déjà mort
		else {
			System.out.println(rapport);
			
		}
	}
	
	public void rapportDeCombat() {
		String rapport = "Vous avez vaincu le "+ this.ennemie.getClass().getSimpleName()
				+ "\n et gagné "+ this.ennemie.getPoints() +" points"
				+ "\n votre score et de "+ this.joueur.getPoints() + " points";
		
		System.out.println(rapport);
				
				
		
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
	


