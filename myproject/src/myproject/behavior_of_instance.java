package myproject;

import java.util.Scanner;

//wap to show  the behavior of instance variable and method in case of inheritance
class x{
	int a;
	void show() {
		System.out.println(a);
	}
	
	
}
class y extends x{
	int a;
	void display() {
		System.out.println(a*10);
	}
	
}

public class behavior_of_instance {
	public static void main(String[] args) {
		y obj=new y();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		obj.a=sc.nextInt();
		obj.display();
		
	}

}
