/*
 * <h1>Words Sorting<h1>
 * This program simply receives two inputs from the user:
 * -Number of words that the user want to sort -> number
 * -Words to be Sorted ->words
 * the program sorts them and print out the result.
 * */
import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		//this string variable will be used to swap two words when theory are unsorted
		String temp=" ";
		//this scanner is to take input of the words' number
		Scanner scan = new Scanner(System.in);
		System.out.println("How many words u have ?");
		int number=scan.nextInt();
		//this scanner is to take input of the words
		Scanner scan1 = new Scanner(System.in);
		
		//this string array to save the inputed words
		String [] words= new String[number];
		//this for loop is to take the words:
		for (int i=0;i<number;i++)
		{
			words[i]=scan1.next();

		}
		// this for loop is to swap and sort the inputed words
		for(int j=0;j<number;j++)
			for(int m=0;m<number;m++)
			if(words[m].compareTo(words[j])>=1)	
					{
						temp=words[j];
						words[j]=words[m];
						words[m]=temp;
					}
				//this for loop is to print out the array after sorting it:
		for (int i=0;i<number;i++)
		{
			System.out.println(words[i]);
		}
	}

}
