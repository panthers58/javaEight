
/*
 * This class is associated with various types of ability to use the LAMBDA expressions
 */


public class Java81Tester {
	
	public static void main(String[] args) {
		
		Java81Tester tester = new Java81Tester();
		
		//with type decleration
		MathOperation addition = (int a, int b) -> a + b;
		
		//without type decleration
		MathOperation substraction = (a,b) -> a - b;
		
		//with return statement and curly braces
		MathOperation multiplication = (a,b) -> { return a*b ;};
		
		//without return statement and curly braces
		MathOperation division = (a,b) -> a/b;
		
		//Testing the mathematical operations
		System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
		System.out.println("10 - 5 = " + tester.operate(10, 5, substraction));
		System.out.println("10 * 5 = " + tester.operate(10, 5, multiplication));
		System.out.println("10 / 5 = " + tester.operate(10, 5, division));
		
		
		GreetingService service1 = message -> System.out.println("Hello " + message);
		service1.sayMessage("Mahesh");
		
		}

	
	private int operate(int a, int b, MathOperation mathOperation)
	{
		return mathOperation.operation(a, b);
	}
	
	interface MathOperation {
		int operation (int a, int b);
	}
	
	interface GreetingService
	{
		void sayMessage(String message);
	}

}
