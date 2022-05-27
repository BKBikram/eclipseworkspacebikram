package myproject;
import java.util.Scanner;
public class distinct_element 
{
	public static void main(String[] args) 
	{
		System.out.println("enter 5 array element:");
		int[] arr=new int[5];
		int i,j;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<5;i++)
		{
		arr[i]=sc.nextInt();
		}
		for(i=0;i<5;i++)
		{
			for(j=0;j<i;j++)
			{
			
			if(arr[i]== arr[j])
			break;
		    }
			if(i==j)
			{
			System.out.println(arr[i]);	
			}
		}
		
	}

}
