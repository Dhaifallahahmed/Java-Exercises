
public class Monitor {
	private String model;
	private String manufacturer;
	private int size;
	private Resolution nativeResolution;

	public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.size = size;
		this.nativeResolution = nativeResolution;
	}

	// Random Method :
	public void drawPixelAt(int x, int y, String color) {
		// TO test it:
		System.out.println("Drawing Pixel At" + x + "," + y + " in color " + color);
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getSize() {
		return size;
	}

	public Resolution getNativeResolution() {
		return nativeResolution;
	}

}
