import java.util.Scanner;
public class wordcount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a line:");
		String line=sc.nextLine();
		int count=1;
		//System.out.println(line);
		int len=line.length();
		for(int i=0;i<len;i++)
		{
			if(line==" ")
			{
				 count=count+1;
			}
		}
		System.out.println("The no of words is"+count);
			
			
			
	}

}
