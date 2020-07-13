
public class PC {
	//Composition fields:
	private Case theCase;
	private Monitor theMonitor;
	private Motherboard thMotherboard;
	public PC(Case theCase, Monitor theMonitor, Motherboard thMotherboard) {
		super();
		this.theCase = theCase;
		this.theMonitor = theMonitor;
		this.thMotherboard = thMotherboard;
	}
	public Case getTheCase() {
		return theCase;
	}
	public Monitor getTheMonitor() {
		return theMonitor;
	}
	public Motherboard getThMotherboard() {
		return thMotherboard;
	}
	
	
}
