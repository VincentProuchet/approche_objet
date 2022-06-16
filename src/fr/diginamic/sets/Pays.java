package fr.diginamic.sets;

public class Pays {
	private String nom;
	private long nombreHabitants;
	private double pIBParHabitant;
	
	
	
	
	public Pays(String nom, long habitants,double pib) {
		this.nom = nom;
		this.nombreHabitants = habitants;
		this.pIBParHabitant = pib;		
	}
	public Pays(String nom, int habitants,double pib) {
		this.nom = nom;
		this.nombreHabitants = (long)habitants;
		this.pIBParHabitant = pib;
	}
	
	public String getNom() {
		return this.nom;
	}
	public void capitaliserNom() {
		this.nom = this.nom.toUpperCase();
	}
	public long getPopulation() {
		return this.nombreHabitants;
	}
	public double getPIBTotal() {
		return this.pIBParHabitant*this.nombreHabitants;
	}
	public double getPIBPerHabitant() {
		return this.pIBParHabitant;
	}	
	public String toString() {
		return this.nom + " popultation : " +this.nombreHabitants+ " et un PIB "+this.pIBParHabitant + "/habitants";
	}
}
