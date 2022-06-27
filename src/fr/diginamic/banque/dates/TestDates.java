package fr.diginamic.banque.dates;

import java.util.Date;
/**Classe pour tester l'API Date de Java
 * 
 * @author Vincent
 *
 */
public class TestDates {

	public static void main(String[] args) {
		
		Date dateDuJour = new Date();
		
		System.out.println(dateDuJour.getDate()+"/"+ dateDuJour.getMonth()+"/"+  dateDuJour.getYear() );
		
		Date date = new Date(2016-1900,5,19,23,59,31);
		
		System.out.println(date.getDate()+"/"+ date.getMonth()+"/"+  date.getYear()+" "+date.getHours()+":"+date.getMinutes()+":"+date.getSeconds() );
		/////// BugFest // aucune constance entre les affichages pour une même date.
		System.out.println(date);
	}

}
