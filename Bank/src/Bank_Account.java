import java.io.ObjectInputStream.GetField;

public class Bank_Account {
	
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public String getCoustmername() {
		return coustmername;
	}
	public void setCoustmername(String coustmername) {
		this.coustmername = coustmername;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	private String account_number;
	private String coustmername;
	private float balance;
	private String email;
	private String phone;
	
	public void deposit(double amount) {
		this.balance+=amount;
		System.out.println("You have despositted "+amount+" and your balance now is :"+this.balance);
	}
	public void withdraw(double withdraw) {
		if(withdraw<=this.balance) {
		this.balance-=withdraw;
		System.out.println("You have withdraw "+withdraw+" and your balance now is :"+this.balance);
		}
		else 
			System.out.println("You can't withdraw that much !"
					+ "Only "+this.balance+" avalible!");
	}
}
