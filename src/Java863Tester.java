/*
 * This class demonstrates the value of java.time.temporal.ChronoUnit enum
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Java863Tester {
	
	public static void main(String[] args)
	{
		Java863Tester tester = new Java863Tester();
		tester.testChronoUnits();
	}
	
	public void testChronoUnits()
	{
		//Get the current Date
		LocalDate today = LocalDate.now();
		printMessage("Current Date : " + today);
		
		//add 1 week to the current date
		LocalDate nextWeek = today.plus(1,ChronoUnit.WEEKS);
		printMessage("Next Week : " + nextWeek);
		
		//add 1 month to the current date
		LocalDate nextMonth = today.plus(1,ChronoUnit.MONTHS);
		printMessage("Next Month : " + nextMonth);		
		
		//add 1 year to the current date
		LocalDate nextYear = today.plus(1,ChronoUnit.YEARS);
		printMessage("Next Week : " + nextYear);		
				
		//add 10 years to the current date
		LocalDate nextDecade = today.plus(1,ChronoUnit.DECADES);
		printMessage("Next Week : " + nextDecade);		
		
		
	}
	
	private void printMessage(String  x)
	{
		System.out.println(x);
	}
	

}
