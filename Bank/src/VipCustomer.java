
public class VipCustomer {

	private String name;
	private double creditlimit;
	private String email;
	//Empty constructor:
	public VipCustomer() {
		this("Dhaif",3532.5,"mmjegfeu@gmail.com");
	}
	public VipCustomer(String name, double creditlimit) {
		this(name,creditlimit,"Unknown!");
	}
	public VipCustomer(String name, double creditlimit, String email) {
		this.name = name;
		this.creditlimit = creditlimit;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	public double getCreditlimit() {
		return creditlimit;
	}
	public String getEmail() {
		return email;
	}
	
	
}
