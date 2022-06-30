package fr.diginamic.jdr;

/** 
 * Y'a des Gobelin !?
 * @author Vincent
 *	Oui il y a de la répétition de propriétés entre les classes
 *	il me faudras un moyen de les charger par un fichier
 *	du XML ce serait pas mal
 */
public class Gobelin extends Creature {

	/** pdvMin */
	static int pdvMin  	=10;
	/** pdvMaxi */
	static int pdvMaxi		=15;
	
	/** forceMini */
	static int forceMini	=5;
	/** forceMaxi */
	static int forceMaxi	=10;
	
	/** Constructeur
	 * 
	 */
	public Gobelin() {
		super(forceMini, forceMaxi, pdvMin, pdvMaxi,2);
	
	}

}
