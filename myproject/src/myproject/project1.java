package myproject;

import java.util.Scanner;

//wap to create an application for user friendly atm machine
class money{
	int total_money=1000;
	public void atm(int withdraw_amount) 
	{
	   if(total_money>=withdraw_amount)
	   {
		 System.out.println("Successfully Withdrawn:");
		 total_money=total_money-withdraw_amount;
		 
	   }
	   else
	   {
		   System.out.println("Money is not sufficient:");
		   System.out.println("enter amount below 1000");
	   }
	}
}
public class project1 {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		money obj=new money();
		int amount,PIN,server_pin=0000;
		System.out.println("Enter your secure 4 digit PIN");
		PIN=sc.nextInt();
		System.out.println("Enter amount");
		amount=sc.nextInt();
		obj.atm(amount);
		
		/*if(PIN==server_pin)
		{
			System.out.println("Amount successfully withdrawn");
		}*/
		
		
		
		
	}

}
