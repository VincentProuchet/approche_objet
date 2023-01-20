package fr.diginamic.banque.dates;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
/** Classe pour tester l'API calendar de javaS
 * e tsurtout voir à quel point elle est mal fichue
 * @author Vincent
 *
 */
public class TestCalendar {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2016, 4, 19, 23, 59, 30);
		Date date = cal.getTime();
		
		
		System.out.println(date.getDate()+"/"+ date.getMonth()+"/"+  date.getYear()+" "+date.getHours()+":"+date.getMinutes()+":"+date.getSeconds() );
		/////// BugFest // les deux affichage donne des données différentes
		System.out.println(date);
		System.out.println("____________________________________________________________");
		
		cal = Calendar.getInstance();
		cal.getTime();

		date = cal.getTime();
		
		System.out.println(date.getDate()+"/"+ date.getMonth()+"/"+  date.getYear()+" "+date.getHours()+":"+date.getMinutes()+":"+date.getSeconds() );
		/////// BugFest
		System.out.println(date);
		System.out.println("_______________________________________________________________________________________");
		
		// pour s'éviter les problème d'inconstance et pouvoir se passer des methodes qui sont @Deprecated et finiront par disparaître 
		// on créer un SimpleDateFormat,Sdf pour  les intimes
		SimpleDateFormat format =new SimpleDateFormat("EEEE dd  MMMM  YYYY HH:mm:ss",Locale.FRANCE);		
		String dateAAfficher;		
		dateAAfficher = format.format(date);
		System.out.println(dateAAfficher);
		format.setDateFormatSymbols(new DateFormatSymbols(Locale.GERMAN));
		dateAAfficher = format.format(date);
		System.out.println(dateAAfficher);
		// on passe le format en chinoi
		format.setDateFormatSymbols(new DateFormatSymbols(Locale.CHINA));
		dateAAfficher = format.format(date);
		System.out.println(dateAAfficher);
		format.setDateFormatSymbols(new DateFormatSymbols(Locale.JAPANESE));
		dateAAfficher = format.format(date);
		System.out.println(dateAAfficher);
		format.setDateFormatSymbols(new DateFormatSymbols(Locale.JAPAN));
		dateAAfficher = format.format(date);
		System.out.println(dateAAfficher);
		// pour le russe il faut créer manuellement l'instance locale
		format.setDateFormatSymbols(new DateFormatSymbols(new Locale("ru","RU")));		
		dateAAfficher = format.format(date);
		System.out.println(dateAAfficher);

	}

}
