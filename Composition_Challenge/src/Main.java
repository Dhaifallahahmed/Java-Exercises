
public class Main {

	public static void main(String[] args) {
	
		Wall theWall=new Wall("left");
		theWall.getDirction();
		Ceiling theCeiling=new Ceiling(3, 87);
		theCeiling.getPaintcolor();
		Lamp theLamp=new Lamp("Old", true, 7);
		theLamp.turnOn();
		Bed theBed=new Bed("Modren", 3, 200, 2, 2);
		theBed.make();
		Bedroom theBedroom=new Bedroom("Mine", theWall, theWall, theWall, theWall, theCeiling, theBed, theLamp);
		theBedroom.getLamp().turnOn();
	
	}

}
