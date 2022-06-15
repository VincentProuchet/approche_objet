package fr.diginamic.jdr;

public class Personnage extends Creature{
	int score;
	static int pdvMin  	=20;
	static int pdvMaxi		=50;
	
	static int forceMini	=12;
	static int forceMaxi	=18;
	public Personnage() {
		super(Personnage.forceMini,Personnage.forceMaxi,Personnage.pdvMin,Personnage.pdvMaxi );
		this.score = 0;
		
		
	}
	public int getScore() {
		return this.score;
	}
	public void Score(Creature creature) {
		this.score += creature.getPoints();
	}

}
