package fr.diginamic.banque.entites;

public class Credit extends Operation {

	public Credit(String date, int montant) {
		super(date, montant);
		
	}
	
	public String getType() {
		return "CREDIT";
	}


}
