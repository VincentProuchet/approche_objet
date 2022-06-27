package fr.diginamic.testenumeration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
/**Test sur l'énumération Saison
 * 
 * @author Vincent
 *
 */
public class SaisonTest {

	@Test
	public void saisonsExistante() {
		assertEquals("Printemps",Saison.PRINTEMPS.nom);
	}
	@Test
	public void saisonInvalides() {
		assertNotEquals("qztqgfqvqeg", Saison.ETE.nom);
		
	}
	@Test
	public void saisonNull() {
		assertNotEquals(null, Saison.AUTOMNE.nom);
	}
}

