package myproject;
import java.util.*;

public class armonstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rem=0,sum=0;
		System.out.println("Enter a no:");
		int no=sc.nextInt();
		int temp=no;
		while(no!=0)
		{
			rem=no%10;
			sum=sum+(rem*rem*rem);
			no=no/10;
		}
		if(temp==sum)
			System.out.println("this is an armstrong no");
		else
			System.out.println("not an armstrong no");
	}
	
}
