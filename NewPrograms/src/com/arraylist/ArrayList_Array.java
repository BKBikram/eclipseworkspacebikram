package com.arraylist;
import java.util.*;
public class ArrayList_Array {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(25);
		al.add(45);
	Integer[] arr=al.toArray(new Integer[5]);
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	      String[] array = {"a", "b", "c", "d", "e"};
	      List<String> list = Arrays.asList(array);          
	      System.out.println(list);
	      List<String> list1 = new ArrayList<String>();
	      Collections.addAll(list1, array);
	      System.out.println(list1);
	      
	      Collections.reverse(list1) ;
	      System.out.println(list1)  ;
	}

}
