package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		
		double resultat = 0; 
		
		System.out.println(Operations.Calcul(2,5,'*'));
		
		System.out.println(Operations.Calcul(2,0,'/'));
		
		System.out.println(Operations.Calcul(2,4,'+'));
		System.out.println(Operations.Calcul(15,5,'/'));
		System.out.println(Operations.Calcul(2,5,'-'));
	}

}
