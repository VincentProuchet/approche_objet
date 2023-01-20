package fr.diginamic.utils;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Vincent
 *
 */
public class StringUtilsTest {

	/**
	 * 
	 */
	@Test
	public void testDeDistance1() {

		assertEquals(1, StringUtils.levenshteinDistance("chat", "chats"));
		assertEquals(1, StringUtils.levenshteinDistance("machins", "machine"));
		assertEquals(1, StringUtils.levenshteinDistance("avion", "aviron"));
	}

	/**
	 * 
	 */
	@Test
	public void testDeDistance2() {

		assertEquals(2, StringUtils.levenshteinDistance("chien", "chine"));
		assertEquals(2, StringUtils.levenshteinDistance("distance", "instance"));

	}
	/**
	 * 
	 */
	@Test (expected = NullPointerException.class)
	public void testNull() {
		assertEquals(null,StringUtils.levenshteinDistance(null, null));
		// avoir du code qui renvoit du nullpointer
		// c'est pas bien
		// fait des modification pour gérer le cas du null
	}

}
