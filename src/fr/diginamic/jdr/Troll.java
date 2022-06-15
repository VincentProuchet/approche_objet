package fr.diginamic.jdr;

public class Troll extends Creature {

	static int pdvMin  		=20;
	static int pdvMaxi		=30;
	
	static int forceMini	=10;
	static int forceMaxi	=15;
	
	public Troll() {
		super(forceMini, forceMaxi, pdvMin, pdvMaxi,5);
	}

}
