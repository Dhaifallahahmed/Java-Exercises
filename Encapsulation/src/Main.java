import javax.sound.midi.Soundbank;

public class Main {
	
	public static void main(String[] args) {
		
		Printer printer=new Printer(2,true);
		System.out.println("intinal Pages : "+printer.getNumberOfPages());
		int pagesprinted=printer.printing(4);
		System.out.println("Printing : "+pagesprinted+" total pages : "+printer.getNumberOfPages());
		pagesprinted=printer.printing(5);
		System.out.println("Printing : "+pagesprinted+" total pages : "+printer.getNumberOfPages());

	}
}
