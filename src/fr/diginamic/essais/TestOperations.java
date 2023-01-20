package fr.diginamic.essais;

import fr.diginamic.operations.Operations;
/**classe de test du package operations
 * 
 * @author Vincent
 *
 */
public class TestOperations {

	public static void main(String[] args) {
		
		 
		
		System.out.println(Operations.Calcul(2,5,'*'));
		
		System.out.println(Operations.Calcul(2,0,'/'));
		
		System.out.println(Operations.Calcul(2,4,'+'));
		System.out.println(Operations.Calcul(15,5,'/'));
		System.out.println(Operations.Calcul(2,5,'-'));
	}

}
