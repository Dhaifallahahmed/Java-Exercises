/*
 * <h1>Java Loops<h1>
In this problem you will test your knowledge of Java loops. Given three integers , , and , output the
following series:
a+20b,a+20b+21b,......,a+20b+21b+...+2n−1ba+20b,a+20b+21b,......,a+20b+21b+...+2n−1b

Input Format
The first line will contain the number of test cases t. Each of the next t lines will have three integers, a, b, and n.

Constraints:
0≤t≤5000≤t≤500
0≤a,b≤500≤a,b≤50
1≤n≤151≤n≤15

Output Format
Print the answer to each test case in separate lines.

Sample Input
2
0 2 10
5 3 5

Sample Output
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98

 * */

import java.util.Scanner;

public class Java_Loops {
	//this function to implement the equation using the received three numbers a,b,n and print out the output of it:
	public static  void pow(int a,int b,int n)
	{
		for (int j = 0; j < n; j++)
		{
			a += (int) Math.pow(2, j)*b;
			System.out.print(a +" ");
		}
		System.out.println();
	}

    public static void main(String[] args) {
    	

    	//"t" integer is for how many groups of numbers the user has:
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        
     // i will use this num scanner to get three numbers input from the user:
        Scanner num = new Scanner (System.in);
       
      //this for loop is to get the user input of the three numbers "t" times and call pow function to implement the equation :
        	for (int i = 0; i < t; i++) 
        		{
        			 
        	       
		
        //user input for three numbers 
			        System.out.println("Enter numbers of group "+(i+1));
        			int a=num.nextInt();
        			int b=num.nextInt();
        			int n=num.nextInt();
    //call pow function to implement the equation :
        		pow(a,b,n);
        }
        	//closing scanners:
        	num.close();
        	sc.close();
    }
}