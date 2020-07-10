
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

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		//override this method and add to it to test it:
		System.out.println("Dog Eats method was called");
		//test animals eat method:
		super.eat();
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
