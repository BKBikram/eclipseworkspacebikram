package myproject;

import java.util.Scanner;

public class matrixrowise {
	public static void main(String[] args) {
		System.out.println("Enter 9 elements:");
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int[][] n=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				n[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(n[i][j]+" ");
				sum=sum+n[i][j];
			}
			System.out.println("="+sum);
		}
		
	}

}
