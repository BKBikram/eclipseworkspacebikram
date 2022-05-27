package com.arraylist;

import java.util.Scanner;

public class month {

	public static void main(String[] args) {
		//User enters month's number, then program tells month's name.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no between 1 to 12");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("january");
			break;
		case 2:
			System.out.println("Feb");
			break;
		case 3:
			System.out.println("march");
			break;
		case 4:
			System.out.println("apr");
			break;
		case 5:
			System.out.println("may");
			break;
		case 6:
			System.out.println("june");
			break;
		case 7:
			System.out.println("july");
			break;
		case 8:
			System.out.println("Aug");
			break;
		case 9:
			System.out.println("sep");
			break;
		case 10:
			System.out.println("oct");
			break;
		case 11:
			System.out.println("nov");
			break;
		case 12:
			System.out.println("dec");
			break;
		 default:
			 System.out.println("Enter valid no");
		}
		//using if else
		/*
		 * if(n==1) System.out.println("january"); else if(n==2)
		 * System.out.println("feb"); else if(n==3) System.out.println("mar"); else
		 * if(n==4) System.out.println("Apr"); else if(n==5) System.out.println("may");
		 * else if(n==6) System.out.println("june"); else if(n==7)
		 * System.out.println("july"); else if(n==8) System.out.println("aug"); else
		 * if(n==9) System.out.println("sep"); else if(n==10) System.out.println("oct");
		 * else if(n==11) System.out.println("nov"); else if(n==12)
		 * System.out.println("dec"); else System.out.println("Enter a valid no");
		 */
		

	}

}
