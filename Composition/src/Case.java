

public class Case {

	private String model;
	private String manufacturer;
	private String powerSupply;
	private Dimensions dimintions;
	public Case(String model, String manufacturer, String powerSupply, Dimensions dimintions) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.powerSupply = powerSupply;
		this.dimintions = dimintions;
	}
	//Random Method:
	public void pressPowerButton() {
		System.out.println("Power Button Pressed!");
		
	}
	
	public String getModel() {
		return model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public String getPowerSupply() {
		return powerSupply;
	}
	public Dimensions getDimintions() {
		return dimintions;
	}
	
	
	
}
