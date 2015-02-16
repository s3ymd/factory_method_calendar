package factory_sample_calendar;

import java.util.Calendar;

interface CalendarFactory {
	Calendar createCalendar(int year, int month, int dayOfMonth);
}

class SimpleCalendarFactory implements CalendarFactory {

	@Override
	public Calendar createCalendar(int year, int month, int dayOfMonth) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month - 1);
		cal.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		return cal;
	}

}

public class Main {

	public static void main(String[] args) {
		CalendarFactory factory = new SimpleCalendarFactory();
		Calendar cal = factory.createCalendar(2014, 8, 17);
		System.out.printf("%1$tY %1$tm %1$td %1$tH %1$tM %1$tS", cal);
	}
}
