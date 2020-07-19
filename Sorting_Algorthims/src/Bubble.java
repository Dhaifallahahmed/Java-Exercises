
public class Bubble {
	
	public void sort(int arr[]) {
		int n=arr.length;
		for (int i=0;i<n-1;i++)
			for(int j=0;j<n-i-1;j++)
				if( arr[j]>arr[j+1])
			{
				//Swap index j with index j+1
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
			}
		//Print out the sorted array:
		n=arr.length;
		for (int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
