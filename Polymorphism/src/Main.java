import org.omg.CORBA.PUBLIC_MEMBER;

class Movie{
	private String name;

	public Movie(String name) {
		this.name = name;
	}
	public String plot() {
		return "No plot here";
	}
	public String getName() {
		return name;
	}
	
}
//first subclass from movie
class Jaws extends Movie{
	 public  Jaws() {
		super("Jaws");
	}
	 
	 public String plot() {
		 return "Shark eats people!";
	 }
}
//second subclass from movie
class Saw extends Movie{

	public Saw(String name) {
		super("Saw");
		
	}

	@Override
	public String plot() {
	
		return "Saw  Kills alot of people!";
	}
	
}
//third subclass from movie but this class 
//didn't inheritance the Plot method:
class Inception extends Movie{

	//constructor to initializing the name :
	public Inception(String name) {
		super("Inception");
	}
	//No Plot method !!
	
}
public class Main {

	public static void main(String[] args) {
		
		//reference to the movie class that will equals
		//the randomMovie method to generate random number
		//then use Switch statement to decide which movie
		//to  return:
		Movie movie=randoMovie();
		//printing out some info about the movie:  
		System.out.println("Movie "+movie.getName()+" plot : "+movie.plot());
	}
	//A method to generate a random movie
	public static Movie randoMovie() {
		//Random number between 1 and 3:
		int randomnumber=(int) (Math.random() *3 )+1;
		System.out.println("The random number was : "+randomnumber);
		switch (randomnumber) {
		case 1:
			return new Jaws();
			case 2:
			return new Saw(null);
			case 3:
			return new Inception(null);
		}
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
