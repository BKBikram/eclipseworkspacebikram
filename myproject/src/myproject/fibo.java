package myproject;
import java.util.*;
public class fibo {
	public static void main(String[] args) {
		int a=1,b=2,c,count;
		System.out.println("Enter the term for fibonacci series");
		Scanner sc=new Scanner(System.in);
		count=sc.nextInt();
		System.out.print(a+" "+b);
		for(int i=3;i<=count;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}

}
