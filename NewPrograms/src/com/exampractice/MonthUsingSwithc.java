package com.exampractice;

import java.util.Scanner;

public class MonthUsingSwithc {

	public static void main(String[] args) {
		System.out.println("Enter a number between 1 to 12");
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
	    switch(month)
	    {
	    case 1:
	    	System.out.println("january");
	    	break;
	    case 2:
	    	System.out.println("february");
	    	break;
	    case 3:
	    	System.out.println("march");
	    	break;
	    case 4:
	    	System.out.println("april");
	    	break;
	    case 5:
	    	System.out.println("may");
	    	break;
	    case 6:
	    	System.out.println("June");
	    	break;
	    case 7:
	    	System.out.println("july");
	    	break;
	    case 8:
	    	System.out.println("Aug");
	    	break;
	    case 9:
	    	System.out.println("Sep");
	    	break;
	    case 10:
	    	System.out.println("Oct");
	    	break;
	    case 11:
	    	System.out.println("Nov");
	    	break;
	    case 12:
	    	System.out.println("Dec");
	    	break;
	     default:
	    	 System.out.println("Enter a valid no");
	    }

	}

}
