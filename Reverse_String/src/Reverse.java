/*
 * <h1>Reverse a string<h1>
 * This program simply takes a word or statement from the user and reverse it then print out the reversed word.
 * -Ex;
 * -Input:
 * I am BORED!!!
 * -Output:
 * !!!DEROB ma I
 * 
 * */
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Statment: ");
		//this array to save characters of the word or the statement:
		char[] letter=scan.nextLine().toCharArray();
		System.out.println("The reversed Statment is : ");
		//This for loop is to print the reversed word:
		for(int i=letter.length-1;i>=0;i--)
		{
			System.out.print(letter[i]);
		}
		
	}

}
