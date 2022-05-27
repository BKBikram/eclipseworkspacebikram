package myproject;
import java.io.*;
import java.lang.*;

class biki2{
	int a=132;
	
	 biki2(){
		System.out.println("hi");
	}
	 biki2(int n){
		 System.out.println(" in base class "+a);
		 a=n;
	 }
}
class biki1 extends biki2
{
	biki1(){
		super(15);
	}
	
	void display()
	{
		System.out.println("derived");
	}
	
}
public class constructor extends biki1 {
	public static void main(String[] args) {
		biki1 obj=new biki1();
	}

}
