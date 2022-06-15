package fr.diginamic.jdr;

import java.util.Random;

public abstract class Creature {

	private int pointsDeVie;
	
	private int force;
	private int scorePoints = 0;
	
	private Random random;
	
	public Creature(int forceMini, int forceMaxi,int pdvMin,int pdvMaxi) {
		random = new Random();
		this.force = random.nextInt(forceMini,forceMaxi);
		this.pointsDeVie = random.nextInt(pdvMin,pdvMaxi);
		this.scorePoints = 0;
		
	}
	public Creature(int forceMini, int forceMaxi,int pdvMin,int pdvMaxi, int points) {
		random = new Random();
		this.force = random.nextInt(forceMini,forceMaxi);
		this.pointsDeVie = random.nextInt(pdvMin,pdvMaxi);
		this.scorePoints = points;
		
	}
	public int getPointsDeVie() {
		return this.pointsDeVie;
	}
	
	public int getForce() {
		return this.force;
	}
	
	public int attaque() {
		return this.random.nextInt(1,10) + this.force ;	
	}
	public void prendreDegat(int attaqueEnnemie) {
		this.pointsDeVie -= Math.abs(attaqueEnnemie);
		if(this.pointsDeVie<0) {
			this.pointsDeVie = 0;
		}
	}
		
	public int getPoints() {
		return this.scorePoints;
	}
	
}
