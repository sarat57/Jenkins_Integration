package Webservices;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class test {

	public static void main(String[] args) {
		
//		System.out.println("tet");
//		
//		ZonedDateTime utc = ZonedDateTime.now(ZoneOffset.UTC);
//		System.out.println(utc);
//		Calendar cal = Calendar.getInstance();
//		System.out.println(cal.getTime().after(Year.now().));
//		
		
		test t = new test();
		t.performCalendarArithmetic();
	}
	private void performCalendarArithmetic() {
	      //Set calendar to 6th March 2009
		ZonedDateTime utc = ZonedDateTime.now(ZoneOffset.UTC);
		
	     // new GregorianCalendar();
		Calendar cal = GregorianCalendar.from(utc);
	      //Add 4months and 5days
	      cal.add(Calendar.YEAR, 1);
	      //cal.add(Calendar.DAY_OF_MONTH, 5);
	      //Define Format of date
	      System.out.println();
	      SimpleDateFormat sdf = new SimpleDateFormat();
	      
	   
	   }

}
