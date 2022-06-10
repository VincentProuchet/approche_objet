/**
 * 
 */
package geometrie;

/**
 * @author Vincent
 *
 */
public class Cercle implements ObjetGeometrique{
	//pi *r*r
	private float rayon;


	public Cercle(int rayon) {
		this.rayon = rayon;
	}
	
		
	public double perimetre() {
		
		return (this.rayon* this.rayon * Math.PI);
	}
	
	public double surface() {
		
		return (this.rayon*2*Math.PI) ;
	}
	

}
