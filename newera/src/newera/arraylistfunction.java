package newera;

import java.util.*;
import java.util.ListIterator;
import java.util.Scanner;

public class arraylistfunction  {
	public static void main(String[] args) throws Exception{
		
		ArrayList<String> al=new ArrayList();
		
		  al.add("Bikram");   //add function is used for adding new elements
		  al.add("Anil"); 
		  al.add("pranab"); 
		  //al.add(5);
		Iterator<String> iterator=al.iterator();
		System.out.println(al);
		for(String st:al)
		{
			System.out.print(st+"\t"+st.length()+"\t");
			StringBuffer str=new StringBuffer(st);
			System.out.println(str.reverse());
		}
		
		//remove    remove method  will remove the elements after passing the index value
		al.remove(1);
		System.out.println(al);
		
		//contains method whil check element is present or not and then it will return boolean value
		System.out.println(al.contains(5));
		
		//set method is used to update the indexed value(that means replace the value with new element)
		
		al.set(0, "Bunny");
		 while (iterator.hasNext()) 
		 { 
			 String name=iterator.next();
			 System.out.println("names are"+name);
			 //System.out.println("Value is : " + iterator.next()); 
		 }
		System.out.println(al);
		
		Vector v=new Vector();    //This is the vector interface
		v.addAll(al);
		System.out.println(v);
		  
		
		//clear method will celar all the element 
		v.clear();
		System.out.println(v);
	}
	}
