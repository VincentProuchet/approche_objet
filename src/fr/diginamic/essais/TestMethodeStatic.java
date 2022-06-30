package fr.diginamic.essais;

/**
 * TP 04 
 * Ce TP avait pour but de montrer qu'il existe déjà beaucoup de 
 * méthodes intégré à JAVA
 * Méthodes qui en plus d'être souvent très optimisées 
 * peuvent faire gagner beaucoup de temps de développement
 * @author Vincent
 *
 */
public class TestMethodeStatic {

	public static void main(String[] args) {
		String chaine = "14";
		int nombre = Integer.parseInt(chaine);
		nombre = nombre*2;
		System.out.println(nombre);
		
		int a=45 ;
		int b=666 ;
		
		// répond à la comparaison par 1,0,-1 utile pour un switch
		// ou un if- else if - else
		System.out.println(Integer.compare(a, b));
		
		// affiche directement le plus grand
		System.out.println(Integer.max(a, b));
		

	}

}
