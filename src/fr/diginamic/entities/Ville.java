package fr.diginamic.entities;

/**
 * 
 * @author Vincent
 *
 */
public class Ville implements Comparable<Ville> {

	private String codeDeRegion, nomRegion, codeDepartement, codeDeCommune, nom;

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

	public Ville(String ligne) {
		String[] data = ligne.split(";");
		this.codeDeRegion = data[0];
		this.nomRegion = data[1];
		this.codeDepartement = data[2];

		this.codeDeCommune = data[5];
		this.nom = data[6];
		this.populationTotale = Integer.parseInt(data[data.length - 1].trim().replaceAll(" ", ""));

	}

	public Ville(String nom, long nbhabitant) {
		this.nom = nom;
		this.populationTotale = (int) nbhabitant;

	}

	public Ville(String nom, int nbhabitant) {
		this.nom = nom;
		this.populationTotale = nbhabitant;

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
		return this.nom + "/" + this.codeDepartement + "/" + this.nomRegion + "/" + this.populationTotale + "/";
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
		if ((object instanceof Ville)) {
			Ville other = (Ville) object;
			if (this.nom.equals(other.getNom()) && this.codeDeCommune.equals(other.codeDeCommune())) {
				return true;
			}
		}
		return false;

	}

}
