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
		
		Selection_Sorting selection_Sorting=new Selection_Sorting();
		System.out.println("the sorted array : ");
		selection_Sorting.sort(arr);
		
		

	}

}
