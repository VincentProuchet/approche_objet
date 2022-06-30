package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;
/** Classe de test des classe du package maison
 * 
 * @author Vincent
 *
 */
public class TestMaison {

	public static void main(String[] args) {
		Maison laBelleMaison = new Maison(1,1);
		laBelleMaison.ajouterPiece(new Salon(0,25));
		laBelleMaison.ajouterPiece(new Salon(25,0));
		laBelleMaison.ajouterPiece(new Cuisine(10,0));
		laBelleMaison.ajouterPiece(new WC(2,0));
		
		laBelleMaison.ajouterPiece(new WC(2,2));
		
		laBelleMaison.ajouterPiece(new SalleDeBain(10,1));
		laBelleMaison.ajouterPiece(new SalleDeBain(7,1));
		
		laBelleMaison.ajouterPiece(new Chambre(10,1));
		laBelleMaison.ajouterPiece(new Chambre(15,1));
		laBelleMaison.ajouterPiece(new Chambre(7,1));
		laBelleMaison.ajouterPiece(new Chambre(8,1));
		laBelleMaison.ajouterPiece(new WC(2,1));
		int etage = 1;
		
		System.out.println("La maison fait : "+ laBelleMaison.surface()+ " m²");
		System.out.println("L'étage "+ etage + " fait : " 
						+ laBelleMaison.surface(etage)+ " m²");
		etage= 0;
		System.out.println("L'étage "+ etage + " fait : " 
				+ laBelleMaison.surface(etage)+ " m²");
		etage= 2;
		System.out.println("L'étage "+ etage + " fait : " 
				+ laBelleMaison.surface(etage)+ " m²");
		System.out.println("le salon fait :" +  laBelleMaison.surface(new Salon(20,1)) + " m²" );
		System.out.println("il y a : " +  laBelleMaison.nombreDePieces(new Chambre(20,1))+ " chambres" );
		System.out.println("pour une surface totale de :" +  laBelleMaison.surface(new Chambre(20,1))+ " m²" );
		System.out.println("la cuisine fait :" +  laBelleMaison.surface(new Cuisine(20,1))+ " m²" );
		
		

	}

}
