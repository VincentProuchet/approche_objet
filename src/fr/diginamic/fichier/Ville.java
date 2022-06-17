package fr.diginamic.fichier;

import java.util.List;

public class Ville implements Comparable<Ville>{
	private String nom;
	private String codeDepartement;
	private String nomRegion;
	private int populationTotale;
	
	public Ville(String nom,String codeDepartement, String region,String population ) {
		this.nom =nom;
		this.codeDepartement = codeDepartement;
		this.nomRegion = region;
		this.populationTotale = Integer.parseInt(population);
		}
	
	public Ville(String ligne) {
		String[] data = ligne.split(";");
		this.nom = data[6];
		this.codeDepartement = data[2];
		this.nomRegion = data[1];
		
		this.populationTotale = Integer.parseInt(data[data.length-1].trim().replaceAll(" ",""));
	
	}
	public Ville(String nom, long nbhabitant) {
		this.nom = nom;
		this.populationTotale = (int) nbhabitant ;
		
		
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
	 * @return Les proriètées de la ville sous forme de chaine au format CSV avec ";" comme séparateur
	 */
	public String toCSV() {
		return this.nom+";"+this.codeDepartement+";"+this.nomRegion+";"+this.populationTotale+";";
	}
	
	public String toString() {
		return this.nom+"/"+this.codeDepartement+"/"+this.nomRegion+"/"+this.populationTotale+"/";
	}
	public int populationTotale() {
		return this.populationTotale;
	}
	public String nom() {
		return this.nom;
	}

	@Override
	public int compareTo(Ville o) {
		if(this.populationTotale> o.populationTotale()) {
			return -1;
		}
		else if(this.populationTotale< o.populationTotale()) {
			return 1;
		}
		
		
		
		return 0;
	}
	
	
}
