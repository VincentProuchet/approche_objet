package fr.diginamic.jdr;

import java.util.Random;

public abstract class Personnage {

	private int pointsDeVie;
	
	private int force;
	
	public Personnage(int forceMini, int forceMaxi,int pdvMini,int pdvMaxi) {
		Random rd = new Random();
		this.force = rd.nextInt(forceMini,forceMaxi);
		this.pointsDeVie = rd.nextInt(pdvMini,pdvMaxi);
		
	}
	public int getPointsDeVie() {
		return this.pointsDeVie;
	}
	
	public int getForce() {
		return this.force;
	}
}
