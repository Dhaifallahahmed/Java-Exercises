import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int length;
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many numbers u wanna sort : ");
		length=scanner.nextInt();
		int [] arr=new int[length];
		Scanner scanner2=new Scanner(System.in);
		System.out.println("Enter "+length+" numbers :");
		for(int i=0;i<length;i++)
			arr[i]=scanner2.nextInt();
		//Creating Objects from the sorting classes:
		//Selection Sorting :
		Selection_Sorting selection_Sorting=new Selection_Sorting();
		//Bubble Sorting :
		Bubble bubble=new Bubble();
		System.out.println("Choose algorthim :\n"
				+ "1. Selection Sorting \n"
				+ "2. Bubble Sorting \n");
		int method=scanner.nextInt();
		System.out.println("the sorted array : ");
		switch (method) {
		case 1:
			selection_Sorting.sort(arr);
			break;
		case 2:
			bubble.sort(arr);
			break;

		default:
			break;
		}
		
		
		

	}

}
