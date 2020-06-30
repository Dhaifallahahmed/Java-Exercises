/*
 * <h1>String Compression<h1>
 * Joseph and Jane are making a contest for apes. During the process, they have to communicate frequently
with each other. Since they are not completely human, they cannot speak properly. They have to transfer
messages using postcards of small sizes.


To save space on the small postcards, they devise a string compression algorithm:
If a character (ch) , occurs n(>1) times in a row, then it will be represented by , where is
the value of . For example, if the substring is a sequence of 4'a' ("aaaa"), it will be represented as
"a4".

If a character (ch) occurs exactly one time in a row, then it will be simply represented as{ch} . For
example, if the substring is "a", then it will be represented as "a".
Help Joseph to compress a message, msg.

Input
The only line of input contains a string, msg.

Output
Print the string msg as a compressed message.

Constraints
1<=Length(msg)<=10^5
msg consists of lower case English characters (a-z) only

Sample Input #0
abcaaabbb

Sample Output #0
abca3b3
 * */
import java.util.Scanner;

public class String_compression {

	public static void main(String[] args) {
		//this scanner to take a string input from the user which contains the letters:
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		
		//this variable is to count how many times did the letter occurs in sequens within the inputed string
		int count = 1;
		char  firstchar = line.charAt(0);
		//this variable will return the first char of the inputed string
		
		//i will use this class so that i can append the (output variable) result to the string
		StringBuilder output = new StringBuilder();

		//this for loop is to check how many times did the letter occurs in a row 
		for(int i=1; i < line.length(); i++)
		{
			
			//this if statement check if the second letter is the same letter as the previous one if so , it increase the value of count:
		    if(line.charAt(i) == line.charAt(i-1))
		    {
		    count++;
		    }
		    else
		    {
		    	//this if statement check if the letter had occurs for the second time or more in a row if so it append the value of count to the firstchar letter
		        if(count > 1)
		        {
		        	
		        output.append(line.charAt(i-1)+""+count); 
		        
		        }
		        //this else statement append just the letter had occurs for the second time
		        else
		        {
		            output.append(line.charAt(i-1));
		        }
		        //here i re initiate the value of count since i am locking for another letter
		        count = 1;
		        //re initiate the first letter by moving to check on the next letter
		        firstchar = line.charAt(i);
		    }
		}
		//this if statement is to check on the last letter of the input and append it to the string and append how many times it occurred in a row
		if(count > 1)
		{
		    output.append(firstchar+""+count);
		}
		//this else statement is to check on the last letter of the input and append it to the string if it did not occurred more than one time in a row
		else
		{
		    output.append(firstchar);
		}
		//print out the result by printing the string builder that we append to it (output)
		System.out.println(output.toString());

	}

}
