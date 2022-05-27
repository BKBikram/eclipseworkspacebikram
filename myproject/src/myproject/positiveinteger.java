package myproject;
import java.util.Scanner;
public class positiveinteger {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 25 integer for check positive or negative:");
		int num,c=0,neg=0;
		for(int i=1;i<=25;i++)
		{
		   num=sc.nextInt();
			if(num>0)
			{
				c=c+1;
			}
			else
			{
				neg=neg+1;
			}
		}
		System.out.printf("The no of positive integer is %d and negative integer is %d",c,neg);
	}

}
