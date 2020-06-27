import java.util.Scanner;

public class Stairs {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		
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

