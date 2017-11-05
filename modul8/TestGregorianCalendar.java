package modul8;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestGregorianCalendar {
	
	public static void main(String[] args) {
		Calendar kalender = new GregorianCalendar();
		System.out.println("Året er: " + kalender.get(Calendar.YEAR));
		System.out.println("Måned er: " + kalender.get(Calendar.MONTH));
		System.out.println("Dag er: " + kalender.get(Calendar.DAY_OF_MONTH));
		kalender.setTimeInMillis(1000000000L);
		System.out.printf("\nDatoen er: %tF", kalender);
		kalender.setTimeInMillis(10000000000L);
		System.out.printf("\nDatoen er: %tF", kalender);
		kalender.setTimeInMillis(100000000000L);
		System.out.printf("\nDatoen er: %tF", kalender);
		kalender.setTimeInMillis(1000000000000L);
		System.out.printf("\nDatoen er: %tF", kalender);
		kalender.setTimeInMillis(10000000000000L);
		System.out.printf("\nDatoen er: %tF", kalender);
		kalender.setTimeInMillis(100000000000000L);
		System.out.printf("\nDatoen er: %tF", kalender);
		
	}

}
