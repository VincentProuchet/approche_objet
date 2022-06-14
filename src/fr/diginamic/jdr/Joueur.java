package fr.diginamic.jdr;

public class Joueur extends Personnage{
	int score;
	static int pdvMin  	=20;
	static int pdvMaxi		=50;
	
	static int forceMini	=12;
	static int forceMaxi	=18;
	public Joueur() {
		super(Joueur.forceMini,Joueur.forceMaxi,Joueur.pdvMin,Joueur.pdvMaxi );
		this.score = 0;
		
		
	}
	public int getScore() {
		return this.score;
	}

}
