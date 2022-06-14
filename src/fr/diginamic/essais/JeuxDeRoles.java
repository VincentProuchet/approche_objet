package fr.diginamic.essais;

import java.util.Scanner;

import fr.diginamic.jdr.Joueur;
import fr.diginamic.jdr.Personnage;

public class JeuxDeRoles {
	
	static JeuxDeRoles jeux;
	Scanner UserEntry;
	Personnage joueur;
	Personnage ennemie;
	int selection =  0; // selection dans les menus
	
	public static void main(String[] args) {
		
		JeuxDeRoles.jeux = new JeuxDeRoles();
		
		
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
				break;
			case 2:
				break;			
			case 3:
				jeux.afficheScore();
				break;
			case 4:
				
			
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
		jeux.joueur = new Joueur();
		System.out.println(
				"Personnage Crée \n"
				+"\n force : " + jeux.joueur.getForce()
				+"\n points de vie : " + jeux.joueur.getPointsDeVie()
				+"\n");
	}
	/**
	 * 
	 */
	public void afficheScore() {
		// TODO
		if(jeux.joueur != null) {
			System.out.println(
					"score : " +
					((Joueur) jeux.joueur).getScore()
					+"\n");
		}
	}
	/**
	 * 
	 */
	public void combat() {
		//TODO logique du combat 
		System.out.println("MORTAL KOMBAT !!!!");
		
	}
	/**
	 * 
	 */
	public void finDuJeux() {
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
	


