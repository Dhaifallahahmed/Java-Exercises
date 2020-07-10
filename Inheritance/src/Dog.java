
//Dog class extends from Animal class:
public class Dog extends Animal {
	//Extra Dog's fields :
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;

	//First Constructor for Dog class has the 5 fields :
	public Dog(String name, int size, int weight,int eyes,int legs,int tail,int teeth,String coat) {
		
		super(name, 1, 1, size, weight);
		//initializing Dog's fields:
		this.eyes=eyes;
		this.legs=legs;
		this.tail=tail;
		this.teeth=teeth;
		this.coat=coat;
		
	}

	public int getEyes() {
		return eyes;
	}

	public int getLegs() {
		return legs;
	}

	public int getTail() {
		return tail;
	}

	public int getTeeth() {
		return teeth;
	}

	public String getCoat() {
		return coat;
	}

}
