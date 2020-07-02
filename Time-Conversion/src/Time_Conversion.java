/*
 * <h1> Time Conversion <h1>
 * <p>Simply this program takes a time in AM/PM format, convert it to military ( 24-hour) time.<p>
 * 
 * */

import java.util.Scanner;

public class Time_Conversion {

	public static void main(String[] args) {
		
		//Inputting String of time hh:mm:pm
		Scanner time1 = new Scanner(System.in);
		String time = time1.nextLine();
		
		//Defining an array to split time input
		
		String[] parts = time.split(":");
		String hrs = parts[0]; //hours
		String mins = parts[1];//minutes
		String pmam = parts[2];//PM or AM
		
		//Defining integers to convert the splitted strings I had to be able to Compare and convert them. 
		int hr=Integer.parseInt(hrs);
		int mm=Integer.parseInt(mins);
		
		//get the middle of the pmam and seconds part 
		final int mid = pmam.length()/2; //
		String[] pm = {pmam.substring(0, mid),pmam.substring(mid)};
		//pm[0] is for seconds
		//pm[1] is for pm / am 	part
		
			String pmam1=pm[1];
			String pm1="pm";
			String pm2="PM";
			String am1="am";
			String am2="AM";
			
			//check if the given time is already in a 24 hour format:
				if(hr>12)
			System.out.println(hrs+":"+mm+":"+pm[0]);
		else
				if( pm[1].equals(pm1) || pm[1].equals(pm2) )
					{
					if(hr==12)
					{
						
						hr=12;
					}
					else
					{
						hr+=12;
					}
						System.out.println(hr+":"+mm+":"+pm[0]);
						
					}
				else 
				{
					if( pm[1].equals(am1) || pm[1].equals(am2) )
					{
					if(hr==12)
						hrs="00";
					
					System.out.println(hrs+":"+mm+":"+pm[0]);
					}
				}
				
			time1.close();
			
			

	}	
}