package com.exampractice;

import java.util.Scanner;


public class ATM_Program {

	public static void main(String[] args) {
		String user="Bikram";
		long bal=45000;
		int pin=4567;
		System.out.println("insert your card:");
		System.out.println("Enter your pin:");
		Scanner sc=new Scanner(System.in);
		int userpin=sc.nextInt();
		String[] ask= {"yes","no"};
		if(pin==userpin)
		{
			String[] language= {"English","Odia","Hindi"};
			String lan="English";
			System.out.println("Welcome Bikram");
			System.out.println("Choose your language");
			System.out.println();
			System.out.println();
			if(language[0].equals(lan))
			{
				String[] services= {"withdraw","deposit","changepin"};
				System.out.println("choose any services");
				System.out.println("Services"+"      \t"+"Withdrawl");
				System.out.println("        "+"      \t"+"Deposit");
				System.out.println("        "+"     \t"+"changepin");
				sc.nextLine();
				System.out.println("For Withdraw write withdraw and for deposit write deposit:");
				String choice=sc.nextLine();
				
				if(services[0].equals(choice))
				{
					System.out.println("Enter amount:");
					int amount=sc.nextInt();
					if(amount>bal)
					{
						System.out.println("insufficient balance");
					}
					else if(amount<=bal)
					{
						System.out.println("Withdrawn successful");
						bal=bal-amount;
						System.out.println("Do you want to see your available balance:");
						sc.nextLine();
						System.out.println("Then write yes or write no");
						String input=sc.nextLine();
						if(ask[0].equals(input))
						{
							System.out.println(bal);
						}
						else if(ask[1].equals(input))
							System.out.println("Thank you:Visit Again");
						  
					}
				}
				else if(services[1].equals(choice))
				{
				   System.out.println("how much amount do you want to deposit:");
				   int Damount=sc.nextInt();
				   System.out.println("Successfully Deposited");
				   bal=bal+Damount;
				   System.out.println("Do you want to see your available balance:");
					sc.nextLine();
					System.out.println("Then write yes or write no");
					String input=sc.nextLine();
					if(ask[0].equals(input))
					{
						System.out.println(bal);
					}
					else if(ask[1].equals(input))
						System.out.println("Thank you:Visit Again");
				}
				else
					System.out.println("you have entered wrong input");
			}
			else
				System.out.println("");	
		}
		else
			System.out.println("invalid pin");
	}

}
