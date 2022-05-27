package com.exampractice;

import java.util.Scanner;

class cons{
	int no;
	cons(int n){
		this.no=n;
		for(int i=1;i<=10;i++) 
		{
			try {
				Thread.sleep(2000);
				System.out.println(no+"*"+i+"="+no*i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
public class ConstructorProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int n=sc.nextInt();
		cons ob=new cons(n);

	}

}
