package entities;
/** TP J3
 * 
 * @author Vincent
 *
 */
public class Theatre {
	private String nom;
	private int capaciteMaxi = 2000; // nb de personne
	private int totalClientsInscripts;
	private double chiffreDAffaire; // recette totales du théatre
	/**	 
	 * @param nom du theatre
	 */
	public Theatre(String nom) {
		this.nom = nom;
	}
	
	public void Incrire(int nb,double prix) {
		if (this.totalClientsInscripts + nb <= this.capaciteMaxi) {
			this.totalClientsInscripts  += nb;
			this.chiffreDAffaire += prix;
		}
		else {
			System.err.println(" Capacité Maximale dépassé ");
		}
	}
	
	public int totalInscripts() {
		return this.totalClientsInscripts;
}
	public double Recette() {
		return this.chiffreDAffaire;
	}
	public String GetNom() {
		return this.nom;
	}
}