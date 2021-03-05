package Singleton_Car;

public class TestCar {
	public static void main (String args[])
	{
		Singleton car1 = Singleton.getInstance();
		Singleton car2 = Singleton.getInstance();
		Singleton car3 = Singleton.getInstance();
		
		car1.setI(54);
		car2.setI(82);		// It overrides the value 54.
		
		System.out.println("Speed: " + car1.getI());
		System.out.println("Speed: " + car2.getI());
		
		print("My Bugatti", car1);
		print("My Lamborghini", car2);
		print("My Mercedes", car3);
	}
	
	static void print(String carName, Singleton obj)
	{
		System.out.println(String.format("My Car : %s, HashCode : %d", carName, 
				obj.hashCode()));
	}
}