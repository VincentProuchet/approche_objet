package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.List;

import fr.diginamic.entities.Ville;

public class Region {
	private List<Departement> departements;
	private String codeRegion;
	
	public Region(String id) {
		this.departements = new ArrayList<>();
		this.codeRegion = id.strip().toLowerCase();
	}
	
	public void ajouter(Departement departement) {
		this.departements.add(departement);
	}
	public void ajouter( List<Departement> liste) {
		for(Departement d: liste) {
			if(d.getcodeRegion().strip().toLowerCase().equals(codeRegion)) {
				this.departements.add(d);
			}
		}
		
	}
	
	
	public int population() {
		int population= 0;
		
		for(Departement d: this.departements) {
			population += d.population();
		}
		
		return population;
	}
}
