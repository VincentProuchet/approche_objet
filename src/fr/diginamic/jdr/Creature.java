package fr.diginamic.jdr;

import java.util.Random;

/** 
 * Représente une créature 
 * @author Vincent
 *
 */
public abstract class Creature {

	/** pointsDeVie */
	private int pointsDeVie;
	
	/** force */
	private int force;
	/** scorePoints */
	protected int scorePoints = 0;
	
	/** random */
	private Random random;
	
	/** Constructeur
	 * @param forceMini
	 * @param forceMaxi
	 * @param pdvMin
	 * @param pdvMaxi
	 */
	public Creature(int forceMini, int forceMaxi,int pdvMin,int pdvMaxi) {
		random = new Random();
		this.force = random.nextInt(forceMini,forceMaxi);
		this.pointsDeVie = random.nextInt(pdvMin,pdvMaxi);
		this.scorePoints = 0;
		
	}
	/** Constructeur
	 * @param forceMini
	 * @param forceMaxi
	 * @param pdvMin
	 * @param pdvMaxi
	 * @param points
	 */
	public Creature(int forceMini, int forceMaxi,int pdvMin,int pdvMaxi, int points) {
		random = new Random();
		this.force = random.nextInt(forceMini,forceMaxi);
		this.pointsDeVie = random.nextInt(pdvMin,pdvMaxi);
		this.scorePoints = points;
		
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
	/** Getter
	 * @return the pointsDeVie
	 */
	public int getPointsDeVie() {
		return pointsDeVie;
	}
	/** Getter
	 * @return the force
	 */
	public int getForce() {
		return force;
	}
	/** Getter
	 * @return the scorePoints
	 */
	public int getScorePoints() {
		return scorePoints;
	}
		
	
	
}
