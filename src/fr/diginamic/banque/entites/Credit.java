package fr.diginamic.banque.entites;
/**
 * Représente une opération d'ajout de somme à un compte
 * @author Vincent
 *
 */
public class Credit extends Operation {

	/**
	 * Constructeur
	 * @param date de l'opération 
	 * @param montant de l'opération
	 */
	public Credit(String date, int montant) {
		super(date, montant);
		
	}
	/**
	 * @return le type de l'opération
	 */
	public String getType() {
		return "CREDIT";
	}


}
