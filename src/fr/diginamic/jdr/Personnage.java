package fr.diginamic.jdr;

/**
 * le personnage du joueur
 * 
 * @author Vincent Oui il y a de la répétition de propriétés entre les classes
 *         il me faudras un moyen de les charger par un fichier du XML ce serait
 *         pas mal
 */
public class Personnage extends Creature {

	/** pdvMin */
	static int pdvMin = 20;
	/** pdvMaxi */
	static int pdvMaxi = 50;

	/** forceMini */
	static int forceMini = 12;
	/** forceMaxi */
	static int forceMaxi = 18;

	/**
	 * Constructeur
	 * 
	 */
	public Personnage() {
		super(Personnage.forceMini, Personnage.forceMaxi, Personnage.pdvMin, Personnage.pdvMaxi, 0);
	}

	/** augmente le score
	 * @param creature
	 */
	public void Score(Creature creature) {
		this.scorePoints += creature.getScorePoints();
	}

}
