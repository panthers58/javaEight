/*
 * A toinstant method has been added to the existing classes for backward compatibility
 */

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

import java.util.Date;

import java.time.Instant;
import java.time.ZoneId;


public class Java866Tester {
	
	public static void main(String[] args)
	{
		Java866Tester tester = new Java866Tester();
		tester.testBackwardCompatibility();
	}
	
	public void testBackwardCompatibility()
	{
		//Get the current date
		Date currentDate = new Date();
		printMessage(" Current Date : " + currentDate);
		
		//Get the Instant of the current date in milliseconds
		Instant now = currentDate.toInstant();
		ZoneId currentZone = ZoneId.systemDefault();
		
		//Get the LocalDate and Time
		LocalDateTime localDateTime = LocalDateTime.ofInstant(now,currentZone);
		printMessage("Local Date and Time : " + localDateTime);
		
		//Get the ZonelDate and Time
		ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(now,currentZone);
		printMessage("Zoned Date and Time : " + zonedDateTime);		
		
	}
	
	private void printMessage(String  x)
	{
		System.out.println(x);
	}
	

}
