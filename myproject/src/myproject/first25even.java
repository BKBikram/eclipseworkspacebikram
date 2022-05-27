package myproject;

public class first25even {
	
	 first25even() 
	{
        int c=25;int e=2;int sum=0;
		for(c=25;c>=1;c--)
		{
			sum=sum+e;
			e=e+2;
		}
		System.out.println("sum of first 25 even no is "+ sum);
		
		
	}
	public static void main(String[] args) {
		first25even obj=new first25even();
	    
	}

}
