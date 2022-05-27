package myproject;

import java.util.Scanner;

//wap to impelement single inheritance for calculating grade for a particular subject as per the BPUT norms
class grade{
	  void m1(int mark) {
		if(mark>=90) {
			System.out.println("your mark is "+mark+" Your grade is 'O'");
		}
		else if(mark>=90) {
			System.out.println("your mark is "+mark+" Your grade is 'A+'");
		}
		else if(mark>=80) {
			System.out.println("your mark is "+mark+" Your grade is 'A'");
		}
		else if(mark>=70) {
			System.out.println("your mark is "+mark+" Your grade is 'B'");
		}
		else if(mark>=60) {
			System.out.println("your mark is "+mark+" Your grade is 'C'");
		}
		else if(mark>=50) {
			System.out.println("your mark is "+mark+" Your grade is 'D'");
		}
		else if(mark<40) {
			System.out.println("your mark is "+mark+" Your grade is 'F'");
		}
	}
	
}
public class gradecalculation extends grade {
	
	public static void main(String[] args) {
		gradecalculation obj=new gradecalculation();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student mark for for java:");
		
		int mark=sc.nextByte();
		obj.m1(mark);
		
		
		
	}

}
