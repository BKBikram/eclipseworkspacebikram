package com.exampractice;


import java.util.HashSet;
import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {
			      int number;
			      Scanner sc = new Scanner(System.in);
			      System.out.println("Enter a number ::");
			      number = sc.nextInt();
			      HashSet<Integer> hs=new HashSet<>();
			     
			      for(int i = 2; i<=number; i++) 
			      {
			         while(number%i == 0) 
			         {
			            hs.add(i);
			            number = number/i;
			         }
			      }
			       for(int prime:hs)
			       {
			    	   System.out.println(prime);
			       }
			      }
			 }


