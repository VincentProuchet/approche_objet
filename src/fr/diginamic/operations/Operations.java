package fr.diginamic.operations;

/**
 * représente un opération
 * 
 * @author Vincent
 *
 */
public class Operations {

	/**
	 * Exécute l'opération demandée entre les valeurs passées en paramètres
	 * 
	 * @param a         premier nombre
	 * @param b         deuxième nombre
	 * @param operateur / calcul à produire entre les valeurs
	 * @return resultat du calcul
	 */
	public static double Calcul(double a, double b, char operator) {

		double resultat = 0;

		switch (operator) {
		case '+':
			resultat = a + b;
			break;
		case '-':
			resultat = a + b;
			break;
		case '*':
		case 'x':
			resultat = a * b;
			break;
		case '/':
			if (b != 0) {
				resultat = a / b;
			} else {
				System.err.println("division par zéro impossible");
			}
			break;
		default:
			break;

		}

		return resultat;
	}
}
