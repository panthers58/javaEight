/*
 * Java 8 has a lot of functional interfaces that can be used within Lamda functions.
 * Functional Interfaces have single functionality to exhibit. 
 * Functional interfaces are present in the java package java.util.Function
 * The following class demonstrates the Predicate function. It has only one method, which signifies whether the 
 * object being tested is true or false
 */
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Java83Tester {

	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		//Predicate n-> true
		//n is passed as a paramter to test the Predicate method
		//test method will return true no matter what the value of n is
		System.out.println("First List");
		eval(list,n->true);
		
		//Predicate n -> n%2 == 0
		//n is passed as an parameter to the predicate function
		//while print the values of n, who remainder when divided by 2 is zero. This means even number
		System.out.println("Second List");
		eval(list, n -> n%2 == 0);
		
		//Predicate n -> n > 3
		//n is passed as an paramter to the predicate function
		//while print the values of n, whose value is greater than 3
		System.out.println("Third List");
		eval(list, n -> n >3);
		
	}
	
	public static void eval(List<Integer> list, Predicate<Integer> predicate)
	{
		
		for (Integer n: list)
		{
			if (predicate.test(n))
			{
				System.out.println(n);
			}
		}
	}
	
}
