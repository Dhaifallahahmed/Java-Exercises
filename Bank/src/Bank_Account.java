import java.io.ObjectInputStream.GetField;

public class Bank_Account {
	private String account_number;
	private String coustmername;
	private double balance;
	private String email;
	private String phone;
	public Bank_Account() {
	}
	//,String account_number,double balance,String email,String phone
	public Bank_Account(String coustmername, String account_number, double balance, String email, String phone) {
		
		this.account_number=account_number;
		this.coustmername=coustmername;
		this.balance=balance;
		this.email=email;
		this.phone=phone;
		System.out.println("==============================");
		System.out.println("Account Number : "+	getAccount_number());
		System.out.println("Coustmer Name : "+ getCoustmername());
		System.out.println("Balance : "+ getBalance());
		System.out.println("Email : "+getEmail());
		System.out.println("Phone : "+getPhone());
		System.out.println("==============================");		
	}
	
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
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
	public double getBalance() {
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
