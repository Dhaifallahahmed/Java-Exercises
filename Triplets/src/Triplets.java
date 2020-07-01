/*
 * <h1>Compare the Triplets<h1>
 * this program takes three inputs two times and compare same index of every group and save increase the score .
 * 
 * <p>Explanation<p>
 * Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding
 * points on a scale from 1 to 100 for three categories: problem clarity , originality , and difficulty .
 * 
 * We define the rating for Alice's challenge to be the triplet A=(a0,a1,a2) , and the rating for Bob's
 * challenge to be the triplet B=(b0,b1,b2) .
 * 
 * Your task is to find their comparison scores by comparing a0 with b0 ,a1 with b1, and a2 with b2 .
 * If ai > bi then Alice is awarded 1 point.
 * If ai < bi then Bob is awarded 1 point.
 * If ai = bi then neither person receives a point.
 * <p> Sample input<p>
 * 5 6 7
 * 3 6 10
 * 
 * <p> Sample input<p>
 * 1 1 
 * */

import java.util.Scanner;

public class Triplets {
 
	public static void main(String[] args) {

		Scanner score = new Scanner(System.in);
		// "n" is the length of the arrays 
		int n=3;
		//define two arrays for bob and alice ;
		int  bob[] =new int [n],Alice[] = new int [n];
		
		//define two integers for bob and alice to compare there points;
		int bobscore=0;int alicescore=0;
		System.out.println("Enter Bob's score (3 numbers): ");
		
		//this for loop to enter the first group of numbers which are bob's scales:
		for (int i=0;i<3;i++)
		{
		  bob[i] =score.nextInt();
		}
		
		System.out.println("Enter Alice's score (3 numbers): ");
		//this for loop to enter the first group of numbers which are bob's scales:
		for (int j=0;j<3;j++)
		{
			Alice[j] =score.nextInt();
		}
		//this for loop to compare the same index of bob's and alice's scales 
		for (int l=0;l<3;l++)
		{
			//increase bob's points by 1 if his index value is grater than alice's 
			if(bob[l]>Alice[l])
				bobscore+=1;
			else
				//increase alice's  points by 1 if his index value is grater than bob's  
				if(bob[l]<Alice[l])
					alicescore+=1;
		}
		//print out the points for each of bob and alice :
		System.out.println(bobscore+"  "+alicescore);
}
}

