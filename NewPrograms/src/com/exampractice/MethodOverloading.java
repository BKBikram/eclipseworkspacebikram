package com.exampractice;
class m{
	public void show() {
		System.out.println("5");
	}
	public void show(int a) {
		System.out.println("parameterised method called");
	}
	static {
		System.out.println("i will call first");
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		m ob=new m();
		ob.show(5);
		ob.show();
		

	}

}
