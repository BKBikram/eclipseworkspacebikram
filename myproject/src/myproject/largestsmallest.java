package myproject;

import java.util.Scanner;

public class largestsmallest {
	public static void main(String[] args) {
		System.out.println("Enter 10 no:");
		Scanner sc=new Scanner(System.in);
		int[] no=new int[10];
		for(int i=0;i<10;i++)
		{
			no[i]=sc.nextInt();
		}
		int gr=no[0];
		for(int i=0;i<10;i++)
		{
			if(no[i]>gr)
				gr=no[i];
			
		}
		int sm=no[0];
		for(int i=0;i<10;i++)
		{
			if(no[i]<sm)
				sm=no[i];
			
		}
		System.out.println("greater no is"+gr);
		System.out.println("smaller no is"+sm);
	}

}
