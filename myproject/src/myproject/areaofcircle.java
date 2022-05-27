package myproject;

import java.util.Scanner;

//wap to implement method overriding for calculating the area of the circle
class area1{
	void show(double r) {
		double pi=3.141;
		double area=pi*r*r;
		System.out.println("The radius of the circle is "+area);
	}
}
public class areaofcircle extends area1{
	void show(double r) {
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
	    area1 obj=new area1();
	    double r=sc.nextDouble();
	    obj.show(r);
		
	}

}
