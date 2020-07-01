/*
 * <h1>Circular Array Rotation<h1>
 * <p>this program rotates an array of "n" numbers ,"k' times and then display the values of "q" indexes that the user will input<p> 
 * 
 * <p>Input Format<p>
 * The first line contains 3 space-separated integers n,k  and q, respectively.
 * The second line contains n space-separated integers, where each integer "i" describes array element ai 
 * where(0<= i <= n).
 * Each of the "q" subsequent lines contains a single integer denoting "m".
 * 
 * <p>Output Format<p>
 * For each query, print the value of the element at index "m" of the rotated array on a new line.
 * 
 * <p>Sample Input<p>
 * 3 2 3
 * 1 2 3
 * 0
 * 1
 * 2
 * 
 * <p>Sample Output<p>
 * 2
 * 3
 * 1
 * */ 



import java.util.*;

public class Circular_Array_Rotation {
	public static void main(String[] args) 
	{
		
	    Scanner in = new Scanner(System.in);
	    
	    //length of the array
	    int n = in.nextInt();
	    
	    //how many times does the user wants to perform the rotation :
	    int k = in.nextInt();
	    
	    //how many queries does the user wants to ask :
	    int q = in.nextInt();
	    
	    
	    //defining an array to store the numbers of the circular :
	    int[] a = new int[n];
	    
	    for(int index=0; index < n; index++)
	    {
	    //input "n" numbers for the array :
	        a[index] = in.nextInt();
	    }
	    
	    //this for loop to store the indexes the user want to search in the rotated array to get the value:
	    int [] m= new int[q];
	    for(int i = 0; i < q; i++){
	       m[i]=in.nextInt();
	       
	    }  
	    //print the value of the element at index j after rotating the array :
	    for(int j = 0; j < q; j++)
	    {
	    //print the value of the element at index j after implementing the query :
	    System.out.println(a[(n - (k % n)+ m[j]) % n]);
	    }
	}
	}
    