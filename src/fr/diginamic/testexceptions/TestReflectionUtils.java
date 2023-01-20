package fr.diginamic.testexceptions;

import fr.diginamic.entities.Ville;

/**
 * classe de test de relfection utils
 * @author Vincent
 *
 */
public class TestReflectionUtils {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, ReflectionException {
		Ville ville = new Ville("Béziers",77500);
		System.out.println(ville);
		
		ReflectionUtils.afficherAttributs(ville);
		// TODO Auto-generated method stub

	}

}
