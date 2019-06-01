/*
 * Simplified date-time handling with no complexity of timezone
 */
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;

public class Java861Tester {
	
	public static void main(String[] args)
	{
		Java861Tester tester = new Java861Tester();
		tester.getLocalDateAndTime();
		
	}
	
	public void getLocalDateAndTime()
	{
		//Get the current local date and time
		LocalDateTime currentTime = LocalDateTime.now();
		printMessage("Current DateTime : " + currentTime);
		
		LocalDate date1 = currentTime.toLocalDate();
		printMessage("date1: " + date1);
		
		//get Month, Day of Month and seconds
		Month month = currentTime.getMonth();
		int day = currentTime.getDayOfMonth();
		int seconds = currentTime.getSecond();
		
		printMessage("Month : " + month + " Day of Month: " + day + " Seconds : " + seconds);
		
		LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
		printMessage("Date2 : " + date2);
		
		//12 december 2014
		LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
		printMessage("Date3: " + date3);
		
		//22 hours and 15 mins
		LocalTime date4 = LocalTime.of(22,15);
		printMessage("Date4: " + date4);
		
		//Parse as a string
		LocalTime date5 = LocalTime.parse("20:15:30");
		printMessage("Date5: " + date5);
		
	}
	
	private void printMessage(String  x)
	{
		System.out.println(x);
	}
	
	

}
