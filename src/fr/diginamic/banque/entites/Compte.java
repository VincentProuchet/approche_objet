package fr.diginamic.banque.entites;

public class Compte  extends Object {
	
	private long numero;
	private int solde;
	
	
	public Compte(long numero, int solde) {
		this.numero = numero;
		this.solde = solde;
	}
	
	public long GetNumero() {
		return this.numero;
		
	}
	public int GetSolde() {
		return this.solde;
	}
	
	public String toString() {
		return " Le compte : "+ this.numero +" a un solde de : "+ this.solde;		
	}
	
	

}
