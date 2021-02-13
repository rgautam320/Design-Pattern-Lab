package Builder_Car;

public class MainBuilder {

	public static void main(String[] args) {
		
		MyCar car1 = new CarBuilder().setcarBrand("Ferrari").setcarModel("Portofino").setcarMileage(21).getCarDetails();
		
		MyCar car2 = new CarBuilder().setcarBrand("Mercedes").setcarColor("White").setcarMass(5000).setcarEngine("Diesel").setcarMileage(19).getCarDetails();
		
		MyCar car3 = new CarBuilder().setcarBrand("Maruti").setcarEngine("Engine").setcarColor("Red").setcarMass(6200).setcarID(126435).setcarModelYear(2015).getCarDetails();
		
		MyCar car4 = new CarBuilder().setcarBrand("Bugatti").setcarColor("Blue").setcarID(543412).setcarModelYear(2019).setcarMass(4900).setcarMileage(20).getCarDetails();
		
		MyCar car5 = new CarBuilder().setcarBrand("Lamborghini").setcarColor("Blue").setcarID(154642).setcarModelYear(2018).setcarModel("Aventador SVJ").setcarMileage(17).getCarDetails();
		
		MyCar car6 = new CarBuilder().setcarBrand("Tesla").setcarModel("S").setcarColor("Silver").setcarEngine("Electric").setcarModelYear(2020).setcarMileage(20).getCarDetails();
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		System.out.println(car4);
		System.out.println(car5);
		System.out.println(car6);
	}
}
