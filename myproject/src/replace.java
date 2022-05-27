import java.util.Scanner;

public class replace {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a line");
		String st=sc.nextLine();
		String up=st.toUpperCase();
		System.out.println(up);
		String rep=st.replace('a', '*');
		System.out.println(rep);
		
	}

}
