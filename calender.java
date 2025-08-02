package myproject;
import java.util.*;
public class calender {
public static void main(String args[]) {
	Calendar c =Calendar.getInstance();
	Date d = c.getTime();
	System.out.println(d);
	   c.set(2023 , c.SEPTEMBER , 13);
	int year = c.getWeekYear();
	System.out.println(year);
	int h = c.getFirstDayOfWeek();
	System.out.println(h);
	System.out.println("Day of week : " + c.get(Calendar.DAY_OF_WEEK));
	System.out.println("Day of year : " + c.get(Calendar.DAY_OF_YEAR));
	System.out.println("week in the month : " + c.get(Calendar.DAY_OF_MONTH));
	System.out.println("week in the year : " + c.get(Calendar.DAY_OF_YEAR));
	System.out.println("Day of week in month : " + c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
	System.out.println("HOUR : " + c.get(Calendar.HOUR));
	System.out.println("Minute : " + c.get(Calendar.MINUTE));
	System.out.println("Second : " + c.get(Calendar.SECOND));
	System.out.println("AM OR PM : " + c.get(Calendar.AM_PM));
	System.out.println("HOUR (24-HOUR CLOCK) : " + c.get(Calendar.HOUR_OF_DAY));	
}
}
