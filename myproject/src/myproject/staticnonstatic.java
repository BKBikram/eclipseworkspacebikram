package myproject;

import java.util.Scanner;
                                  //write a java program to show the use of static and nonstatic block
public class staticnonstatic {
	static void display(int n) {
		System.out.println("This is static block and you have entered "+n);
	}
	void show() {
		System.out.println("This is nonstatic block");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int n=sc.nextInt();
		display(15);
		//staticnonstatic obj=new staticnonstatic();
		//obj.show();
	}

}
