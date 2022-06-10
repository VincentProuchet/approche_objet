package fr.diginamic.banque.entites;

public abstract class Operation extends Object {
	
	String date;
	int montant;
	
	public Operation(String date, int montant) {
		this.date= date;
		this.montant = montant;
	}
	public String toString() {
		return this.date + "------" + this.montant;
	}
	
	public String getType() {
		return "";
	}
	public int GetMontant() {
		return this.montant;
	}

}
