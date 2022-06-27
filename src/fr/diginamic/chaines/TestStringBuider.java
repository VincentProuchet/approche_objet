package fr.diginamic.chaines;
/**Classe de test de la librairie StringBuilder
 * Le but ici est de montrer la différence en terme de performances entre
 * la concaténation brute de l'opérateur +
 * l'utilisdation de stringbuilder et sa méthode append
 * 
 * @author Vincent
 *
 */
public class TestStringBuider {

	public static void main(String[] args) {
		StringBuilder chaine = new StringBuilder();
		long debut = System.currentTimeMillis();
		
		
		for(int i=1; i<100_000;i++) {
			chaine.append(i);
			
		
		}
		long fin = System.currentTimeMillis();
		System.out.println("Le string builder ");
		System.out.println("l'opération à durée :" + (fin-debut));
		String  concat = "";
		debut =  System.currentTimeMillis();
		for(int i=1; i<100_000;i++) {
			concat += i;
			
		
		}
		fin = System.currentTimeMillis();
		
		
		System.out.println("Le concat ");
		System.out.println("l'opération à durée :" + (fin-debut));
		
		
	}

}
