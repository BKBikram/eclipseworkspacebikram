package myproject;

import java.util.Scanner;

class xyz extends Thread
{
	int no;
      public void run() 
	{
		Thread.currentThread().setName("biki");
		System.out.println("First thread is "+Thread.currentThread().getName());
		try {
		for(int i=1;i<=10;i++)
		{
			
			System.out.println(no+"*"+i+"="+(no*i));
			/*if(i==10)
			{
				System.out.println("Thread execution is complete");
				
			}   */
			Thread.sleep(1000);
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
}
class xy extends Thread
{
	public void run() 
	{
		Thread.currentThread().setName("biki1");
		try {
		for(int i=1;i<=3;i++) 
		{
		System.out.println(Thread.currentThread().getName() +" "+ i);
		//Thread.sleep(1000);
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
public class threadex {
	public static void main(String[] args) {
		xyz obj=new xyz();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no for multiplication table:");
		obj.no=sc.nextInt();
		obj.start();
		xy obj2=new xy();
		obj2.start();
	}

}
