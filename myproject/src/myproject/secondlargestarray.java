package myproject;

import java.util.Arrays;
import java.util.Scanner;

public class secondlargestarray {
	public static void main(String[] args) {
		System.out.println("how much no u want to store");
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int[] no=new int[len];
		for(int i=0;i<len;i++)
		{
			no[i]=sc.nextInt();
		}
		Arrays.sort(no);
		for(int i=len-2;i>=0;i++)
		{
			if(no[i]!=len-1)
			{
				System.out.println(no[i]+"is second largest");
				return;
			}
		}
	}

}
