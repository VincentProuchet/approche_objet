package fr.diginamic.banque.entites;
/**
 * Représente une opération de retrait à un compte
 * @author Vincent
 *
 */
public class Debit extends Operation {

	/**
	 * Constructeur
	 * @param date de l'opération
	 * @param montant de l'opération
	 */
	public Debit(String date, int montant) {
		super(date, montant);
		
	}
	/**
	 * @return le type de l'opération
	 */
	public String getType() {
		return "DEBIT";
	}


}
