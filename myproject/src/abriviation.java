import java.util.Scanner;
public class abriviation {//like bikram keshari sahoo is B.K Sahoo
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String st=sc.nextLine();
		//int len=st.length();
		 st=' '+st;
		 int sp=st.lastIndexOf(' ');
		for(int i=0;i<sp;i++)
		{
			
			if(st.charAt(i)==' ')
			{
				System.out.print(st.charAt(i+1)+".");
			}
		}
		System.out.println(st.substring(sp));
	}
	
	

}
