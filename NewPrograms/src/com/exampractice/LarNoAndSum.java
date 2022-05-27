package com.exampractice;

import java.util.Scanner;

public class LarNoAndSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("how many no do you want to store:");
	    int n=sc.nextInt();
	    int[] ar=new int[n];
	    for(int i=0;i<ar.length;i++)
	    {
	    	ar[i]=sc.nextInt();
	    }
	    int sum=0;
	    int lar=ar[0];
	    for(int i=0;i<ar.length;i++)
	    { 
	    	sum=sum+ar[i];
	    	if(ar[i]>lar)
	    		lar=ar[i];
	    }
	    System.out.println("The sum of all numbers:"+sum);
	    System.out.println("Largest no is:"+lar);
	    

	}

}
