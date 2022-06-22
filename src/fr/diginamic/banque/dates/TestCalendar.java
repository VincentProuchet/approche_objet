package fr.diginamic.banque.dates;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2016, 4, 19, 23, 59, 30);
		Date date = cal.getTime();
		
		
		SimpleDateFormat format =new SimpleDateFormat("EEEE dd/MMMM/YYYY HH:mm:ss",Locale.FRANCE);
		
		Locale  russe  = new Locale("ru","RU");
		String dateAAfficher;
		
		
		System.out.println(date.getDate()+"/"+ date.getMonth()+"/"+  date.getYear()+" "+date.getHours()+":"+date.getMinutes()+":"+date.getSeconds() );
		/////// BugFest
		System.out.println(date);
		
		
		cal = Calendar.getInstance();
		cal.getTime();

		date = cal.getTime();
		
		System.out.println(date.getDate()+"/"+ date.getMonth()+"/"+  date.getYear()+" "+date.getHours()+":"+date.getMinutes()+":"+date.getSeconds() );
		/////// BugFest
		System.out.println(date);
		System.out.println("_______________________________________________________________________________________");
		
		dateAAfficher = format.format(date);
		System.out.println(dateAAfficher);
		format.setDateFormatSymbols(new DateFormatSymbols(Locale.CHINA));
		dateAAfficher = format.format(date);
		System.out.println(dateAAfficher);
		
		format.setDateFormatSymbols(new DateFormatSymbols(russe));
		dateAAfficher = format.format(date);
		System.out.println(dateAAfficher);

	}

}
