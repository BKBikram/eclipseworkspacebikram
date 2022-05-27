package myproject;

import java.util.Scanner;

class excep extends RuntimeException{
	excep(String msg)
	{
		super(msg);
	}
}
public class userdefined_exception {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st no");
		int a=sc.nextInt();
	    System.out.println("Enter 2nd no");
		int b=sc.nextInt();
		try{
			int d;
			if(b==0)
			throw new excep("no can not divided by zero");
			else 
			 d=a/b;
				System.out.println(d);
			
		}
			
		catch(excep e) {
			System.out.println(e);
		}
		
	}

}
