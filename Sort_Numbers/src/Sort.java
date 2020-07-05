import java.util.Scanner;

public class Sort {
	public static void descending  (int numbers1[],int length)
	{
		int temp=0;
		for (int i=0;i<length;i++)
			for (int j=i+1;j<length;j++)
				if(numbers1[j]<numbers1[i])
				{
					temp=numbers1[i];
					numbers1[i]=numbers1[j];
					numbers1[j]=temp;
				}
		for (int i=0;i<length;i++)
		{
			System.out.println(numbers1[i]);
		}
		
	}
	public static void ascending  (int numbers1[],int length)
	{
		int temp=0;
		for (int i=0;i<length;i++)
			for (int j=i+1;j<length;j++)
				if(numbers1[j]>numbers1[i])
				{
					temp=numbers1[i];
					numbers1[i]=numbers1[j];
					numbers1[j]=temp;
				}
		for (int i=0;i<length;i++)
		{
			System.out.println(numbers1[i]);
		}
		
	}

	public static void main(String[] args) {
		int temp=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("How many numbers do you want to sort?:");
		int length=scan.nextInt();
		Scanner scan1=new Scanner(System.in);
		int [] numbers= new int [length];
		System.out.println("Enter "+length+" numbers :");
		for (int i=0;i<length;i++)
		{
			numbers[i]=scan1.nextInt();
		}
		Scanner scan2= new Scanner(System.in);
		System.out.println("1/ For descending sorting.");
		System.out.println("2/ For ascending  sorting.");
		int type=scan2.nextInt();
		if(type==1)
			descending(numbers,length);
		else if(type==2)
			ascending(numbers,length);
		
	}

}
