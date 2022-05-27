package myproject;

import java.util.Scanner;

class age extends RuntimeException{
	age(String msg)
	{
		super(msg);
	}
}
public class throwkeyword {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int ag=sc.nextInt();
		try {
		if(ag<18)
		{
			throw new age("you are not eligible for voting");
		}
		else
		{
		System.out.println("you are eligible for voting");
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("age should be greather than 18");
		}
		
		
	}

}
