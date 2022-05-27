package com.exampractice;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArrayElementContainSameOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 element for first array:");
		int ar[]=new int[5];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Enter 5 element for 2nd array:");
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(ar);
		Arrays.sort(arr);
		boolean value=(Arrays.equals(ar, arr));
		System.out.println("Two array element same?"+value);

	}

}
