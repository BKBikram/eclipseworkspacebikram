package myproject;

public class exceptionhandling {
	public static void main(String [] args) {
		
		try {
			int a=5,b=0,c;
		c=a/b;
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("enter a valid operator");
			//e.printStackTrace();
		}
		//System.out.println(c);
	}

}
