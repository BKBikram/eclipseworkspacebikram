package myproject;

import java.util.Arrays;
import java.util.Scanner;

public class secondhighest {
	static void print2largest(int n[],int len)
          {
		    int i,first,second;
		    if(len<2)
		    {
		    	System.out.println("Enter more than 3 element");
		    }
		    Arrays.sort(n);
		    for(i=len-2;i>=0;i++)
		    {
		    	if(n[i]!=len-1)
		    	{
		    		//first=n[i];
		    		System.out.println("The second largest no is"+n[i]);
		    		return;
		    	}
		    }
		    System.out.println("Their is second largest element");
		    	
           }
	public static void main(String[] args) {
		System.out.println("Enter the array size:");
		Scanner sc=new Scanner(System.in);
		int arr=sc.nextInt();
		int[] n=new int[arr];
		for(int i=0;i<arr;i++)
		{
			n[i]=sc.nextInt();
		}
		int len=n.length;
		print2largest(n,len);
	}

}
