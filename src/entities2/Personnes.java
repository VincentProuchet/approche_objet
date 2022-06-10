package entities2;

import entities.AdressePostale;

public class Personnes {
	String nom;
	String prenom;
	AdressePostale adresse;

	
	public Personnes(String nom, String prenom, 
			int numeroDeRue, String libelleRue, int codePostal, String ville  
					)
	{
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = new AdressePostale(numeroDeRue,libelleRue,codePostal,ville);		
		
	}
	public Personnes(String nom, String prenom,AdressePostale adresse){
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;		
		
	}
	public void AfficherIdentite() {
		System.out.println(this.nom.toUpperCase() + " " + this.prenom);		
	}
	
	public void SetNom(String nom) {
		this.nom = nom;
	}
	public void SetPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void SetAdresse(AdressePostale addr) {
		this.adresse = addr;
	}
	public void SetAdresse(int numeroDeRue, String libelleRue, int codePostal, String ville ) {
		this.adresse = new AdressePostale(numeroDeRue, libelleRue, codePostal,  ville); 
	}
	public String GetNom() {
		return this.nom;
	}
	public String GetPrenom() {
		return this.prenom;
	}
	public AdressePostale GetAdresse() {
		return this.adresse;
	}
	
}
