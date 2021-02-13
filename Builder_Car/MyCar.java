package Builder_Car;

public class MyCar {
	private String carBrand;
	private String carModel;
	private int carModelYear;
	private int carID;
	private String carColor;
	private Double carMass;
	private String carEngine;
	private Double carMileage;
	
	public MyCar(String carBrand, String carModel, int carModelYear, int carID, String carColor, double carMass, String carEngine, double carMileage)
	{
		super();
		this.carBrand = carBrand;
		this.carModel = carModel;
		this.carModelYear =carModelYear;
		this.carID = carID;
		this.carColor = carColor;
		this.carMass = carMass;
		this.carEngine = carEngine;
		this.carMileage = carMileage;
	}
	
	@Override
	public String toString()
	{
		return "Car[Brand: " + carBrand + ", Model: " + carModel + ", Model Year: " + carModelYear
				+ ", ID: " + carID + ", Color: " + carColor + ", Mass: " + carMass 
				+ " kg, Engine: " + carEngine + ", Mileage: " + carMileage + " km]";
	}
}
