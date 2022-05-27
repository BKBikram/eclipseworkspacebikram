package myproject;

import java.util.Scanner;

public class AvgArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many no do you want to store");
		int n=sc.nextInt();
		System.out.println("Enter the numbers:");
		int ar[]=new int[n];
		int sum=0;
		float avg=0;
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
			sum=sum+ar[i];
		}
		avg=(float)sum/n;
		System.out.println(avg);
		

	}

}
