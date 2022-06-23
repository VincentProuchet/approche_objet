package fr.diginamic.testenumeration;

public enum Continent {
	EUROPE("Europe"),
	ASIE("Asie"),
	AFRIQUE("Afrique"),
	AMERIQUENORD("Amérqieu du nord"),
	AMERIQUESUD("Amérique du sud"),
	AUSTRALIE("Australie"),
	ND("Non définit")
	;
		
	public final String libelle;
	
	
	
	private Continent(String libelle) {
		this.libelle = libelle;
	}
}
