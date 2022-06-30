package fr.diginamic.essais;

import fr.diginamic.salaire.Intervenant;
import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;
/** TP J3 
 *  Calcul Salaire
 *  Classe de test des classes Salarie et Pigistes
 * @author Vincent
 *
 */
public class TestIntervenant {
	public static Intervenant[] employesPresents = new Intervenant[2];

	public static void main(String[] args) {
		
		employesPresents[0] = new Salarie("O'neil","Jack",3100);
		employesPresents[1] = new Pigiste("Duffy","Patrick",200);
		validerJournee();
		validerJournee();
		validerJournee();
		validerJournee();
		validerJournee();
		validerJournee();
		Push(new Pigiste("Roberts","Eric",300));
		validerJournee();
		validerJournee();
		validerJournee();
		validerJournee();
		validerJournee();
		validerJournee();
		afficherSalaires();
		
		
	}
	/** valide une journée 
	 * pour chaque employés présents dans le tableau  
	 * employesPresents
	 * 
	 */
	public static void validerJournee() {
		for(int i=0;i<employesPresents.length;i++) {
			employesPresents[i].ValiderJournee();
		}
	}
	/** affiche les salaire de chaque employe
	 * du tableau employesPresents
	 * 
	 */
	public static void afficherSalaires() {
		for(int i=0;i<employesPresents.length;i++) {
			employesPresents[i].AfficherDonnees();
			
		}
	}
	
	/**ajoute l'intervenant au tableau des présent
	 * 
	 * @param it intervenant à ajouter aux présents
	 */
	public static void Push(Intervenant it) {
		// si le tableau n'a pas de taille
		if (employesPresents == null) {
			// on créer le tableau avec une taille d'une case
			employesPresents = new Intervenant[1];
			// on place la dernière entrée à la fin
			employesPresents[0] = it;
			
		} else {
			// on crée un tableau plus grand
			Intervenant[] temp = new Intervenant[TestIntervenant.employesPresents.length + 1];
			// on y copie chaque valeur du tableau d'origine
			for (int i = 0; i < TestIntervenant.employesPresents.length; i++) {
				temp[i] = TestIntervenant.employesPresents[i];
			}
			
			// on place la nouvelle valeur à la fin
			temp[temp.length-1] = it;
			// et on écrase l'ancien tableau trop petit
			TestIntervenant.employesPresents = temp;
			// le garbage collector s'occuperas du reste
		}
	}

}