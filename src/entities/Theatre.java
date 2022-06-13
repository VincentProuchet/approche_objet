package entities;
/** TP J3
 * 
 * @author Vincent
 *
 */
public class Theatre {
	String nom;
	int capaciteMaxi = 2000; // nb de personne
	int totalClientsInscripts;
	double chiffreDAffaire; // recette totales du théatre
	
	
	
	public void Incrire(int nb,double prix) {
		if (this.totalClientsInscripts + nb <= this.capaciteMaxi) {
			this.totalClientsInscripts  += nb;
			this.chiffreDAffaire += prix;
		}
		else {
			System.err.println(" Capacité Maximale dépassé ");
		}
	}
	
}
