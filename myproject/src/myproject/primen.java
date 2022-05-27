package myproject;
import java.util.*;
public class primen {
	public static void main(String[] args) {
		System.out.println("Enter a No");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=2;
		while(d<n)
		{
			if(n%d==0)
			break;
			d=d+1;
	    }
		if(d==n)
			System.out.println("prime");
		
		else
			System.out.println("not prime");
	}

}
