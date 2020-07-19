
public class Insertion {
	public void sort(int arr[]) {
		int n=arr.length,key,j;
		for(int i=1;i<n;++i)
		{
			  key = arr[i];
			  j=i-1;
			  
			  while (j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j-=1;
			}
			  arr[j+1]=key;
		}
		
		for (int k=0;k<n;k++)
		{
			System.out.println(arr[k]);
		}
	}
}
