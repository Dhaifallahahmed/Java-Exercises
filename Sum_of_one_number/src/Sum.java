/*
 * <h1>Sum  of the digits of a number<h1>
 * this program takes a number as an input and calculate the sum of its digits .
 * -for example:
 * -Input:
 * 2020
 * 
 * Sum=2+0+2+0=4
 * 
 * -Output:
 * Sum = 4
 * 
 * */
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number : ");
		double num=scan.nextDouble();
		while(num != 0)
		{
			sum+=num%10;
			num/=10;
		}
		System.out.println("Sum = "+sum);
	}

}
