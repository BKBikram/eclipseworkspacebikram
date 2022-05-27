package myproject;

public class first25odd {
	void odd() {
		int count=1,odd=1,sum=0;
		while(count<=25) 
		{
			sum=sum+odd;
			odd=odd+2;
			count++;
		}
			System.out.println("sum of first 25 odd no is" + sum);	
	}
	public static void main(String[] args) {
		first25odd obj=new first25odd();
		obj.odd();
		
	}

}
