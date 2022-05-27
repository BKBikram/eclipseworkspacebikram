package myproject;

import java.util.Scanner;

class examp extends Thread
{
	int no;
	public void run() 
	{
		try {
		for(int i=1;i<=10;i++)
		{
			System.out.println(no+"*"+i+"="+(no*i));
			Thread.sleep(5000);
		}
		}
		catch(Exception e)
		{
			
		}
	}
	
}

public class thread_example {
	public static void main(String[] args) {
		ex obj=new ex();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no for multiplication table:");
		obj.no=sc.nextInt();
		obj.start();
	}

}
