package fr.diginamic.formes;
/**
 *	représente 
 * forme géométrique
 * @author Vincent
 *
 */
public class Cercle extends Formes {
	/** rayon */
	double rayon;
	
	/** Constructeur
	 * @param rayon
	 */
	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	@Override
	public double CalculerSurface() {
		
		return (this.rayon*2*Math.PI) ;
	}

	@Override
	public double CalculerPerimetre() {
		return (this.rayon* this.rayon * Math.PI);
		
	}
}
