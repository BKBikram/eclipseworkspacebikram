package myproject;

public class method3 {
	static int Natusum() {
		int sum=0;
		for(int n=1;n<=25;n++)
		{
			sum=sum+n;
			
		}
		return sum;
		
	}
	public static void main(String[] args) {
		int r;
		r=Natusum();
		System.out.println("The sum of first 25 natural no is "+r);
	}

}
