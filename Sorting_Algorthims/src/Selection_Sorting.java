
public class Selection_Sorting {

	public void sort(int arr[]) {
		int n=arr.length;
		for (int i=0;i<n-1;i++)
		{
			int min_index=i;
			for(int j=i+1;j<n;j++)
				if(arr[j]<arr[min_index])
					min_index=j;
			
			//Swap the min number with the first
			int temp=arr[min_index];
			arr[min_index]=arr[i];
			arr[i]=temp;
		}
		int m=arr.length;
		for(int k=0;k<m;k++)
			System.out.println(arr[k]+" ");
		System.out.println();
	}
	

}
