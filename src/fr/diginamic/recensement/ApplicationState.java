package fr.diginamic.recensement;

/**
 * Enumératuin d'état du programme
 * @author Vincent
 *
 */
public enum ApplicationState {
	
	/** Fermeture demandé le programme doit libérer les resources */
	Fermeture	
	,/** Demarrage en cours du programme */
	Demarrage
	,/** Continuer l'execution */
	Continuer
	,/** demande d'afficher Menu Principal */
	AfficherMenuPrincipal
	,/** attente de saisie utilisateur */
	PrendreSaisieUtilisateur
}
