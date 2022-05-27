package myproject;

import java.util.Scanner;

public class pallindrome_recurssion {
	     public static int reverse(int no) {
	    	 if(no==0)
	    		 return 0;
	    	 return(no%10+reverse(no/10));
	    
	  
	  }
	public static void main(String[] args) {
		System.out.println("Enter a no");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int r=reverse(no);
		System.out.println(r);
	}

}
