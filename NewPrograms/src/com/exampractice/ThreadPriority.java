package com.exampractice;

class bipa extends Thread{
	public void run() {
		Thread.currentThread().setPriority(3);
		System.out.println("Executed according to my priority");
	}
}
class bili extends Thread
{
 public void run() {
	 Thread.currentThread().setPriority(MAX_PRIORITY);
	 System.out.println(Thread.currentThread().getName()+"Executed according to my priority");
 }
}
public class ThreadPriority {

	public static void main(String[] args) {
	    bipa ob=new bipa();
	    bili obj=new bili();
	    ob.setPriority(3);
	    obj.setPriority(9);
	    ob.start();
	    obj.start();
	    ob.setName("first thread");
	    obj.setName("second thread");

	}

}
