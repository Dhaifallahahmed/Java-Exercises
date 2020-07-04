import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		String temp=" ";
		Scanner scan = new Scanner(System.in);
		System.out.println("How many words u have ?");
		int number=scan.nextInt();
		Scanner scan1 = new Scanner(System.in);
		
		String [] words= new String[number];
		for (int i=0;i<number;i++)
		{
			words[i]=scan1.next();

		}
		for(int j=0;j<number;j++)
			for(int m=0;m<number;m++)
			if(words[m].compareTo(words[j])>0)	
					{
						temp=words[j];
						words[j]=words[m];
						words[m]=temp;
					}
				
		for (int i=0;i<number;i++)
		{
			System.out.println(words[i]);
		}
	}

}
