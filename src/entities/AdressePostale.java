package entities;

public class AdressePostale extends Object {
	private int numeroRue;
	private String rue;
	private int codePostal;
	private String ville;
	
	
	public AdressePostale(){
		
	}
	public AdressePostale(int numero, String rue, int codePostal, String ville ) {
		this.numeroRue = numero;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		
	}
	// clone les valeurs de l'objet AdressePostal passé en paramètre 
	public AdressePostale(AdressePostale adresse ) {
		this.numeroRue = adresse.numeroRue;
		this.rue = adresse.rue;
		this.codePostal = adresse.codePostal;
		this.ville = adresse.ville;
		
	}
	
	public void AfficheAdresse() {
		System.out.println( this.numeroRue + " " + this.rue + "\n"
				+ this.codePostal +" "+ this.ville
				+ "\n"
				);
	}
	public String toString() {
		return "\n" + this.numeroRue + " " + this.rue + "\n"
				+ this.codePostal +" "+ this.ville
				+ "\n"
				;
	}
}
