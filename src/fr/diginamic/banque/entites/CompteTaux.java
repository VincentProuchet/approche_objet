package fr.diginamic.banque.entites;
/* TP 8
 * 
 */
public class CompteTaux extends Compte {
	
	private float txRemuneration;
	
	public CompteTaux(String numero, int solde, float tx) {
		super(numero, solde);
		this.txRemuneration = tx;
	}
	
	
	  @Override
	  public String toString() { 
		  return (super.toString()
				  +" et a un taux de : " 
				  + this.txRemuneration +"%" ); }
	 

}
