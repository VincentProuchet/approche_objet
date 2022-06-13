package fr.diginamic.banque.entites;
/**
 * TP 6
 * @author Vincent
 *
 */
public class Compte  extends Object {
	
	private String numero;
	private double solde;
	
	/**
	 * 
	 * @param numero de compte
	 * @param solde du compte
	 */
	public Compte(String numero, double solde) {
		this.numero = numero;
		this.solde = solde;
	}
	
	public String GetNumero() {
		return this.numero;
		
	}
	public double GetSolde() {
		return this.solde;
	}
	@Override
	public String toString() {
		return " Le compte : "+ this.numero +" a un solde de : "+ this.solde;		
	}
	
	

}
