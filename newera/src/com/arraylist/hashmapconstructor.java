package com.arraylist;

import java.util.Comparator;
import java.util.TreeMap;
class Mycomparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1=(String)o1;
		String s2=o2.toString();
		return s2.compareTo(s1);
	}
	
}


public class hashmapconstructor {

	public static void main(String[] args) {
		/*//this is for default natural consturctor
		TreeMap t=new TreeMap();
		t.put(101, "Anil");
		t.put(102,"sunil");
		t.put(107,"bikram");
		t.put(103, 1000);
		System.out.println(t);*/
		TreeMap tm=new TreeMap(new Mycomparator());
		tm.put("Bikram", 500);
		tm.put("Anil",56);
		tm.put("Sunil",45);
		tm.put("Abhinash", 1000);
		System.out.println(tm);	
	}

}
