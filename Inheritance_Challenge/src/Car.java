
public class Car extends Vehicle {
	private int wheels;
	private int doors;
	private int gears;
	private boolean ismanual;
	
	private int currentgear;

	public Car(String name, String size, int wheels, int doors, int gears, boolean ismanual) {
		super(name, size);
		this.wheels = wheels;
		this.doors = doors;
		this.gears = gears;
		this.ismanual = ismanual;
		this.currentgear = 1;
	}

	public void Changegear(int currentgear) {
		this.currentgear = currentgear;
		//test if it was implemented:
		System.out.println("Changegear() was implemented , changed to : "+this.currentgear);
	}
	  public void ChangeSpeed(int speed,int dirction) {
		
		  System.out.println("ChangeSpeed() was called , Speed :"+speed+" Dirction: "+dirction);
		  move(speed, dirction);
	}

	

	  
}
