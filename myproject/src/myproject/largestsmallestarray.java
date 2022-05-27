package myproject;

import java.util.Scanner;

public class largestsmallestarray {
	public static void main(String[] args) {
		System.out.println("how many no do you want to store:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
		arr[i]=sc.nextInt();	
		}
		int lar=arr[0];
		int sma=arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]>lar)
			{
				lar=arr[i];
			}
		}
		System.out.println("largest no is"+lar);
			
	}

}
