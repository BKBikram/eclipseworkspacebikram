package com.exampractice;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNoInArray {

	public static void main(String[] args) {
		//wap for java,in array 1-100 no are stored and find out the missing no
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many no do you want to store:");
		int n=sc.nextInt();
		int[] ar=new int[n];
		int check=0;
		System.out.println("Enter the numbers");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		Arrays.sort(ar);
		int last=ar[n-1];
		for(int i=ar[0];i<last;i++)
		{
			if(ar[check]==i)
			{
			  check++;
			}
			else
				System.out.println(i);
		}

	}

}
