/*
 * This class explaines the method references that were introduced in Java 8.0 
 * Method references are used to point to methods by name. A method reference is described using "::" symbol
 */

import java.util.List;
import java.util.ArrayList;

public class Java82Tester {
	
	public static void main(String[] args)
	{
		List names = new ArrayList<String>();
		names.add("Mahesh");
		names.add("Suresh");
		names.add("Ramesh");
		names.add("Kalpesh");
		names.add("Naresh");
		
		names.forEach(System.out::println);
		
	}

}
