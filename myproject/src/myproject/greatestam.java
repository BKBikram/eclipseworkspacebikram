package myproject;

import java.util.Scanner;

public class greatestam {
	public static void main(String[] args) {
		System.out.println("ENter 3 numbers");
		Scanner sc=new Scanner (System.in);
		int[] no=new int[3];
		for(int i=0;i<3;i++)
		{
			no[i]=sc.nextInt();
		}
		int gr=no[0];
		for(int i=0;i<3;i++) 
		{
		if(no[i]>gr)
			gr=no[i];
		}
		System.out.println(gr);
	}

}
