package myproject;
import java.util.*;
public class perfectnoterm {
	public static void main(String[] args) {
		System.out.println("Enter a no:");
		Scanner sc=new Scanner(System.in);
		int no,sum=0;
		no=sc.nextInt();
		for(int i=1;i<no;i++)
		{
			if(no%i==0)
				sum=sum+i;
				//System.out.print(i);
			
		}
		System.out.println("The sum is "+sum);
		if(sum==no)
		System.out.println("The no is perfect no");
		else
			System.out.println("not perfect no");
	}

}
