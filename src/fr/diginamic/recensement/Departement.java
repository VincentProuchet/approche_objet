package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.List;

import fr.diginamic.entities.Ville;

public class Departement {
	private List<Ville> villes;
	private String codeDepartement;
	private String codeRegion;
	
	public Departement(String id) {
		this.villes = new ArrayList<>();
		this.codeDepartement = id;
	}
	
	public void ajouter(Ville ville) {
		this.villes.add(ville);
	}
	public void ajouter( List<Ville> liste) {
		for(Ville v: liste) {
			
			if(v.codeDeDepartement().equals(codeDepartement)) {
				this.villes.add(v);
				this.codeRegion = v.codeDeRegion();
			}
		}
		
	}
	public List<Ville> villes(){
		return this.villes;
	}
	
	
	public int population() {
		int population= 0;
		for(Ville v: this.villes) {
			population += v.getPopulation();
		}
		return population;
	}
	public String getcodeRegion() {
		return this.codeRegion;
	}
}
