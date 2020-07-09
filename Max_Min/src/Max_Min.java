/*<h1>Max and Min<h1>
 * Enter as many numbers as you want and this program will show you what is the max and the min number
 * you entered .
 * you can stop the input part by entering invalid number like:"A char ".
 * 
 * */

import java.util.Scanner;

public class Max_Min {
	
	public static void main(String[] args) {
		int min=0;
		int count=1;
		int max=0;
		boolean first=true;
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter the "+count+" Number : ");
			boolean isint=scan.hasNextInt();
			
			if(isint)
			{
				
				int num=scan.nextInt();
				count++;
				if(first) {
					first=false;
					min=num;
					max=num;
				}
			
				if(num>max)
					max=num;
				if(num<min)
					min=num;
			}
			else {
				break;
			}
			scan.nextLine();
		}
		System.out.println("Min = "+min+"  Max = "+max);
		scan.close();
		
	}
}