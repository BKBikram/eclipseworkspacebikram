package myproject;
import java.util.Scanner;

public class sumof5digit {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter 5 no:");
		for(int i=0;i<5;i++)
		{
			int no=sc.nextInt();
			sum=sum+no;
		}
		System.out.println("The sum of 5 integer is "+sum);
		
	}

}
