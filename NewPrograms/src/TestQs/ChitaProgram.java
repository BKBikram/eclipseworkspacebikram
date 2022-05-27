package TestQs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Scanner;

class subject{
	String subjectName;
	String AddSubject;
}
public class ChitaProgram {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(8);
		al.add(5);
		al.add(3);
		al.add(7);
		al.add(8);
		System.out.println("Enter a name:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i)==n)
				al.remove(i);
		}
		System.out.println(al);
			     
		
        
		

	}

}
