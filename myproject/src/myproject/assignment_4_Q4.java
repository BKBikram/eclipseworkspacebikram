package myproject;

import java.util.Scanner;

//write a java program to handle the inbuilt arrayoutofboundException
public class assignment_4_Q4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			int sum=0;
			int[] arr=new int[5];
			System.out.println("How many no you want to store:");
			int no=sc.nextInt();
			System.out.println("Enter elements");
			for(int i=0;i<no;i++)
			{
				arr[i]=sc.nextInt();
				sum=sum+arr[i];
			}
			System.out.println("sum is "+sum);
			arr[15]=sc.nextInt();
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array is out of range");
			
		}
	}

}
