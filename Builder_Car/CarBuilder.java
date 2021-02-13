package Builder_Car;

public class CarBuilder {
	private String carBrand;
	private String carModel;
	private int carModelYear;
	private int carID;
	private String carColor;
	private double carMass;
	private String carEngine;
	private double carMileage;

	public CarBuilder setcarBrand(String carBrand) {
		this.carBrand = carBrand;
		return this;
	}

	public CarBuilder setcarModel(String carModel) {
		this.carModel = carModel;
		return this;
	}

	public CarBuilder setcarModelYear(int carModelYear) {
		this.carModelYear = carModelYear;
		return this;
	}

	public CarBuilder setcarID(int carID) {
		this.carID = carID;
		return this;
	}

	public CarBuilder setcarColor(String carColor) {
		this.carColor = carColor;
		return this;
	}

	public CarBuilder setcarMass(double carMass) {
		this.carMass = carMass;
		return this;
	}

	public CarBuilder setcarEngine(String carEngine) {
		this.carEngine = carEngine;
		return this;
	}

	public CarBuilder setcarMileage(double carMileage) {
		this.carMileage = carMileage;
		return this;
	}

	public MyCar getCarDetails() {
		return new MyCar(carBrand, carModel, carModelYear, carID, carColor, carMass, carEngine, carMileage);
	}
}