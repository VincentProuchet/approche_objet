package fr.diginamic.jdr;
/** 
 * Ils ont un Troll
 * @author Vincent
 *	Oui il y a de la répétition de propriétés entre les classes
 *	il me faudras un moyen de les charger par un fichier
 *	du XML ce serait pas mal
 */
public class Troll extends Creature {

	/** pdvMin */
	static int pdvMin  		=20;
	/** pdvMaxi */
	static int pdvMaxi		=30;
	
	/** forceMini */
	static int forceMini	=10;
	/** forceMaxi */
	static int forceMaxi	=15;
	
	/** Constructeur
	 * 
	 */
	public Troll() {
		super(forceMini, forceMaxi, pdvMin, pdvMaxi,5);
	}

}
