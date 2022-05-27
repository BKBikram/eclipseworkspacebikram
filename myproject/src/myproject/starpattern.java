package myproject;
import java.util.Scanner;
public class starpattern {
	public static void main(String[] args) {
		System.out.println("printing the * pattern");
/*		int i,j;
		for(i=5;i>0;i--)
		{
			for(j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}    */
	//Q3  wap to sum first n even numbers using loop
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the NO");
		int n=sc.nextInt();
		int i,sum=0;
		for(i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				//System.out.println(sum+i);
				sum=sum+i;
			}
		}
		System.out.println("The sum of first "+n+" even no is "+sum);
		
	}
}
