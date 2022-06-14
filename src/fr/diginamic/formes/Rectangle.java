package fr.diginamic.formes;

public class Rectangle extends Formes{
	double longueur;
	double largeur;

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
