package fr.diginamic.banque.dates;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.util.Date;
/**Classe pour tester l'API Date de Java
 * et voir que c'est pas vraiment mieux que Date
 * @author Vincent
 *
 */
public class TestDates {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Date dateDuJour = new Date();
		
		System.out.println(dateDuJour.getDate()+"/"+ dateDuJour.getMonth()+"/"+  dateDuJour.getYear() );
		
		
		Date date = new Date(115-1900,5,19,23,59,31);
		// pour les transformer en local dateTime
		Instant instant = date.toInstant();
		 ZonedDateTime.from(instant);
		
		
		
		
		System.out.println(date.getDate()+"/"+ date.getMonth()+"/"+  date.getYear()+" "+date.getHours()+":"+date.getMinutes()+":"+date.getSeconds() );
		/////// BugFest // aucune constance entre les affichages pour une même date.
		System.out.println(date);
		System.out.println("______________________________________________________________________________________");
		// le Date et le calendar son à oublier 
		// preferez localDate
		
		LocalDate day = LocalDate.of(2022,01,10);
		System.out.println(day.getDayOfYear());
		
		//  localTime
		LocalTime time1 = LocalTime.parse("17:16:23");
		System.out.println(time1);
		// LocalDateTime
		
		LocalDateTime dateTime = LocalDateTime.of(day, time1);
		System.out.println(dateTime);
		
		
		LocalDateTime dateTime2 = LocalDateTime.parse("1981-10-09T23:05:32");
		
		Duration dureeDuration = Duration.between(dateTime, dateTime2);
		System.out.println(dureeDuration);
		
		Period period = Period.between(dateTime.toLocalDate(), dateTime2.toLocalDate());
		System.out.println(period);
		
		
	}

}
