/*
 * <h1>Age Calculator<h1>
 * this program asks the user to enter:
 * - their birthday in this form yyyy/mm/dd.
 * - today's date in this form yyyy/mm/dd.
 * then calculate their age and print it out.
 *  -EX:-
 *  -Input:
 *  1996/1/17
 *  
 *  2020/7/5
 *  
 *  -Output:
 *  Your age is : 24 years 5 months 19 days
 *	Or : 293 months
 *	Or : 8809 days
 *	Or : 211416 hours
 * */

import java.util.Scanner;

public class Age {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int agey=0,agem=0,aged=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Your Birthday in this form \n yyyy/mm/dd");
		String Birthday=scan.next();
		
		String [] parts=Birthday.split("/");
		int year=Integer.parseInt(parts[0]);
		int month=Integer.parseInt(parts[1]);
		int day=Integer.parseInt(parts[2]);
		
		Scanner scan1=new Scanner(System.in);
		System.out.println("Enter today's date in this form \n yyyy/mm/dd");
		String date=scan.next();
		String [] parts1=date.split("/");
		int year1=Integer.parseInt(parts1[0]);
		int month1=Integer.parseInt(parts1[1]);
		int day1=Integer.parseInt(parts1[2]);
		scan1.close();
		agey=year1-year;
		agem=month1-month;
		aged=day1-day;
		
		if(day>day1)
		{
			agem-=1;
			aged+=31;
		}
		int  totalmonths=agey*12+(agem);
		int  totaldays=totalmonths*30+aged;
		int totalhours=totaldays*24;
		System.out.println("Your age is : "+ agey+" years "+agem+" months "+aged +" days");
		System.out.println("Or : "+totalmonths+" months");
		System.out.println("Or : "+totaldays+" days");
		System.out.println("Or : "+totalhours+" hours");
		scan.close();
		scan1.close();
	}

}
