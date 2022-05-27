package com.exampractice;

public class MultiThreading1 extends Thread{
	public void run() {
		System.out.println("thread running");
	}

	public static void main(String[] args) {
		MultiThreading1 ml=new MultiThreading1();
		MultiThreading1 ml1=new MultiThreading1();
		ml.start();
		ml1.start();
		System.out.println(ml.isAlive());
		System.out.println(ml.getName());
	}

}
