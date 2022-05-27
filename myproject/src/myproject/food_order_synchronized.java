package myproject;

import java.util.Scanner;

class food{
	int biryani_meal=10;
	public void food_order(int meal) {
		if(biryani_meal>=meal)
		{
			System.out.println("meal successfully ordered:");
			biryani_meal=biryani_meal-meal;
			System.out.println("Total meal left= "+biryani_meal);
		}
		else
		{
			System.out.println("sufficient quantity not available:");
			System.out.println("total meal left="+biryani_meal);
		}
	}
}
public class food_order_synchronized extends Thread {
	static food obj;
	int meal;
	public void run() {
		obj.food_order(meal);
	}
	public static void main(String[] args) {
		obj=new food();
		System.out.println("enter meal quantity:");
		Scanner sc=new Scanner(System.in);
		food_order_synchronized ob=new food_order_synchronized();
		ob.meal=sc.nextInt();
		ob.start();
		
	}

}
