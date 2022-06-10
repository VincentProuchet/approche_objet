package entities2;

import entities.AdressePostale;

public class Personnes {
	public String nom;
	public String prenom;
	public AdressePostale adresse;

	
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
	
	
}
