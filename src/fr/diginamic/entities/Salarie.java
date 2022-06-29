package fr.diginamic.entities;
/**Représente un salarié
 * 
 * @author Formation
 *
 */
public class Salarie {

	/**nom */
	private String nom;
	/**prenom */
	private String prenom;
	/**salaire */
	private double salaire;
	
	
	/** Constructeur
	 * @param data tableau de valeurs 
	 * [0] nom
	 * [1] prenom
	 * [2] salaire
	 */
	public Salarie(String[] data) {
	
		this.nom = data[0].toUpperCase();
		this.prenom = data[1].toLowerCase();
		this.salaire = Double.parseDouble(data[2].replaceAll(" ", ""));
		
	}


	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}


	/** Getter
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	

	/** Getter
	 * @return the salaire
	 */
	public double getSalaire() {
		return salaire;
	}


	/** Setter
	 * @param salaire the salaire to set
	 */
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	

}
