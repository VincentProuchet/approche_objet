package fr.diginamic.maison;
/** TP J3
 * 
 * La Maison
 * 
 * @author Vincent
 *
 */
public class Maison {

	/** pieces de la maison */
	Piece[] pieces;
	/** taille Minimale Des Pieces */
	double tailleMiniDesPieces = 0;
	/** dernier étage  aucune piece ne pourras être ajoutée à un étage supérieur*/
	int etageMaxi;
	/** dernier étage  aucune piece ne pourras être ajoutée à un étage inférieur*/
	int etageMini = 0;


	/**
	 * 
	 * @param etageMaxi        étage le le plus haut possible pour une pièce
	 * @param tailleMiniPieces taille minimale possible pour les pièces ajoutées
	 */
	public Maison(int etageMaxi, double tailleMiniPieces) {
		this.etageMaxi = etageMaxi;
		this.tailleMiniDesPieces = tailleMiniPieces;
	}

	/**ajoute la pièce passé en paramètre à la collection de pièces de la maison
	 * 
	 * @param nouvellePiece
	 */
	public void ajouterPiece(Piece nouvellePiece) {
		if (nouvellePiece != null && nouvellePiece.superficie() > this.tailleMiniDesPieces && 0 <= nouvellePiece.etage()
				&& nouvellePiece.etage() <= etageMaxi) {
			// si le tableau n'a pas de taille
			if (this.pieces == null) {
				// on créer le tableau avec une taille d'une case
				this.pieces = new Piece[1];
				// on place la dernière entrée à la fin
				pieces[0] = nouvellePiece;

			} else {
				// on crée un tableau plus grand
				Piece[] temp = new Piece[this.pieces.length + 1];
				for (int i = 0; i < this.pieces.length; i++) {
					temp[i] = this.pieces[i];
				}

				// on place la nouvelle valeur à la fin
				temp[temp.length - 1] = nouvellePiece;
				// et on écrase l'ancien tableau trop petit
				this.pieces = temp;
				// le garbage collector s'occuperas du reste
			}
		}
	}
	
	/**renvoi la surface totale calculé des pièces de la maison
	 * 
	 * @return double surface 
	 */
	public double surface() {
		double surface = 0;
		for (int i = 0; i < this.pieces.length; i++) {
			surface += this.pieces[i].superficie();

		}

		return surface;

	}
	/**surface totale de l'étage indentifiè en paramétres
	 * 
	 * @param etage dont vous souhaitez connaitre la surface
	 * @return
	 */
	public double surface(int etage) {
		double surface = 0;
		if (etage <= this.etageMaxi) {
			for (int i = 0; i < this.pieces.length; i++) {
				if (this.pieces[i].etage() == etage) {
					surface += this.pieces[i].superficie();
				}

			}

		} else {
			System.out.println("il n'y a pas d'étage " + etage + " dans cette maison");
		}

		return surface;
	}
	/**surface cumulé des pièces 
	 * dont le type correspond à celle passé en paramètre 
	 * 	 
	 * @param piece type de pièce souhaité
	 * @return surface cumulé des pièces d'un type précis
	 */
	public double surface(Piece piece) {
		double surface = 0;
		for (int i = 0; i < this.pieces.length; i++) {
			if (this.pieces[i].getClass() == piece.getClass()) {
				surface += this.pieces[i].superficie();
			}
		}
		return surface;
	}
	/** Retourner le nombre de piece de la maison 
	 * dont le type correspond au paramètre 	 * 
	 * @param piece
	 * @return int nombre de pièces d'un type précis
	 */
	public int nombreDePieces(Piece piece) {
		int surface = 0;
		for (int i = 0; i < this.pieces.length; i++) {
			if (this.pieces[i].getClass() == piece.getClass()) {
				surface++;
			}
		}
		return surface;
	}

}
