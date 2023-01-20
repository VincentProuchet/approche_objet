package fr.diginamic.testexceptions;

/**
 * Exception 
 * type reflection
 * lancée lors d'une erreur lors d'une tentative de reflexion sur une classe
 * 
 * @author Vincent
 *
 */
public class ReflectionException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public ReflectionException(String message) {
		System.err.println(message);
		
		
	}
}
