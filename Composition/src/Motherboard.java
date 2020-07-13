
public class Motherboard {
	private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;
	public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.ramSlots = ramSlots;
		this.cardSlots = cardSlots;
		this.bios = bios;
	}
	//Specific Method for this class:
	public void loadProgram(String programName) {
		//test if it was called :
		System.out.println("Program  "+programName+" is loading ...");
		
	}
	public String getModel() {
		return model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public int getRamSlots() {
		return ramSlots;
	}
	public int getCardSlots() {
		return cardSlots;
	}
	public String getBios() {
		return bios;
	}
    
    
}
