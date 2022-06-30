package fr.diginamic.entities;
/** TP J3
 * Représente un theatre
 * @author Vincent
 *
 */
public class Theatre {
	private String nom;
	private int capaciteMaxi = 2000; // nb de personne
	private int totalClientsInscripts;
	private double chiffreDAffaire; // recette totales du théatre
	/**
	 * 
	 * @param nom du theatre
	 * @param capaciteMax 
	 */
	public Theatre(String nom,int capaciteMax) {
		this.nom = nom;
	}
	
	/** Inscrit un groupe de clients a la prochaine représentation
	 * 
	 * @param nb de personnes
	 * @param prix unitaire du billet
	 */
	public void Incrire(int nb,double prix) {
		if (this.totalClientsInscripts + nb <= this.capaciteMaxi) {
			this.totalClientsInscripts  += nb;
			this.chiffreDAffaire += prix;
		}
		else {
			System.err.println(" Capacité Maximale dépassé ");
		}
	}
	
	/** Getter
	 * @return le nombre d'inscript à une session
	 */
	public int getTotalInscripts() {
		return this.totalClientsInscripts;
}
	
	/** Getter retourne le chiffre d'affaire de la saison
	 * @return
	 */
	public double Recette() {
		return this.chiffreDAffaire;
	}
	/** Getter
	 * @return le nom du theatre
	 */
	public String getNom() {
		return this.nom;
	}
}