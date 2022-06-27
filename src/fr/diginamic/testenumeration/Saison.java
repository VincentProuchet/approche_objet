package fr.diginamic.testenumeration;

/*
 * Représente les saison de l'année
 */
public enum Saison {
	/** valeur du printemps */
	PRINTEMPS("Printemps", 4),
	/** valeur de l'été */
	ETE("Ete", 4),
	/** valeur de l'automne */
	AUTOMNE("Automne", 4),
	/** valeur de l'hiver */
	HIVER("Hiver", 4);

	/** nom de la saison */
	final String nom;
	/** numéro d'ordre de la saison */
	final int numero;

	/**
	 * constructeur
	 */
	private Saison(String nom, int numero) {
		this.nom = nom;
		this.numero = numero;
	}
	/**Getter
	 * 
	 * @return le nom
	 */
	public String getNom() {
		return this.nom;
	}
	/** Getter
	 * 
	 * @return le numéro
	 */
	public int getNumero() {
		return this.numero;
	}

	/**
	 * Permet de récuperer une instance de Saison par le libellé
	 * 
	 * @param libelle nom de la saison souhaité
	 * @return une des instances de Saison null si rien ne correspond
	 */
	public static Saison getSaison(String libelle) {
		libelle = libelle.strip();
		Saison retour = null;
		for (Saison s : Saison.values()) {
			if (s.nom.equalsIgnoreCase(libelle)) {
				retour = s;
			}

		}

		return retour;
	}
}
