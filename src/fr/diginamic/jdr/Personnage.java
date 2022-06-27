package fr.diginamic.jdr;

public class Personnage extends Creature{
	
	static int pdvMin  	=20;
	static int pdvMaxi		=50;
	
	static int forceMini	=12;
	static int forceMaxi	=18;
	public Personnage() {
		super(Personnage.forceMini,Personnage.forceMaxi,Personnage.pdvMin,Personnage.pdvMaxi,0 );
		
		
	}
	
	public void Score(Creature creature) {
		this.scorePoints += creature.getPoints();
	}

}
