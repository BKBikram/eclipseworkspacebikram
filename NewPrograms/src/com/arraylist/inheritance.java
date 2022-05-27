package com.arraylist;

import java.util.Scanner;

class fruit{
	 public String fruits(String name) 
	 { 
		 if(name.equals("elephant"))
		      return "eating banana";
		 else
			 return "Enter another animal name";
		
	}
}
class animals extends fruit{
	public String animalname(String name) {
		if(name.equals("elephant"))
			return name;
		else
		return "plz";
	}
	
}
public class inheritance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter animal name");
		String aname=sc.nextLine();
		animals ob=new animals();
		System.out.println(aname+" "+ob.fruits(aname));
		
		
		
		
		

	}

}
