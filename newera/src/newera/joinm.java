package newera;

public class joinm extends Thread
{
	public void run() 
	{
		try {
			for(int i=0;i<5;i++) {
				System.out.println("hi"+i);
			Thread.sleep(1000);}
		    }
		catch(Exception e)
		{
			
		}
	}
	public static void main(String[] args) {
		joinm jm=new joinm();
		jm.start();
		try {
			for(int i=0;i<5;i++) {
				System.out.println("hello"+i);
			Thread.sleep(1000);
			jm.join(5000);}
		}
		catch(Exception e)
		{
			
		}
			
	}

}
