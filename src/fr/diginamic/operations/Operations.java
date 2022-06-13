package fr.diginamic.operations;

public class Operations {
	

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
				System.out.println("division par zéro impossible");
			}
			break;
		default:
			break;

		}

		return resultat;
	}
}
