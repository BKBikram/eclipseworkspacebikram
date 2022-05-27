package myproject;
import java.util.*;
public class multiplication {
	public static void main(String[] args) {
		System.out.println("Enter any number for multiplication table");
  		Scanner sc=new Scanner(System.in);
		int n,i;
		n=sc.nextInt();
		System.out.println("The multiplication table for "+n+" is");
		for(i=1;i<=10;i++)
			System.out.println(n+"*"+i+"="+(n*i));	
	}

}
