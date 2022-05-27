package com.exampractice;
class x{
	int a=2,b=5;
	x(){
		System.out.println("constructor called");
	}
	public void display() {
		System.out.println(a+b);
	}
	
}
class y extends x{
	
	public void show() 
	{
		System.out.println("y class method called");
	}
	
}
public class InheritanceExample {

	public static void main(String[] args) {
		x ob=new x();
		y ob1=new y();
		ob1.display();
		
		

	}

}
