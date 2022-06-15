package fr.diginamic.essais;

import fr.diginamic.jdr.Creature;
import fr.diginamic.jdr.Gobelin;
import fr.diginamic.jdr.Loup;
import fr.diginamic.jdr.Personnage;
import fr.diginamic.jdr.Troll;

/**
 * TP J3 Jeux de role
 * 
 * cette classe ne sert qu'a tester les classes du package JDR en dehors de la
 * logique du jeux
 * 
 * @author Vincent
 *
 */
public class TestJdr {

	public static void main(String[] args) {
	
		Creature[] creatures = null;
		creatures = ajouterCreatures(new Loup(),creatures);
		creatures = ajouterCreatures(new Troll(),creatures);
		creatures = ajouterCreatures(new Gobelin(),creatures);
		creatures = ajouterCreatures(new Personnage(),creatures);
		afficheStats(creatures);
		attaques(creatures);
		attaques(creatures);
		attaques(creatures);
		
	
	}

	/**
	 * 
	 */
	public static void afficheStats(Creature creature) {

		System.out.println("la creature est un "+ creature.getClass().getSimpleName() 
						+ "\n force : "	+ creature.getForce()
						+ "\n points de vie : " + creature.getPointsDeVie() 
						+ "\n"
						);
	}

	/**
	 * 
	 */
	public static void afficheStats(Creature[] creature) {

		for (int i = 0; i < creature.length; i++) {
			if (creature[i] != null) {
				System.out.println("_____________________________________________\n"
						+"la creature est un " + creature[i].getClass().getSimpleName() + "\n force : "
						+ creature[i].getForce()
						+ "\n points de vie : "
						+ creature[i].getPointsDeVie() +
						"\n elle donne : " + creature[i].getPoints() + " points \n"
						+"_____________________________________________"
						);
			}
		}

	}
	/**
	 * 
	 * @param personnage
	 */
	public static void afficherScore(Personnage personnage) {
		System.out.println("\n score : " + personnage.getScore() + "\n");
	}
	/** ajoute l'objet passé en paramètre
	 * dans le tableau passé en paramètre
	 * adapté au contexte
	 * 
	 * @param nouvelleCreature
	 * @param creatures
	 */
	public static Creature[] ajouterCreatures(Creature nouvelleCreature, Creature[] creatures) {
		if (nouvelleCreature != null ) {
			// si le tableau n'a pas de taille
			if (creatures == null) {
				// on créer le tableau avec une taille d'une case
				creatures = new Creature[1];
				// on place la dernière entrée à la fin
				creatures[0] = nouvelleCreature;

			} else {
				// on crée un tableau plus grand
				Creature[] temp = new Creature[creatures.length + 1];
				for (int i = 0; i < creatures.length; i++) {
					temp[i] = creatures[i];
				}

				// on place la nouvelle valeur à la fin
				temp[temp.length - 1] = nouvelleCreature;
				// et on écrase l'ancien tableau trop petit
				creatures = temp;
				// le garbage collector s'occuperas du reste
			}
		}
		return creatures;
	}
	
	
	public static void attaques(Creature[] creature) {
		for (int i = 0; i < creature.length; i++) {
			if (creature[i] != null) {
				System.out.println("le " + creature[i].getClass().getSimpleName() + "attaque "
						+ creature[i].attaque()
						);
			}
		}

	}
	
}