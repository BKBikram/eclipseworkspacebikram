package com.arraylist;
import java.util.*;
public class largestsmallest {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("how many no do u want to store");
		int no=sc.nextInt();
		System.out.println("enter nos");
		for(int i=0;i<no;i++)
		{
			int num=sc.nextInt();
			al.add(num);
		}
		int lar=al.get(0);
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i)>lar)
				lar=al.get(i);
		}
		System.out.println(al);
		System.out.println("largest no is"+lar);
		
		
		

	}

}
