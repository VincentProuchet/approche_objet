package fr.diginamic.recensement;

import java.util.Scanner;

import fr.diginamic.entities.Ville;

public class PopulationDepartement extends MenuService{
	private int population;
	private String departementRecherchee;
	
	
	
	
	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		this.population = 0;
		this.departementRecherchee = scanner.next();
		for(Ville v:recensement.getVilles()) {
			if(v.nomRegion().equals(this.departementRecherchee)) {
				this.population += v.getPopulation();
			}
		}
		
	}
	public void traiter(Recensement recensement, String scanner) {
		this.population = 0;
		this.departementRecherchee = scanner;
		for(Ville v:recensement.getVilles()) {
			if(v.codeDeDepartement().equals(this.departementRecherchee)) {
				this.population += v.getPopulation();
			}
		}
		
	}
	public int getResultat() {
		return this.population;
	}
	
	
}
