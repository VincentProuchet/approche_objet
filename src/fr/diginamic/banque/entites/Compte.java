package fr.diginamic.banque.entites;
/**
 * TP 6
 * 
 * Représente un compte banjcaire
 * @author Vincent
 *
 */
public class Compte  extends Object {
	/**noméro du compte*/
	private String numero;
	/** Solde du compte*/
	private double solde;
	
	/** Constructeur
	 * 
	 * @param numero de compte
	 * @param solde du compte
	 */
	public Compte(String numero, double solde) {
		this.numero = numero;
		this.solde = solde;
	}
	/**GETTER
	 * 
	 * @return numéro du compte
	 */
	public String GetNumero() {
		return this.numero;
		
	}
	/**GETTER
	 * 
	 * @return solde du compte
	 */
	public double GetSolde() {
		return this.solde;
	}

	/**
	 * @return une chaine de caractére représentant le compte 
	 * au format 
	 * String+[Numero]+ String+[Solde]
	 */
	@Override
	public String toString() {
		return " Le compte : "+ this.numero +" a un solde de : "+ this.solde;		
	}
	

}
