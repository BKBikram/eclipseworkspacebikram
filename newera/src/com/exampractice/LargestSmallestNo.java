package com.exampractice;

import java.util.Scanner;

public class LargestSmallestNo {

	public static void main(String[] args) {
		// Find the largest and smallest no in the array
		Scanner sc=new Scanner(System.in);
		System.out.println("how many no do you want to store:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int lar=arr[0];
		int sma=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>lar)
			{
				lar=arr[i];
			}
			if(arr[i]<sma)
			{
				sma=arr[i];
			}
		}
		System.out.println("largest no is"+lar);
		System.out.println("smallest no is"+sma);
	}

}
