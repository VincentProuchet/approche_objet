package fr.diginamic.banque.entites;
/**
 * Représente les operation réalisables sur un compte
 * @author Vincent
 *
 */
public abstract class Operation extends Object {// héritage d'object est implicite pour toutes classe sans héritage
	/** date de l'opération */
	String date;
	/** montant de l'opération */
	int montant;
	/**
	 * Constructeur
	 * @param date de l'opération
	 * @param montant de l'opération
	 */
	public Operation(String date, int montant) {
		this.date= date;
		this.montant = montant;
	}
	/**
	 * @return une chaine de caractére représentant l'opération
	 * au format 
	 * [date]+----+[montant]
	 */
	public String toString() {
		return this.date + "------" + this.montant;
	}
	/** GETTER
	 * 
	 * @return le type de l'opération 
	 */
	public abstract String getType();
	/**GETTER
	 * 
	 * @return le montant de l'opération
	 */
	public int GetMontant() {
		return this.montant;
	}
	/**GETTER
	 * 
	 * @return la date de l'opération
	 */
	public String GetDate() {
		return this.date;
	}
}
