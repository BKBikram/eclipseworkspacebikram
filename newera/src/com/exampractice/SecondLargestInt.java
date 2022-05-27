package com.exampractice;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestInt {

	public static void main(String[] args) {
		// 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 numbers:");
		int[] ar=new int[10];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		Arrays.sort(ar);
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		int secla=ar[ar.length-2];
		System.out.println(secla);

	}

}
