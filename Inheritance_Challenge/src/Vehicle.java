
public class Vehicle {
	private String name;
	private String size;
	
	private int currentspeed;
	private int currentDirction;
	//Constructor:
	public Vehicle(String name, String size) {
		this.name = name;
		this.size = size;
		currentspeed=0;
		currentDirction=0;
	}
	//Steer method:
	public void steer(int dirction) {
		this.currentDirction+=dirction;
		//Test if it was called :
		System.out.println("Steer() Was Called , Move to the dirction :"+currentDirction);
	}
	//Move method:
	public void move(int speed,int dirction) {
		currentDirction=dirction;
		currentspeed=speed;
		//test if it was called :
		System.out.println("Move() was calld , moving at"+currentspeed+" to the dirction :"+currentDirction);
		
	}
	public String getName() {
		return name;
	}
	public String getSize() {
		return size;
	}
	public int getCurrentspeed() {
		return currentspeed;
	}
	public int getCurrentDirction() {
		return currentDirction;
	}
	public void stop() {
		this.currentspeed=0;
		
	}
}
