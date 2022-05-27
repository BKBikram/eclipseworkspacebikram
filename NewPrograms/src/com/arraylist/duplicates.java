package com.arraylist;
import java.util.*;
public class duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find duplicates no in array if it contains multiple duplicates
		ArrayList<Integer> ar=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many no u want to store");
		int n=sc.nextInt();
		System.out.println("Enter numbers");
		for(int i=0;i<n;i++)
		{
			int no=sc.nextInt();
			ar.add(no);
		}
		for(int i=0;i<ar.size();i++)
		{
			if (ar.contains(ar.get(i)))
			System.out.println(ar.get(i));
		}
		
	}

}
