package myproject;

import java.util.Scanner;

class markib{
	int fact=1,i;
	public void bik(int n) throws Exception {
		synchronized (this){
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
			Thread.sleep(5000);
		}
		System.out.println("factorial of "+n+" is"+fact);
		this.notify();
		}
	}
}

public class waitt implements Runnable{
	static markib obj;
	int no;
	public void run() 
	{
		try {
			obj.bik(no);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws InterruptedException {
	    waitt ob=new waitt();
	    Thread t=new Thread(ob);
		obj=new markib();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no for factorial");
		ob.no=sc.nextInt();
		//waitt b=new waitt();
	   t.start(); 
		synchronized(obj)
		{
			obj.wait();
			System.out.println("hi");
		}
		
		
		
	}

}
