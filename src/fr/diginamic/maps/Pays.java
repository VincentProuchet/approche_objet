package fr.diginamic.maps;
/** 
 * Représente un pays
 * 
 * @author Vincent
 *
 */
public class Pays {
	public String nom,continent;
	public long habitants;
	
	
	public Pays(String nom,String continent, long habitants) {
		this.nom = nom;
		this.continent = continent;
		this.habitants =habitants;
	}
}
