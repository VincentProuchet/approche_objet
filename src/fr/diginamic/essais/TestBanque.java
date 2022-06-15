package fr.diginamic.essais;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

/** TP 8
 * 
 * @author Vincent
 *
 */
public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Compte[] comptesClients = new Compte[6] ;
		
		comptesClients = ajouterCompte(new Compte("154 681 308", 150),comptesClients);
		comptesClients = ajouterCompte(new CompteTaux("248 468 794", 200, 0.5f),comptesClients);
		comptesClients = ajouterCompte( new CompteTaux("125 548 646", 2500, 2),comptesClients);;
		
		for(int i=0;i< comptesClients.length;i++) {
			System.out.println(comptesClients[i]);
		}
	
	}
	/**La fonction ajoute la nouvelle variable
	 * dans le tableau passé en paramètres 
	 * ajusteras la taille si neccessaire
	 * 
	 * @param nouvelleCreature valeur à ajouter au tableau
	 * @param creatures[] tableau de destination
	 * @return creatures[] tableau avec valeur ajoutée
	 */
	public static Compte[] ajouterCompte(Compte nouvelleCreature, Compte[] creatures) {
		// variable de comptage des valeurs non nulles 
		int valeursNonNulles = 0;
		if (nouvelleCreature != null ) {
			// si le tableau n'a pas de taille
			if (creatures == null) {
				// on créer le tableau avec une taille d'une case
				creatures = new Compte[1];
				// on place la dernière entrée à la fin
				creatures[0] = nouvelleCreature;

			} else {
				// on compte les valeurs non nulle du tableau de destination
				for (int i = 0; i < creatures.length; i++) {
					if (creatures[i]!=null) {
						valeursNonNulles++;
					}					 
				}
				// on crée un tableau à la taille adapté
				Compte[] temp = new Compte[valeursNonNulles + 1];
				
				for (int i = 0; i < creatures.length; i++) {
					// chaque element non null du tableau est copié dans le nouveau tableau 
					if(creatures[i]!= null) {
						temp[i] = creatures[i];
					}
					
				}
				// on place la nouvelle valeur à la fin
				temp[temp.length - 1] = nouvelleCreature;
				// et on écrase l'ancien tableau trop petit
				creatures = temp;
				// le garbage collector s'occuperas du reste
			}
		}
		// et on renvoi le tableau parce qu'on est dans un contexte qui le necessite
		return creatures;
	}
}
