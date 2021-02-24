package Prototype_Car;

import java.util.ArrayList;
import java.util.List;

class Car implements Cloneable
{
	private List<String> carList;
	
	public Car()
	{
		this.carList = new ArrayList<String>();
	}
	
	public Car(List<String> list)
	{
		this.carList = list;
	}
	
	public void insertData()
	{
		carList.add("Bugatti");
		carList.add("Rolls Royce");
		carList.add("Koenigsegg");
		carList.add("Lykan");
		carList.add("Lamborghini");
		carList.add("McLaren");
		carList.add("Aston Martin");
	}
	
	public List<String> getCarList()
	{
		return this.carList;
	}
	
	public Object clone() throws CloneNotSupportedException 
	{
		List<String> tempList = new ArrayList<String>();
		for(String s : this.getCarList())
		{
			tempList.add(s);
		}
		return new Car(tempList);
	}
	
}
