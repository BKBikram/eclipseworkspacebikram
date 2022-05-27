package com.exampractice;

import java.util.*;
import java.util.List;

public class MergeTwoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(3);
		List<Integer> l1=new ArrayList<>();
		l1.add(9);
		l1.add(45);
	    l.addAll(l1);
	    System.out.println(l);
		
		

	}

}
