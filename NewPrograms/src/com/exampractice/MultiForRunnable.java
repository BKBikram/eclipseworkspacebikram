package com.exampractice;
class multi implements Runnable{
	public void run() {
		System.out.println("This is the runnable interface implementing class");
	}
}
class multi1 implements Runnable{
	public void run() {
		System.out.println("hi");
	}
	
}
public class MultiForRunnable {

	public static void main(String[] args) {
		multi ml=new multi();
		Thread th=new Thread(ml);
		multi1 ml2=new multi1();
		Thread th2=new Thread(ml2);
		th.start();
		th2.start();

	}

}
