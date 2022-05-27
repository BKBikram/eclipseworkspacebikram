package com.arraylist;

abstract class vehicle1 {
	  abstract void run();
	  }
class bikram extends vehicle1{
	void run() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		vehicle1 v=new bikram();
		v.run();
		// TODO Auto-generated method stub

	}

}
