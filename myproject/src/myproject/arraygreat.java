package myproject;

import java.util.Scanner;

public class arraygreat {
	public static void main(String args[]) {
		System.out.println("Enter 10 elements:");
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		int greatest=arr[0];
		for(int i=0;i<10;i++)
		{
		  if(arr[i]>greatest)
		  {
			  greatest=arr[i];
		  }
		   
		}
		System.out.println(greatest);
	}

}
