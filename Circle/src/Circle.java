/*
 * <h1>The area and perimeter of a circle<h1>
 * this program takes the radius of the circle as input and calculate:
 * -The area of the circle.
 * -The perimeter of the circle.
 * and print it out.
 * */

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter circle's radius : \n");
		double radius=scan.nextDouble();
		
		//calculate the circle's area :
				System.out.println("Area = "+(2*Math.PI*radius));
		
		//calculate the circle's perimeter  :
				System.out.println("perimeter  = "+(Math.PI*radius*radius));
	}

}
