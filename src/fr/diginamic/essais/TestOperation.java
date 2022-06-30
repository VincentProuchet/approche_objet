package fr.diginamic.essais;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;
/** 
 * application de test des classes débit et crédit
 * un autre bon exemple de l'héritage
 * @author Vincent
 *
 */
public class TestOperation {

	public static void main(String[] args) {
		int valeur = 0;

		Operation[] operations = new Operation[9];

		operations[0] = new Credit("2022-02-31", 1200);		
		
		operations[1] = new Credit("2022-04-13", 200);
		operations[2] = new Credit("2022-06-05", 2);
		operations[3] = new Credit("2022-06-10", 42);
		operations[4] = new Credit("2022-01-13", 51);
		
		operations[5] = new Debit("2022-02-01", 12);
		operations[6] = new Debit("2022-03-23", 5);		
		operations[7] = new Debit("2022-05-03", 100);
		operations[8]=  new Debit("2022-05-33", 35);
		
		for (int i = 0; i < operations.length; i++) {
			switch (operations[i].getType()) {
			case "DEBIT":
				valeur -= operations[i].GetMontant();
				break;
			case "CREDIT":
				valeur += operations[i].GetMontant();
				break;
			}

			System.out.println(operations[i] + "  " + operations[i].getType());

		}
		
		System.out.println("\n Somme des opérations : " + valeur);
	}

}
