package fr.diginamic.salaire;

public abstract class Intervenant {
	String nom;
	String prenom;
	
	public abstract float GetSalaire();
	public abstract void ValiderJournee();
	public abstract void NouveauMois();
	public abstract void AfficherDonnees();
	
}
