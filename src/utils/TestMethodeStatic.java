package utils;

public class TestMethodeStatic {

	public static void main(String[] args) {
		String chaine = "14";
		int nombre = java.lang.Integer.parseInt(chaine);
		
		System.out.println(nombre);
		
		int a=45 ;
		int b=666 ;
		
		// répond à la comparaison par 1,0,-1 utile pour un switch
		// ou un if- else if - else
		System.out.println(Integer.compare(a, b));
		
		// affiche directmeent le plus grand
		System.out.println(Integer.max(a, b));
		

	}

}
