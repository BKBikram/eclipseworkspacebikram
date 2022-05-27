package newera;

import java.util.Scanner;

public class wrapperclass {
		public static void main(String[] args) 
		{	
			Scanner sc=new Scanner(System.in);
			
	     int a=sc.nextInt();
		 Integer b= Integer.valueOf(a); 
		 Integer c = a;
		 
		 System.out.println(a+" "+b+" "+c);
		   }
		}
