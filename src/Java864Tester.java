/*
 * This java class presents the functionality of two new classes addedd in Java 8.0 Period and Duration
 * Period - deals with date based amount of time
 * Duration - deals with time based amount of time
 */
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.Duration;


public class Java864Tester {

	public static void main(String[] args) {
		// Test the different methods of the class
		Java864Tester tester = new Java864Tester();
		tester.testPeriod();
		tester.testDuration();

	}
	
	public void testPeriod()
	{
		//Get the current date
		LocalDate date1 = LocalDate.now();
		printMessage("Current Date : " + date1);
		
		//Add 1 month to the current date
		LocalDate date2 = date1.plus(1, ChronoUnit.MONTHS);
		printMessage("Next Month : " + date2);
		
		//Determine the period betweem the two dates
		Period period = Period.between(date1, date2);
		printMessage("Period : " + period);
		
	}
	
	public void testDuration()
	{
		//Get the current time
		LocalTime time1 = LocalTime.now();
		printMessage("Current Date : " + time1);
		
		//Add two hours to the current time
		LocalTime time2 = time1.plus(Duration.ofHours(2));
		printMessage("Later Time : " + time2);
		
		//Determine the duration between the two dates
		Duration duration = Duration.between(time1, time2);
		printMessage("Duration : " + duration);
	}
	
	private void printMessage(String  x)
	{
		System.out.println(x);
	}

}
