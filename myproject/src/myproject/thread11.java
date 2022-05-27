package myproject;

import java.util.*;

class ex extends Thread
{
	int no;
	public void run() 
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(no+"*"+i+"="+(no*i));
		}
	}
	
}

public class thread11 {
	public static void main(String[] args) {
		ex obj=new ex();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no for multiplication table:");
		obj.no=sc.nextInt();
		obj.start();
	}

}
