package fr.diginamic.banque.dates;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestDates {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		Date dateDuJour = new Date();
		
		System.out.println(dateDuJour.getDate()+"/"+ dateDuJour.getMonth()+"/"+  dateDuJour.getYear() );
		
		Date date = new Date(2016,5,19,23,59,31);
		
		System.out.println(date.getDate()+"/"+ date.getMonth()+"/"+  date.getYear()+" "+date.getHours()+":"+date.getMinutes()+":"+date.getSeconds() );
		/////// BugFest
		System.out.println(date);
	}

}
