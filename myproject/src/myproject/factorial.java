package myproject;
import java.util.Scanner;

public class factorial {
	public static void main(String[]args) {
		int n,fact=1,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		n=sc.nextInt();
		
	    for(i=1;i<=n;i++)
	    {
	    	fact=fact*i;
	    }
	    System.out.print("The factorial of this no is "+fact);
	}

}
