package fr.diginamic.fichier;

import java.util.List;

public class Ville {
	String nom;
	String codeDepartement;
	String nomRegion;
	int populationTotale;
	
	public Ville(String nom,String codeDepartement, String region,String population ) {
		this.nom =nom;
		this.codeDepartement = codeDepartement;
		this.nomRegion = region;
		//this.populationTotale =population;
		}
	
	public Ville(String ligne) {
		String[] data = ligne.split(";");
		this.nom = data[6];
		this.codeDepartement = data[2];
		this.nomRegion = data[1];
		
		this.populationTotale = Integer.parseInt(data[data.length-1].trim().replaceAll(" ",""));
	
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
	
	
}
