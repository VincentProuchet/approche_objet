package entities;

public class AdressePostale {
	int numeroDeRue;
	String rue;
	int codePostal;
	String ville;
	
	
	public AdressePostale(){
		
	}
	public AdressePostale(int numero, String rue, int codePostal, String ville ) {
		this.numeroDeRue = numero;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		
	}
}
