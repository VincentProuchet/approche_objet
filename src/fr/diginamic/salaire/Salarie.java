package fr.diginamic.salaire;

/**
 * TP J3 Calcul Salaire
 * 
 * @author Vincent
 *
 */
public class Salarie extends Intervenant {

	float salaire;

	public Salarie(String nom, String prenom, float salaire) {
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
		
	}

	@Override
	public float GetSalaire() {

		return this.salaire;
	}

	@Override
	public void ValiderJournee() {
		// TODO Auto-generated method stub

	}

	@Override
	public void NouveauMois() {
		// TODO Auto-generated method stub

	}

	@Override
	public void AfficherDonnees() {
		System.out.println("\n" + this.prenom + " " + this.nom + "\n" + this.GetSalaire() + "\n" + this.getClass());
	}
}
