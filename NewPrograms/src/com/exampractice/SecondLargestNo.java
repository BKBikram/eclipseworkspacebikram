package com.exampractice;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestNo{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many no do you want to store:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=arr.length-2;i>=0;i--)
		{
			if(arr[i]!=n-1)
			{
				System.out.println("Second largest is"+arr[i]);
				break;
			}
		}
		
		
	}

}
