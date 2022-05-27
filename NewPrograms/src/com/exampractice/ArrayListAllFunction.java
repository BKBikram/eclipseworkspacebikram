package com.exampractice;

import java.util.*;

public class ArrayListAllFunction {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList();
		al.add(5);
		al.add(4);
		al.add(98);
		al.add(23);
		al.add(3);
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
			
		}
		System.out.println(al);
		al.set(0, 354);
		System.out.println(al);
		
	}

}
