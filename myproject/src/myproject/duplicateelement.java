package myproject;

import java.util.Scanner;

public class duplicateelement {
	public static void main(String[] args) {
		System.out.println("how many no do you want to store:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					System.out.print("duplicate element is"+arr[j]+" ");
				
			}
		}
	}

}
