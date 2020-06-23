import java.util.Scanner;

public class Weird {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		if(n>=1 && n<=100)
		{
			if(n%2 == 0)
				System.out.println("Not Weird.");
			else
				System.out.println("Weird.");
		}

	}

}
