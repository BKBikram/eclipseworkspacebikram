package myproject;

import java.util.Scanner;

//wap to create an integer matrix of m*n and display the matrix with the row wise total
public class matrix1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=0;
		System.out.println("Enter 6 no");
		int n[][]=new int[2][3];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				 n[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(n[i][j]+" ");
				s=s+n[i][j];
			}
			System.out.println("sum is="+s);
		}
		
	}

}
