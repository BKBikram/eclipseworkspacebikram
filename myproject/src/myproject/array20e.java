package myproject;

import java.util.Scanner;

//wap to create an integer array of 20 element and display the greatest as well as smallest among them
public class array20e {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("how many no you want to enter");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int greatest=arr[0];
		for(int element:arr)
		{
			if(element>greatest)
			{
		       greatest=element;
		       
			}
			
		}
		System.out.println("greatest no is "+greatest);
		int smallest=arr[0];
		for(int element:arr)
		{
			if(element<smallest)
			{
		       smallest=element;
		      
			}
			
		}
		 System.out.println("smallest no is "+smallest);
	}

}
