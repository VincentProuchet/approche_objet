package fr.diginamic.listes;

public class Ville {
	private String nom;
	private long nombreHabitant;
	
	/**
	 * 
	 * @param nom
	 * @param nbhabitant
	 */
	public Ville(String nom, long nbhabitant) {
		this.nom = nom;
		this.nombreHabitant = nbhabitant;
		
		
	}
	public Ville(String nom, int nbhabitant) {
		this.nom = nom;
		this.nombreHabitant = (long) nbhabitant;
		
		
	}
	
	public Long getPopulation() {
		return this.nombreHabitant;
	}
	public String getNom() {
		return this.nom;
	}
	public void capitalizeNom() {
		this.nom = this.nom.toUpperCase();
	}
}
