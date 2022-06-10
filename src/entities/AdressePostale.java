package entities;

public class AdressePostale {
	int numeroRue;
	String rue;
	int codePostal;
	String ville;
	
	
	public AdressePostale(){
		
	}
	public AdressePostale(int numero, String rue, int codePostal, String ville ) {
		this.numeroRue = numero;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		
	}
	
	public void AfficheAdresse() {
		System.out.println( this.numeroRue + " " + this.rue + "\n"
				+ this.codePostal +" "+ this.ville
				+ "\n"
				);
	}
}
