package fr.diginamic.maison;

/**
 * Classe mère des pièces de la maison
 * @author Vincent
 *
 */
public abstract class Piece {
		/** superficie */
		double superficie;
		/** etage */
		int etage;
	
		/** Getter
		 * @return superficie de la pièce
		 */
		public double superficie() {
			return this.superficie;
		}
		/** Getter
		 * @return étage d'implantation de la pièce
		 * 0 -> Rdc 
		 * 1-> 1
		 * etc ...
		 */
		public int etage() {
			return this.etage;
		}
		
		/** Constructeur
		 * @param superficie
		 * @param etage
		 */
		public Piece(double superficie, int etage) {
			this.superficie = superficie;
			this.etage = etage;
		};
}
