/*
 * Optional is a container object used to contain non-null objects
 * Optional class has various utility methods to facilitate code to handle values as 'available' or 
 * 'not available' instead of checking null values .
 * The class is available in java.util
 */
import java.util.Optional;


public class java85Tester {
	
	public static void main(String[] args)
	{
		java85Tester tester = new java85Tester();
		
		Integer value1 = null;
		Integer value2 = new Integer(10);
		
		//Optional.ofNullable - allows passed parameter to be null
		Optional<Integer> a = Optional.ofNullable(value1);
		
		//Optional.of - throws a null pointer exeption if a null value is passed
		Optional<Integer> b = Optional.ofNullable(value2);
		tester.sum(a, b);
	}
	
	
	public Integer sum(Optional<Integer> a, Optional<Integer> b)
	{
		Integer value1, value2;
		
		//Optional isPresent method checks if the value is present
		System.out.println("First parameter is present : " + a.isPresent());
		System.out.println("Second parameter is present : " + b.isPresent());
		
		//Optional.orElse - returns the value if present otherwise returns the default value that is passed
		value1 = a.orElse(new Integer(0));
		
		//optional.get - gets the value that is present
		value2 = b.get();
		
		System.out.println(value1 + value2);
		return value1 + value2;
		
	}

}
