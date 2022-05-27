package newera;
import java.util.*;
public class arraylist_iterator {

	public static void main(String[] args) {
		ArrayList<String> st=new ArrayList();
		st.add("bikram");
		st.add("anil:");
		st.add("sunil");
		st.add("biplab");
		System.out.println(st);
		System.out.println();
		System.out.println();
		Iterator<String> itr=st.iterator();
		while(itr.hasNext())
		{ 
			System.out.println("values are:"+itr.next());
		}
		
	}

}
