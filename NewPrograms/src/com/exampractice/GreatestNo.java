package com.exampractice;

import java.util.Scanner;

public class GreatestNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many no do you want to store:");
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
      int grt=ar[0];
      for(int i=0;i<ar.length;i++)
      {
    	  if(ar[i]>grt)
    	  {
    		  grt=ar[i];
    	  }
      }
      System.out.println(grt);
	}

}
