/**
 * 
 */
package geometrie;

/** TP J3
 * @author Vincent
 *
 *	J'ai dût le déplacer à cause d'une collision de type
 */
public class Cercle implements ObjetGeometrique{
	//pi *r*r
	private double rayon;


	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	public double GetRayon() {
		return this.rayon;
	}
		
	public double perimetre() {
		
		return (this.rayon* this.rayon * Math.PI);
	}
	
	public double surface() {
		
		return (this.rayon*2*Math.PI) ;
	}
	

}
