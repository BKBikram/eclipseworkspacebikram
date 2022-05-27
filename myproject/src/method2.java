import java.util.Scanner;
public class method2 {
	static int smallest() {
		System.out.println("Enter two integer:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a<b)
		{
			return a;
		}
		else
		{
			return b;
		}
		
	}
	public static void main(String [] args) {
		int r;
		r=smallest();
		System.out.println("The smallest no is "+r);
		
		
	}

}
