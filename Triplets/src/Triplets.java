import java.util.Scanner;

public class Triplets {

	public static void main(String[] args) {

		Scanner score = new Scanner(System.in);
		int n=3;
		int  bob[] =new int [n],Alice[] = new int [3];
		int bobscore=0;int alicescore=0;
		System.out.println("Enter Bob's score (3 numbers): ");
		
		for (int i=0;i<3;i++)
		{
		  bob[i] =score.nextInt();
		}
		System.out.println("Enter Alice's score (3 numbers): ");
		for (int j=0;j<3;j++)
		{
			Alice[j] =score.nextInt();
		}
		for (int l=0;l<3;l++)
		{
			if(bob[l]>Alice[l])
				bobscore+=1;
			else
				if(bob[l]<Alice[l])
					alicescore+=1;
		}
		System.out.println(bobscore+"  "+alicescore);
}
}

