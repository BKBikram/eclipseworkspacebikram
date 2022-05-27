package myproject;

import java.util.Arrays;
import java.util.Scanner;

public class secondlar {
	public static void secondlargest(int[] n,int len)
	{
		if(len<2)
		{
			System.out.println("Enter more than two element");
		}
		Arrays.sort(n);
		for(int i=len-2;i>=0;i++)
		{
			if(n[i]!=len-1)
				System.out.println("The second largest no is"+n[i]);
			return;
		}
			
	}
	public static void main(String[] args) {
		System.out.println("Enter how many number u want to store");
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int[] n=new int[len];
		System.out.println("Enter the numbers");
		for(int i=0;i<len;i++)
		{
			n[i]=sc.nextInt();
		}
		secondlargest(n,len);
		
	}

}
