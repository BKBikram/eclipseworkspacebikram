package com.arraylist;

interface vehicle3{
	void run();
	default void racing() {
		System.out.println("School area speed limit is 40 km/hr");
	     }
	static void accident() {
		System.out.println("Drive slow accident area");
	}
}
interface vehicle4{
	abstract void diversion();
}
class car implements vehicle3,vehicle4{
	public void run() {
		System.out.println("car is running");
	}
	public void diversion() {
		System.out.println("Road ahead closed take diversion");
	};
}
class bike implements vehicle3{
	public void run() {
		System.out.println("Bike is running");
	}
}
public class interfaceex {

	public static void main(String[] args) {
		vehicle3 b=new car();
		vehicle3 c=new bike();
		b.run();
		b.racing();
		//vehicle3.accident();
		//c.run();
		
		
	}

}
