package com.exampractice;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArrayMissingOneElement {

	public static void main(String[] args) {
		// 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many no do you want to store:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the numbers for first array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int[] arr2=new int[n];
		System.out.println("Enter the numbers for second array");
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		int le=arr.length;
		int len=arr2.length;
		//Arrays.sort(arr);
		//Arrays.sort(arr2);
		for(int i=0;i<le;i++)
		{
			int j;
			for(j=0;j<len;j++)
				if(arr[i]==arr2[j])
				break;
			if(j==len)
					System.out.println(arr[i]+" ");
			
		}
		
	}

}
