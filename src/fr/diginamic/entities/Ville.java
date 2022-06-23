package fr.diginamic.entities;

import org.apache.commons.lang3.builder.EqualsBuilder;

import fr.diginamic.testenumeration.Continent;

/**
 * 
 * @author Vincent
 *
 */
public class Ville implements Comparable<Ville> {

	private String codeDeRegion;
	private String nomRegion;
	private String codeDepartement;
	private String codeDeCommune;
	private String nom;
	
	private Continent continent = Continent.ND;

	private int populationTotale;

	/**
	 * @obsolete laissé pour compatibilité avec ancien code
	 * 
	 * @param nom
	 * @param codeDepartement
	 * @param region
	 * @param population
	 */
	public Ville(String nom, String codeDepartement, String region, String population) {
		this.nom = nom;
		this.codeDepartement = codeDepartement;
		this.nomRegion = region;
		this.populationTotale = Integer.parseInt(population);

	}
/**
 * Constructeur
 * @param ligne
 */
	public Ville(String ligne) {
		String[] data = ligne.split(";");
		this.codeDeRegion = data[0];
		this.nomRegion = data[1];
		this.codeDepartement = data[2];

		this.codeDeCommune = data[5];
		this.nom = data[6];
		this.populationTotale = Integer.parseInt(data[data.length - 1].trim().replaceAll(" ", ""));

	}
/**
 * Constructeur
 * @param nom
 * @param nbhabitant
 */
	public Ville(String nom, long nbhabitant) {
		this.nom = nom;
		this.populationTotale = (int) nbhabitant;

	}
/**
 * Constructeur
 * @param nom
 * @param nbhabitant
 */
	public Ville(String nom, int nbhabitant) {
		this.nom = nom;
		this.populationTotale = nbhabitant;

	}
	public Ville(String nom, Continent continent) {
		this.nom = nom;
		this.continent = continent;

	}
	public int getPopulation() {
		return this.populationTotale;
	}

	public String getNom() {
		return this.nom;
	}

	public void capitalizeNom() {
		this.nom = this.nom.toUpperCase();
	}

	/**
	 * @return Les proriètées de la ville sous forme de chaine au format CSV avec
	 *         ";" comme séparateur
	 */
	public String toCSV() {
		return this.nom + ";" + this.codeDepartement + ";" + this.nomRegion + ";" + this.populationTotale + ";";
	}

	@Override
	public String toString() {
		return this.nom 
				+ " Dep: " + this.codeDepartement 
				+ " Region : " + this.nomRegion
				+ " Population : " 
				+ this.populationTotale 
				+ " habitants "
				+ " continent : " + this.continent.libelle;
	}

	/** Getter
	 * @return the continent
	 */
	public Continent getContinent() {
		return continent;
	}
	/** Setter
	 * @param continent the continent to set
	 */
	public void setContinent(Continent continent) {
		this.continent = continent;
	}
	public int populationTotale() {
		return this.populationTotale;
	}

	public String nom() {
		return this.nom;
	}

	public String nomRegion() {
		return this.nomRegion;
	}

	public String codeDeCommune() {
		return this.codeDeCommune;
	}

	public String codeDeRegion() {
		return this.codeDeRegion;
	}

	public String codeDeDepartement() {
		return this.codeDepartement;
	}

	@Override
	public int compareTo(Ville o) {
		return this.nom.compareTo(o.nom());
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
			boolean equalityNumCommune = new EqualsBuilder().append(this.codeDeCommune, other.codeDeCommune())
					.isEquals();

			if (equalityNom && equalityNumCommune) {
				return true;
			}
		}
		return false;

	}

}
