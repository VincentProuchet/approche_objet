package fr.diginamic.entities;

public class Salarie {

	private String nom;
	private String prenom;
	private double salaire;
	
	
	public Salarie(String[] data) {
	
		this.nom = data[0].toUpperCase();
		this.prenom = data[1].toLowerCase();
		this.salaire = Double.parseDouble(data[2].replaceAll(" ", ""));
		
	}


	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}


	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	

	/**
	 * @return the salaire
	 */
	public double getSalaire() {
		return salaire;
	}


	/**
	 * @param salaire the salaire to set
	 */
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	

}
