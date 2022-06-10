package fr.diginamic.banque.entites;

public class Compte {
	
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
	
	public void Solde() {
		System.out.println(" Le compte : "+this.numero +"\n"
				+ "a un solde de : " + this.solde);
		
	}
	
	

}
