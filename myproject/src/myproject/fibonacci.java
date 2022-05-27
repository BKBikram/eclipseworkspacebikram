package myproject;
import java.util.Scanner;

public class fibonacci {
	 public static void main(String[] args) {
		 int a=0,b=1,c,i,count;
		 System.out.print("Enter the term for fibonacci series:");
		 Scanner sc=new Scanner(System.in);
		 count=sc.nextInt();
		 System.out.print(a+" "+b);
		 //System.out.print(b);
		 for(i=3;i<=count;i++)
		 {
			 c=a+b;
			 System.out.print(" "+c);
			 a=b;
			 b=c;
		 }
		 
	 }

}
