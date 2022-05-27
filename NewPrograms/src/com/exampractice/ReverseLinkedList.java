package com.exampractice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(15);
		ll.add(18);
		ll.add(19);
		ll.add(5);
		ll.add(7);
	    /* ListIterator itr=ll.listIterator(ll.size());
	    while(itr.hasPrevious())
	    {
	    	System.out.println(itr.previous());
	    }   */
	    
	    
	    Iterator<Integer> itr1=ll.descendingIterator();
	    while(itr1.hasNext())
	    {
	    	System.out.println(itr1.next());
	    }
	    

	}

}
