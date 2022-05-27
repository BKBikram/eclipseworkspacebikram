package com.exampractice;

import java.util.Scanner;

public class Fibonacchi {
	 public static void main(String[] args) {
		int a=0,b=1,c=0;
		 for(int i=0;i<50;i++)
		 {
			 a=b;
			 b=c;
			 System.out.print(c+"\t");
			 c=a+b;
			 if(c>=50)
				 break;	  	 
		 }
	 }
}
