package com.exampractice;

import java.util.Scanner;

public class matrixpro {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 9 element");
		int i,j;
		int[][] ar=new int[3][3];
		for(i=0;i<3;i++)
		{
			for( j=0;j<3;j++)
			{
			ar[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(ar[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("After swapping first column into last column");
		for(i=0;i<3;i++)
		{
		int c=ar[i][0];
		ar[i][0]=ar[i][2];
		ar[i][2]=c;
		
			for(j=0;j<3;j++)
			{
				System.out.print(ar[i][j]+"\t");
			}
			System.out.println();
		}
	}
	}


