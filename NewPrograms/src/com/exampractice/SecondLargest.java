package com.exampractice;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 7 number:");
		int n[]=new int[7];
		for(int i=0;i<n.length;i++)
		{
			n[i]=sc.nextInt();
		}
		Arrays.sort(n);
		System.out.println(Arrays.toString(n));
		int secondlar=n[n.length-2];
		System.out.println(secondlar);

	}

}
