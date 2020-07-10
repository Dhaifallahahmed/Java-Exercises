
public class Animal {
	//The Five Fields of Animal class:
	private String name;
	private int brain;
	private int body;
	private int size;
	private int weight;
	//First constructor has 5 fields:
	public Animal(String name, int brain, int body, int size, int weight) {
		//Assign the 5 fields:
		this.name = name;
		this.brain = brain;
		this.body = body;
		this.size = size;
		this.weight = weight;
		System.out.println("ANIMALS WAS CALLED!!");
	}
	//Random method for Animal class:
	public void eat() {
		
	}
	//Another Random method for Animal class:
	public void move() {
		
	}
	//Get Methods for Animal's fields:
	public String getName() {
		return name;
	}
	public int getBrain() {
		return brain;
	}
	public int getBody() {
		return body;
	}
	public int getSize() {
		return size;
	}
	public int getWeight() {
		return weight;
	}
	
	

}
