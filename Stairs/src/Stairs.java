/*
 * <h1>Stairs<h1>
 * this code is to draw Stairs using one integer number (n)
 * the base and height are both equal to n, and the image is drawn using # symbols and spaces.
The last line is not preceded by any spaces.
 * */
import java.util.Scanner;

public class Stairs {

	public static void main(String[] args) {
		
		//This scanner (row) to to get an input from the user to control row's number:
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		
		//"k" is to use in the second for loop to control how many "#"s we want to print out:
		int  k = 0;
		
		//This for loop to control rows' number
        for(int i = 1; i <= row; ++i, k = 0)
        {
        	//This for loop to control Spaces' number
            for(int space = 1; space <= row - i; ++space)
            {
                System.out.print(" ");
            }
          //This for loop to control "#"s number
            while(k !=  i )
            {
            	System.out.print(" #");
            	
                ++k;
           
            }
            System.out.println();
            }
   }
}

