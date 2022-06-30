package fr.diginamic.jdr;

/** 
 * des loups
 * @author Vincent
 *	Oui il y a de la répétition de propriétés entre les classes
 *	il me faudras un moyen de les charger par un fichier
 *	du XML ce serait pas mal
 */
public class Loup extends Creature {

	/** pdvMin */
	static int pdvMin  	=5;
	/** pdvMaxi */
	static int pdvMaxi		=10;
	
	/** forceMini */
	static int forceMini	=3;
	/** forceMaxi */
	static int forceMaxi	=8;
	
	/** Constructeur
	 * 
	 */
	public Loup() {
		super(forceMini, forceMaxi, pdvMin, pdvMaxi,1);
	}

}
