package Singleton_Car;

public class Singleton {
	public static Singleton soleInstance = new Singleton();
	public int i;
	
	private Singleton()
	{
		System.out.println("Car Created...");
	}
	
	public static Singleton getInstance()
	{
		return soleInstance;
	}
	
	public int getI()
	{
		return i;
	}
	
	public static void setSoleInstance(Singleton soleInstance)
	{
		Singleton.soleInstance = soleInstance;
	}
	
	public void setI(int i)
	{
		this.i = i;
	}
}