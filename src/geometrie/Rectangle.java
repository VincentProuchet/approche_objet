package geometrie;
/** TP 9 
 * interfaces faciles
 * @author Vincent
 *
 */
public class Rectangle implements ObjetGeometrique{

	float longueur;
	float largeur;
	
	
	public Rectangle(int longueur, int largeur) {
		this.largeur  = largeur;
		this.longueur = longueur;
	}


	@Override
	public double perimetre() {
		
		return this.largeur+this.longueur ;
	}


	@Override
	public double surface() {
		return this.largeur*this.longueur;
	}
	
}
