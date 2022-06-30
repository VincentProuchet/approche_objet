package fr.diginamic.jdr;

import java.util.Random;
import java.util.Scanner;

/* Classe principale du package
 * @author Vincent
 *
 */
public class JeuxDeRoles {
	
	/** singleton de lui-même */
	static JeuxDeRoles jeux;
	/** Entrée utilisateur */
	Scanner UserEntry;
	/** random pour la génération  */
	Random random;
	/** instance du joueur */
	Personnage joueur;
	/** ennemi courant */
	Creature ennemie;
	/** gestion de la selection des menus */
	int selection =  0; 
	
	public static void main(String[] args) {
		// on commence par créer l'instance
		JeuxDeRoles.jeux = new JeuxDeRoles();
		
		
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
	private JeuxDeRoles() {
		this.UserEntry = new Scanner(System.in);
		this.random = new Random();
		
		
	}
	
	/**affiche un menu dans la console
	 * 
	 */
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
	 * et affiche ses statistique
	 * TODO séparer les deux événements 
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
	 * 	et affiche le  nom de sa classe
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
	/** affiche le score
	 * 
	 */
	public void afficheScore() {
		if(jeux.joueur != null) {
			System.out.println(
					"Vous avez : " +
					((Personnage) jeux.joueur).getScorePoints()
					+" points \n");
		}
	}
	/** execute un combat
	 * entre this.joueur et this.ennemy
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
				} 
				// si le joueur perd la manche
				else {
					this.joueur.prendreDegat(attaqueJoueur - attaqueEnnemie);
					// si le joueur est mort
					if(this.joueur.getPointsDeVie()<= 0) {
						rapport = "\n votre personage est mort."
								+ "\n vous avons gagné "+ this.joueur.getScorePoints()+" points"
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
	/** affiche un rapport du combat lorsque le joueur vainc une créature.
	 * 
	 */
	public void rapportDeCombat() {
		String rapport = "Vous avez vaincu le "+ this.ennemie.getClass().getSimpleName()
				+ "\n et gagné "+ this.ennemie.getScorePoints() +" points"
				+ "\n votre score et de "+ this.joueur.getScorePoints() + " points";
		
		System.out.println(rapport);
				
				
		
	}
	/** 
	 * execute les taches de sauvegardes
	 * et affiche un gentil message 
	 * en console
	 */
	public void quitterJeux() {
		//TODO gerer ici toute logique lorsque le joueur quitte le jeu
		System.out.println("Merci d'avoir joué !");
	}

}
	


