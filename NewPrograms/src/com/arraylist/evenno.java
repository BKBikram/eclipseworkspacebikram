package com.arraylist;
import java.util.*;
public class evenno {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 integer");
		for(int i=0;i<10;i++)
		{
			int no=sc.nextInt();
			al.add(no);
		}
		System.out.println(al);
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext())
		{
			Integer n=itr.next();
			if(n%2==0)
				System.out.println("even no is" +n);
			else
				itr.remove();
		}
		System.out.println(al);
			

	}

}
