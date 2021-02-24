package Prototype_Car;

import java.util.List;
import java.util.Scanner;

public class Prototype {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Car car = new Car();
		car.insertData();
		
		System.out.print("List Before Modification: ");
		System.out.println(car.getCarList());
		
		Car myCar = (Car) car.clone();
		List<String> list = myCar.getCarList();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a new Car to add : ");
		String add_car = scanner.nextLine();
		
		list.add(add_car);
		System.out.println("After Adding " + add_car + " : " + myCar.getCarList());
		
		System.out.print("Enter a Car to remove : ");
		String remove_car = scanner.nextLine();
		scanner.close();
		
		list.remove(remove_car);
		System.out.println("After Removing " + remove_car + " : " + myCar.getCarList());

	}	
}