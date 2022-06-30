package fr.diginamic.recensement;

import java.util.HashSet;
import java.util.List;

import fr.diginamic.entities.Ville;
/** Représente Une région 
 * @author Vincent
 *
 */
public class Region {
	/**Set de département */
	private HashSet<Departement> departements;
	/**code identifiant de la région */
	private String code;
	/** nom de la région */
	private String nom = null;
	
	/** Constructeur de la région par identifiant
	 * @param id identifiant de la région
	 */
	public Region(String id) {
		this.departements = new HashSet<>();
		this.code = id;
		
	}
	/** Constructeur par Ville
	 * vous lui passez une ville et les données de celle-ci vous construirons une région
	 * 
	 * @param ville de la régio
	 */
	public Region(Ville ville) {
		this.departements = new HashSet<>();
		this.code = ville.getCodeDeRegion();
		this.nom = ville.getNomRegion();
	}

	/**ajouter un département dans la région
	 * il y à un controle d'intégrité par comparaison des codes région
	 * un département n'ayant pas le bon code ne sera pas ajouté au set
	 * @param departement
	 */
	public void ajouter(Departement departement) {
		if (departement.codeRegion().equals(code)) {
			this.departements.add(departement);
		}

	}

	/**
	 * ajouts au set des départements tous les départements dont le codeRegion
	 * correspond au codeRegion de l'instance
	 * 
	 * @param liste de départements
	 */
	public void ajouter(List<Departement> liste) {
		for (Departement d : liste) {
			if (d.codeRegion().equals(code)) {
				this.nom = d.nomRegion();
				this.departements.add(d);
			}
		}

	}
	/** effectue la somme des populations des departements 
	 * 
	 * @return population totale de la région
	 */
	public int population() {
		int population = 0;

		for (Departement d : this.departements) {
			population += d.population();
		}

		return population;
	}

	/**	GETTER 
	 * renvoi le set  des départements
	 * 
	 * @return set des départements
	 */
	public HashSet<Departement> listeDepartement() {
		return this.departements;
	}
	/** GETTER
	 * 
	 * @return nom de la region
	 */
	public String nom() {
		return this.nom;
	}
	/** GETTER
	 * 
	 * @return code de la région
	 */
	public String code() {
		return this.code;
	}
	/** Chaine de carractére descriptive de la région
	 * sous la forme 
	 * [code] ---- [nom]
	 * 
	 */
	@Override
	public String toString() {

		return this.code+" ---- "  + this.nom;
	}
	/**	retourne un set de toutes les villes de touts les départements
	 * 
	 * @return set de Ville 
	 */
	public HashSet<Ville> villes(){
		HashSet<Ville> villes = new HashSet<Ville>();
		// on parcours les département
		for(Departement d : this.departements) {
			//puis on parcourt la liste de villes de chacun  
			for ( Ville v : d.villes()) {
				// que l'on ajoute à la liste temporaire
				villes.add(v);
			}
		}
		
		// que l'on renvoi
		 return villes;
	}
}
