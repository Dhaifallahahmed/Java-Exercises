/*
 * <h1>Java if-else <h1>
 * this program simply test:
 * - if the given number is odd and prints "Weird" , 
 * - if the number is even and in the inclusive range of 2 to 5 print Not Weird 
 * - if the number is even and in the inclusive range of 6 to 20 print  Weird .
 * - if the number is even and greater than 20, print Not Weird.
 * 
 * */

import java.util.Scanner;

public class Weird {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//input a number to test it:
		int n = scan.nextInt();
		scan.close();
		//the number should be in the range of 1 to 100:
		if(n>=1 && n<=100)
		{
			//test if the number is odd
			if(n%2 != 0)
				//print "Weird" if n is odd
				System.out.println(" Weird.");
			else
			{
				//test if n in range between 2 and 5
				if(n>=2 && n<=5)
					//print "Not Weird"
				System.out.println("Not Weird.");
				//test if n in range between 6 and 20
				else if(n>=6 && n<=20)
					//print " Weird"
					System.out.println("Weird.");
				else 
					//print "Not Weird" if n is even and grater than 20
					System.out.println("Not Weird.");
		}
		}

	}

}
