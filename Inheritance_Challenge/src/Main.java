
public class Main {

	public static void main(String[] args) {

		Toyota toyota=new Toyota(20);
		//Calling a method from Toyota Class: 
		toyota.accelerate(30);
		//Calling a method from Car Class:
		toyota.Changegear(4);
		//Calling  method from Vehicle Class:
		toyota.steer(3);
	}

}
