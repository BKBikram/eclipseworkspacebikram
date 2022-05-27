package com.arraylist;
import java.util.*;

public class EvenPrimeno {

	public static void main(String[] args) {
		int i, j, prime;
		HashSet<Integer> al=new HashSet<Integer>();
		HashSet<Integer> al1=new HashSet<Integer>();
		for(i=1;i<=50;i++)
		{
			if(i%2==0) 
			{
			al.add(i);
			}
		}
		System.out.println(al);
		/*
		 * al.remove(3); al.remove(Integer.valueOf(10)); System.out.println(al);
		 */
			
		//System.out.println(al);
		 for (i = 2; i <= 50; i++) 
		 { 
			 prime = 0; 
			 for (j = 2; j<= i / 2; j++) 
			 { 
				 if (i % j == 0) 
				 { 
					 prime = 1; 
					 break; 
					 } 
				 } 
			 if (prime== 0)
		     al1.add(i); 
		} 
		 System.out.println(al1);
		 }

}
