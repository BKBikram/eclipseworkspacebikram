package com.arraylist;
	public class GetStateMethodEx extends Thread
	{
		public void run()
		{
			System.out.println("Running thread name "+Thread.currentThread().getName());
			System.out.println("Thread state "+Thread.currentThread().getState());
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//System.out.println("Enter a no");
			GetStateMethodEx obj=new GetStateMethodEx();
			GetStateMethodEx obj1=new GetStateMethodEx();
			//Thread t1=new Thread();
			//Thread t2=new Thread();
			obj.start();
			obj1.start();
		}
	}