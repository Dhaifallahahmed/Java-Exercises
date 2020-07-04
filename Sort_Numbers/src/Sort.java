import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		int temp=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("How many numbers do you want to sort?:");
		int length=scan.nextInt();
		Scanner scan1=new Scanner(System.in);
		int [] numbers= new int [length];
		System.out.println("Enter "+length+"numbers :");
		for (int i=0;i<length;i++)
		{
			numbers[i]=scan1.nextInt();
		}
		
		for (int i=0;i<length;i++)
			for (int j=i+1;j<length;j++)
				if(numbers[j]<numbers[i])
				{
					temp=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=temp;
				}
		for (int i=0;i<length;i++)
		{
			System.out.println(numbers[i]);
		}
	}

}
