/*
 * Java 8 introduces a new concept of default method implementation in interfaces
 */


public class java84Tester {
	
	public static void main(String[] args)
	{
		Vehicle car = new Car();
		car.print();
	}

}

interface Vehicle {
	
	default void print()
	{
		System.out.println("I am a vehicle");
	}
	
	default void blowHorn() {System.out.println("Blowing Horn");}
	
}

interface FourWheeler {
	default void print() {System.out.println("I am a FourWheeler");};
	
}

class Car implements Vehicle, FourWheeler 
{
	public void print()
	{
		Vehicle.super.print();
		Vehicle.super.blowHorn();
		FourWheeler.super.print();
		System.out.println("I am a Car");
	}
}