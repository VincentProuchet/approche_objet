package fr.diginamic.maison;

public abstract class Piece {
		double superficie;
		int etage;
	
		public double superficie() {
			return this.superficie;
		}
		public int etage() {
			return this.etage;
		}
		
		public Piece(double superficie, int etage) {
			this.superficie = superficie;
			this.etage = etage;
		};
}
