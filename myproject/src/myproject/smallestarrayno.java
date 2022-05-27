package myproject;
import java.util.*;

 class smallest{
	void show(int arr[]) {
	    int smallestno=arr[0];
	    for(int element:arr)
	    {
	    	if(smallestno>element)
	    	{
	    		smallestno=element;
	    	}
	    }
	    System.out.println("smallest no is "+ smallestno);
	}
}
public class smallestarrayno {
	public static void main(String[] args)
	{
		smallest obj=new smallest();
		System.out.println("How many no you want to put");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements");
	    for(int i=0;i<arr.length;i++)
	    {
	    	arr[i]=sc.nextInt();
	    	
	    }
		
		obj.show(arr);	
	}

}
