package fr.diginamic.entities;
/**représente une Personne
 * et je vient de voir l'érreur de frappe
 * oui il y a un S en trop
 * 
 * @author Formation
 *
 */
/**
 * @author Formation
 *
 */
/**
 * @author Formation
 *
 */
public class Personnes extends Object {
	// identité
	
	/**nom */
	private String nom;
	/**prenom */
	private String prenom;
	/**adresse */
	private AdressePostale adresse;

	/**Constructeur
	 * 
	 * @param nom
	 * @param prenom
	 * @param numeroDeRue
	 * @param libelleRue
	 * @param codePostal
	 * @param ville
	 */
	public Personnes(String nom, String prenom, 
			int numeroDeRue, String libelleRue, int codePostal, String ville  
					)
	{
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = new AdressePostale(numeroDeRue,libelleRue,codePostal,ville);		
		
	}
	/** Constructeur
	 * @param nom
	 * @param prenom
	 * @param adresse
	 */
	public Personnes(String nom, String prenom,AdressePostale adresse){
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;		
		
	}
	/** Affiche les donnée de l'instance dans la console
	 * 
	 */
	public void AfficherIdentite() {
		System.out.println(this.nom.toUpperCase() + " " + this.prenom);		
	}
	/** retourne les données de l'instance sous la forme d'une chaine de caractére
	 *
	 */
	@Override
	public String toString() {
		return this.nom.toUpperCase() + " " + this.prenom.toLowerCase();
	}
	

	/** Setter
	 * @param String nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/** Setter
	 * @param String prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/** Setter
	 * construit unbe nouvelle adresse postale à partir des données de l'adresse postale en paramètres
	 * @param addr une AddressePostale
	 */
	public void setAdresse(AdressePostale addr) {
		this.adresse =  new AdressePostale(addr);
	}
	/** Setter de l'adresse postale
	 * construira une nouvelle adresse postale avec les paramétres 
	 * @param numeroDeRue
	 * @param libelleRue
	 * @param codePostal
	 * @param ville
	 */
	public void setAdresse(int numeroDeRue, String libelleRue, int codePostal, String ville ) {
		this.adresse = new AdressePostale(numeroDeRue, libelleRue, codePostal,  ville); 
	}
	
	/** Getter
	 * @return String
	 */
	public String getNom() {
		return nom;
	}
	
	/** getter
	 * @return String 
	 */
	public String getPrenom() {
		return this.prenom;
	}
	/** getter
	 * @return un Objet AdressePostale
	 */
	public AdressePostale getAdresse() {
		return this.adresse;
	}
	
}
