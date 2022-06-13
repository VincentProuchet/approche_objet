package fr.diginamic.operations;
/** TP J3
 *  * @author Vincent
 *
 */
public class CalculMoyenne {
	double[] valeurs;

	public void Push(double it) {
		// si le tableau n'a pas de taille
		if (valeurs == null) {
			// on créer le tableau avec une taille d'une case
			valeurs = new double[1];
			// on place la dernière entrée à la fin
			valeurs[0] = it;
			
		} else {
			// on crée un tableau plus grand
			double[] temp = new double[this.valeurs.length + 1];
			// on y copie chaque valeur du tableau d'origine
			for (int i = 0; i < this.valeurs.length; i++) {
				temp[i] = this.valeurs[i];
			}
			
			// on place la nouvelle valeur à la fin
			temp[temp.length-1] = it;
			// et on écrase l'ancien tableau trop petit
			this.valeurs = temp;
			// le garbage collector s'occuperas du reste
		}
	}
	
	public double Calcul() {
		double moyenne = 0;
		
		for (int i = 0; i < this.valeurs.length; i++) {
			moyenne += this.valeurs[i];
		}
		return moyenne / this.valeurs.length;
	
		
		
		
	}

}
