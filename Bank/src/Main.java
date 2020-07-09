import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		System.out.println("Enter Name :");
//		Scanner scan1=new Scanner(System.in);
//		Scanner scan=new Scanner(System.in);
//		String name=scan.nextLine();
//		System.out.println("Enter Account Number: ");
//		String number=scan.nextLine();
//		System.out.println("Enter Balance :");
//		double balance=scan1.nextDouble();
//		System.out.println("Enter Email :");
//		String email=scan.nextLine();
//		System.out.println("Enter Phone :");
//		String phone=scan.nextLine();
//	
//		
//
//		Bank_Account myAccount=new Bank_Account(name,number,balance,email,phone);
//		System.out.println(myAccount.getCoustmername());
//		myAccount.getAccount_number();
//		myAccount.getBalance();
//		myAccount.getCoustmername();
		
		//VipCoustmer Test:
		VipCustomer Vip=new VipCustomer();
		System.out.println(Vip.getName());
		System.out.println(Vip.getEmail());
		System.out.println(Vip.getCreditlimit());
		
		
	}

}
