package myproject;

public class demo {
	static void fun() {
		System.out.println("Hello");
	}
	public static void main(String [] args) {
		demo.fun();
		fun();
		demo x=new demo();
		x.fun();
	}

}
