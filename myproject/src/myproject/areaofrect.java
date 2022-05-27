package myproject;

import java.util.Scanner;

//wap to implement dynamic method dispatch for calculating area of rectaangle
class arearect{
	void show(double l,double b) {
		double area=l*b;
		System.out.println(area);
	}
}
public class areaofrect extends arearect {
	void show(double l,double b) {
		double area=l*b;
		System.out.println("The area of the rectangle is :"+ area);
		}
		public static void main (String[] args) {
			arearect obj=new areaofrect();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter lenth and width:");
			double len=sc.nextDouble();
			double breadth=sc.nextDouble();
			obj.show(len, breadth);
			
		
	}

}
