package fr.diginamic.banque.entites;
/* TP 8
 * Représent un compteTaux
 */
public class CompteTaux extends Compte {
	/**taux de rémunération du compte*/
	private float txRemuneration;
	/**
	 * Constructeur
	 * @param numero
	 * @param solde
	 * @param tx
	 */
	public CompteTaux(String numero, int solde, float tx) {
		super(numero, solde);
		this.txRemuneration = tx;
	}
	/** 
	 * @return un chaine de caractére représentant un compte taux
	 * au format 
	 * String+[Numero]+ String+[Solde]+String +[txRemuneration]+String
	 */
	 @Override
	  public String toString() { 
		  return (super.toString()
				  +" et a un taux de : " 
				  + this.txRemuneration +"%" ); }
	 

}
