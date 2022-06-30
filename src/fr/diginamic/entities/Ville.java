package fr.diginamic.entities;

import org.apache.commons.lang3.builder.EqualsBuilder;

import fr.diginamic.testenumeration.Continent;

/**
 * Représente une ville
 * 
 * @author Vincent
 *
 */
public class Ville implements Comparable<Ville> {

	/** code de la region */
	private String codeDeRegion;
	/** nom de la region */
	private String nomRegion;
	/** code du departement */
	private String codeDepartement;
	/** code De Commune */
	private String codeDeCommune;
	/** nom de la ville */
	private String nom;

	/** continent */
	private Continent continent = Continent.ND;

	/** populationTotale selon dernier recensement */
	private int populationTotale;

	/**
	 * Constructeur
	 * 
	 * @obsolete laissé pour compatibilité avec ancien code
	 * 
	 * @param nom
	 * @param codeDepartement
	 * @param region
	 * @param population
	 */
	@Deprecated
	public Ville(String nom, String codeDepartement, String region, String population) {
		this.nom = nom;
		this.codeDepartement = codeDepartement;
		this.nomRegion = region;
		this.populationTotale = Integer.parseInt(population);

	}

	/**
	 * Constructeur passez lui une ligne avec les propriétés séparée par des points
	 * virgules il se chargeras de les traiter et de peupler les propriétés de l'instance
	 * format :
	 * codeDeRegion;nomRegion;codeDepartement;;;codeDeCommune ;nom ;populationTotale	 * 
	 * population totale doit TOUJOURS être à la fin et pouvoir être transformé en nombre
	 * sinon l'instance échoue
	 * @param ligne
	 */
	public Ville(String ligne) {
		String[] data = ligne.split(";");
		if (data.length >= 8) {
			this.codeDeRegion = data[0];
			this.nomRegion = data[1];
			this.codeDepartement = data[2];

			this.codeDeCommune = data[5];
			this.nom = data[6];
			this.populationTotale = Integer.parseInt(data[data.length - 1].trim().replaceAll(" ", ""));
		}
	}

	/**
	 * Constructeur
	 * 
	 * @param nom
	 * @param nbhabitant
	 */
	public Ville(String nom, long nbhabitant) {
		this.nom = nom;
		this.populationTotale = (int) nbhabitant;

	}

	/**
	 * Constructeur
	 * 
	 * @param nom
	 * @param nbhabitant
	 */
	public Ville(String nom, int nbhabitant) {
		this.nom = nom;
		this.populationTotale = nbhabitant;

	}

	/** Constructeur
	 * @param nom
	 * @param continent
	 */
	public Ville(String nom, Continent continent) {
		this.nom = nom;
		this.continent = continent;

	}
	/** retourne le nom en lettres capitale
	 * pas vraiment utile
	 * @return nom de l'instance en lettres capitales
	 */
	public String getCapitalizedNom() {
		return this.nom.toUpperCase();
	}

	/**
	 * @return Les propriétés de la ville sous forme de chaîne au format CSV avec
	 *         ";" comme séparateur
	 */
	public String toCSV() {
		return new StringBuilder().append(this.nom).append(";").append(this.codeDepartement).append(";")
				.append(this.nomRegion)

				.append(";").append(this.populationTotale).append(";").toString();
	}

	@Override
	public String toString() {

//		return this.nom 
//				+ " Dep: " + this.codeDepartement 
//				+ " Region : " + this.nomRegion
//				+ " Population : " 
//				+ this.populationTotale 
//				+ " habitants "
//				+ " continent : " + this.continent.libelle;

		return new StringBuilder().append(this.nom).append(" |Dep: ").append(this.nomRegion).append(" |")
				.append(this.populationTotale).append(" habitants ").append(" |Continent : ")
				.append(this.continent.libelle).toString();
	}

	/**
	 * Getter
	 * 
	 * @return the continent
	 */
	public Continent getContinent() {
		return continent;
	}

	/**
	 * Setter
	 * 
	 * @param continent the continent to set
	 */
	public void setContinent(Continent continent) {
		this.continent = continent;
	}



	@Override
	public int compareTo(Ville o) {
		return this.nom.compareTo(o.getNom());
	}

	@Override
	public boolean equals(Object object) {
		// on teste si l'object passé est une instance de classe Ville
		if ((object instanceof Ville)) {
			// si c'est le cas on le transforme explicitement
			// ce n'est pas une sécurité mais juste un confort de codage
			// parce que ça permet l'auto-completion
			Ville other = (Ville) object;
			boolean equalityNom = new EqualsBuilder().append(this.nom, other.getNom()).isEquals();
			boolean equalityNumCommune = new EqualsBuilder().append(this.codeDeCommune, other.getCodeDeCommune())
					.isEquals();

			if (equalityNom && equalityNumCommune) {
				return true;
			}
		}
		return false;

	}

	/** Getter
	 * @return the codeDeRegion
	 */
	public String getCodeDeRegion() {
		return codeDeRegion;
	}

	/** Getter
	 * @return the nomRegion
	 */
	public String getNomRegion() {
		return nomRegion;
	}

	/** Getter
	 * @return the codeDepartement
	 */
	public String getCodeDepartement() {
		return codeDepartement;
	}

	/** Getter
	 * @return the codeDeCommune
	 */
	public String getCodeDeCommune() {
		return codeDeCommune;
	}

	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Getter
	 * @return the populationTotale
	 */
	public int getPopulationTotale() {
		return populationTotale;
	}

	/** Setter
	 * @param codeDeRegion the codeDeRegion to set
	 */
	public void setCodeDeRegion(String codeDeRegion) {
		this.codeDeRegion = codeDeRegion;
	}

	/** Setter
	 * @param nomRegion the nomRegion to set
	 */
	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	/** Setter
	 * @param codeDepartement the codeDepartement to set
	 */
	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	/** Setter
	 * @param codeDeCommune the codeDeCommune to set
	 */
	public void setCodeDeCommune(String codeDeCommune) {
		this.codeDeCommune = codeDeCommune;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Setter
	 * @param populationTotale the populationTotale to set
	 */
	public void setPopulationTotale(int populationTotale) {
		this.populationTotale = populationTotale;
	}

}
