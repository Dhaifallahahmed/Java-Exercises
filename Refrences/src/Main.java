
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//first object from house:
		House blueHouse=new House("Blue");
		
		//Second reference to the same class:
		House anotherHouse=blueHouse;
		//test the first object:
		System.out.println(blueHouse.getColor());//Blue
		//test the second reference "anotherHouse":
		System.out.println(anotherHouse.getColor());//Blue
		
		//Change the second reference "anotherHouse" String value:
		anotherHouse.setColor("Black");
		//test both references:
		System.out.println(blueHouse.getColor());//Black , it changed.
		System.out.println(anotherHouse.getColor());//Black ,Changed too.
		
		//Creating another Object "greenHouse" :
		House greenHouse=new House("Green");
		//test for greenHouse:
		System.out.println(greenHouse.getColor());//green
		//change anotherHouse color using green refernce:
		anotherHouse=greenHouse;
		//now let's test anotherHouse ,it is supposed to get Green :
		System.out.println(anotherHouse.getColor());//Green, it worked.
	}

}
