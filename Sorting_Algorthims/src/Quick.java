
public class Quick {
	
	public int partition(int arr[],int start,int end) {
		
		int pivot=end;
		int i=start-1;
		for(int j=start;j<=end;j++)
			if(arr[j]<=arr[pivot])
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		
		return i;
		
	}
	public void sort(int arr[],int start,int end) {
		int m=arr.length;
		if(start<end)
		{
		int pivot=partition(arr, start, end);
		sort(arr, start, pivot-1);
		sort(arr, pivot+1, end);
		}
		//Printing the sorted array
		for ( int k = 0; k < 4; k++) 
			{
				System.out.println(arr[k]);
			}
	}
}
