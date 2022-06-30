package fr.diginamic.formes;

/**
 *  représente 
 * forme géométrique 
 * @author Vincent
 *
 */
public class Rectangle extends Formes{
	/** longueur */
	double longueur;
	/** largeur */
	double largeur;

/** Constructeur
 * les paramètres sont interchangeable 
 * @param longueur
 * @param largeur
 */
public Rectangle(double longueur, double largeur) {
	
	this.longueur = longueur;
	this.largeur = largeur;	
}
	
	@Override
	public double CalculerSurface() {
		// TODO Auto-generated method stub
		return this.longueur*this.largeur;
	}
	@Override
	public double CalculerPerimetre() {
		// TODO Auto-generated method stub
		return this.longueur+this.largeur;
	}
}
