package myproject;

import java.util.Scanner;

public class staticmodifier {
	static String company="xyz";
	
	staticmodifier(int emp_id,String emp_name)
	{
		System.out.println("employee id is "+emp_id+" "+" employee name is "+emp_name+" "+company);
	}
	static void display(int n,int x) {
		System.out.println("The addition of two no is "+(n+x));
		
		
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter two no:");
		staticmodifier obj=new staticmodifier(13,"anil");
		//int a=sc.nextInt();
		//int b=sc.nextInt();
		//display(a,b);
		//staticmodifier.display(a, b);
		
	}
	

}
