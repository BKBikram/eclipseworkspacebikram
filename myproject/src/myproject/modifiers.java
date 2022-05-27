package myproject;
import java.util.Scanner;
//write a java  program to show the use of acess modifiers (public ,private)
class privatemo
      {
	   private int n=20;
	     void show(String name)
	     {
	    	System.out.println("your name is "+name);
	    	System.out.println(n);
	     }
	   }

public class modifiers {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		privatemo obj=new privatemo();
		obj.show(name);
		}

}
