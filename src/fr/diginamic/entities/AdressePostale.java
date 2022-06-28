package fr.diginamic.entities;

public class AdressePostale extends Object {
	/**numero dans la rue */
	private int numeroRue;
	/** nom de la rue */
	private String rue;
	/**code Postal */
	private int codePostal;
	/**nom de la ville */
	private String ville;
	
	
	/** Constructeur
	 * 
	 */
	public AdressePostale(){
		
	}
	/** Constructeur secondaire
	 * @param numero
	 * @param rue
	 * @param codePostal
	 * @param ville
	 */
	public AdressePostale(int numero, String rue, int codePostal, String ville ) {
		this.numeroRue = numero;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		
	} 
	/** clone les valeurs de l'objet AdressePostal passé en paramètre 
	 * @param adresse
	 */
	public AdressePostale(AdressePostale adresse ) {
		this.numeroRue = adresse.numeroRue;
		this.rue = adresse.rue;
		this.codePostal = adresse.codePostal;
		this.ville = adresse.ville;
		
	}
	
	/** Affiche les informations de l'objet 
	 * dans la console
	 * 
	 */
	public void AfficheAdresse() {
		System.out.println( this.numeroRue + " " + this.rue + "\n"
				+ this.codePostal +" "+ this.ville
				+ "\n"
				);
	}
	/**	Retourne une chaine formatté des informations de l'objet
	 *
	 */
	@Override
	public String toString() {
		return "\n" + this.numeroRue + " " + this.rue + "\n"
				+ this.codePostal +" "+ this.ville
				+ "\n"
				;
	}
}
