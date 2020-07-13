
public class Main {
	
	public static void main(String[] args) {
		Dimensions dimensions=new Dimensions(2, 2, 2);
		Case theCase=new Case("2020", "HP", "220V", dimensions);
		Resolution theResolution=new Resolution(2, 2);
		Monitor theMonitor=new Monitor("HP Home", "HP", 3, theResolution);
		Motherboard theMotherboard=new Motherboard("BJ229", "Intel", 3, 8, "V4");
		PC thePc=new PC(theCase, theMonitor, theMotherboard);
		thePc.getTheMonitor().drawPixelAt(2, 3, "Green");
		
	}
}
