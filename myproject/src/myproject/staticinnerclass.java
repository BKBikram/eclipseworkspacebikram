package myproject;

import java.util.Scanner;


class outer{
	 int i=5;
	static class y{
		 int j;
		 void m1() {
			System.out.println("you have entered :"+j);
		}
	}
}

public class staticinnerclass {
	public static void main(String[] args) {
		outer.y obj=new outer.y();
		System.out.println("Enter a no:");
		Scanner sc=new Scanner(System.in);
		obj.j=sc.nextInt();
		obj.m1();
		
		
	}

}
