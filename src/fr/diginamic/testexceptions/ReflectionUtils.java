package fr.diginamic.testexceptions;

import java.lang.reflect.Field;

/**
 * Classe donnée lors du TP sur les Exceptions
 * 
 *
 */
public class ReflectionUtils {
	public static void afficherAttributs(Object obj) throws IllegalArgumentException, IllegalAccessException, ReflectionException {
		
		if(obj==null) {
			throw new ReflectionException("Object is null");
		}
		// On commence par récupérer la classe de l'objet passée en paramètre.
		// la classe fournit toutes les informations sur la structure d'un objet.
		Class<?> classe = obj.getClass();
		// Sur cette classe on récupère le tableau des variables d'instance
		Field[] fields = classe.getDeclaredFields();
		// On fait une boucle sur ce tableau
		for (Field field : fields) {
			// On force l'accès à l'attribut depuis une classe externe.
			// Un peu comme si je forçais l'attribut en lisibilité public.
			field.setAccessible(true);
			// Affichage
			System.out.println("La valeur de l'attribut " + field.getName() + " est " + field.get(obj));
		}
	}
}
