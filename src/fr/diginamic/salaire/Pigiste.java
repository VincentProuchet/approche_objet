package fr.diginamic.salaire;
/** TP J3 
 *  Calcul Salaire
 * 
 * @author Vincent
 *
 */
public class Pigiste extends Salarie{
	
	int nombreDejours;
	float salaireJournalier;
	
	public Pigiste(String nom, String prenom,float salaireJournalier) {
		super( nom, prenom, salaireJournalier);
//		this.nom = nom;
//		this.prenom = prenom;
		this.salaireJournalier = salaireJournalier;
	}
	public void ValiderJournee() {
		if(this.nombreDejours<31) {
			this.nombreDejours++;
		}
		else {
			this.nombreDejours = 1;
		}
	}
	public void NouveauMois() {
		this.nombreDejours = 0; 
	}
	
	@Override
	public float GetSalaire() {
		
		return this.salaireJournalier *this.nombreDejours;
	}
	
	
}
