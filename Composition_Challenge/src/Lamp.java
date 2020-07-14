
public class Lamp {
	private String style;
	private boolean battery;
	private int glopRating;
	public Lamp(String style, boolean battery, int glopRating) {
		super();
		this.style = style;
		this.battery = battery;
		this.glopRating = glopRating;
	}
	public void turnOn() {
		System.out.println("Lamp >> Lamps ON.");
	}
	public String getStyle() {
		return style;
	}
	public boolean isBattery() {
		return battery;
	}
	public int getGlopRating() {
		return glopRating;
	}
	
}
