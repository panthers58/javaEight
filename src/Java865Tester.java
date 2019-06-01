/*
 * The Temporal adjuster class is used for date mathematics
 */

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.time.DayOfWeek;

public class Java865Tester {

	public static void main(String[] args) {
		Java865Tester tester = new Java865Tester();
		tester.testAdjusters();

	}
	
	public void testAdjusters()
	{
		
		//Get the current date
		LocalDate date1 = LocalDate.now();
		printMessage("Current Date : " + date1);
		
		//Get the next Tuesday
		LocalDate nextTuesday = date1.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
		printMessage("Next Tuesday : " + nextTuesday);
		
		//Get the second Saturday of the this month
		//First Get the first day of this month
		LocalDate firstInYear = LocalDate.of(date1.getYear(), date1.getMonth(), 1);
		printMessage("First Day of Month : " + firstInYear);
		
		//Next get the first Saturday of the month
		LocalDate firstSaturday = firstInYear.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY));
		printMessage("First Saturday of Month : " + firstSaturday);
		
		//Get the next Saturday of the month
		LocalDate nextSaturday = firstSaturday.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		printMessage("Second Saturday of Month : " + nextSaturday);
				
		
		
	}

	private void printMessage(String  x)
	{
		System.out.println(x);
	}
	
}
