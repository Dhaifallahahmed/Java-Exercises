import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter name :");
		Scanner scan=new Scanner(System.in);
		String name=scan.nextLine();
		System.out.println("Enter number: ");
		String number=scan.nextLine();
//		System.out.println("Enter Balance :");
//		double balance=scan.nextDouble();
		System.out.println("Enter Email :");
		String email=scan.nextLine();
		System.out.println("Enter Phone :");
		String phone=scan.nextLine();
		

		Bank_Account myAccount2=new Bank_Account(name,number,435.4,email,phone);
		
	}

}
