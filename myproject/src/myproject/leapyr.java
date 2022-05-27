package myproject;
import java.util.Scanner;
public class leapyr {
	public static void main(String[] args) {
		System.out.println("Enter a year:");
		Scanner sc=new Scanner(System.in);
		int y=sc.nextInt();
		if(y%400==0)
		System.out.println("leap yr");
		else if(y%100==0)
			System.out.println("not a leap yr");
		else if(y%4==0)
		System.out.println("leap yr");
		else
			System.out.println("not a leap yr");
	}

}
