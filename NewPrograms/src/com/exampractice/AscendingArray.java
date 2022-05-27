package com.exampractice;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingArray {

	public static void main(String[] args) {
		int [] ar=new int[8];
		int c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 8 numbers");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]<ar[j])
				{
					c=ar[i];
					ar[i]=ar[j];
				    ar[j]=c;
				}
			}
		}
		System.out.println(Arrays.toString(ar));

	}

}
