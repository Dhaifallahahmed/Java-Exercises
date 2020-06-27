import java.util.Arrays;
import java.util.Scanner;

public class TimeConversion {

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
		//Comparing part starts here:
		String pmam1=pm[1];
		//if(hr<=23 && hr>=0)
		//{
			//System.out.println("COOL!!!");
			//System.out.println("Hours:"+hr);
		String pm1="pm";
		String pm2="PM";
		String am1="am";
		String am2="AM";
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
			/*System.out.println("PM/AM ->"+pm[1]);
			System.out.println("Seconds->"+pm[0]);
			System.out.println("parts->");
			System.out.println("Hours->"+parts[0]);
			System.out.println("minutes->"+parts[1]);
			System.out.println("Seconds and pm/am -> "+parts[2]);*/
			time1.close();
		//}
		//else 
			//System.out.println("Wrong hour!!!");

	}	
}