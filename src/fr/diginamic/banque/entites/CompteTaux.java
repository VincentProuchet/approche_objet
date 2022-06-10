package fr.diginamic.banque.entites;
/*
 * 
 */
public class CompteTaux extends Compte {
	
	private int txRemuneration;
	
	public CompteTaux(long numero, int solde, int tx) {
		super(numero, solde);
		this.txRemuneration = tx;
	}
	public String toString() {
		return (super.toString() +" et a un taux de : " + this.txRemuneration +"%" ); 
	}

}
