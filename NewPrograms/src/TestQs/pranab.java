package TestQs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class pranab {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		System.out.println("enter the elements");
		int[] nn=new int[n];
		int[] newar=new int[n];
		
		for(int i=0;i<nn.length;i++)
		{
		   nn[i]=sc.nextInt();
		}
		int i,rem=0,sum;
		
		for(i=0;i<nn.length;i++)
		{ 
			sum=0;
			while(nn[i]!=0)
			{
				rem=nn[i]%10;
				sum=sum+rem;
				nn[i]=nn[i]/10;
			}
			newar[i]=sum;
		}
		Arrays.sort(newar);
		System.out.println(Arrays.toString(newar));
		
		
	}

}
