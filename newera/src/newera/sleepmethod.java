package newera;

public class sleepmethod extends Thread {
	public void run() 
	{
		for(int i=0;i<5;i++)
		{
			try {
			  System.out.println("hi");
		       sleep(5000);
	            } 
		catch (InterruptedException e) 
			{
		     e.printStackTrace();
	        }
		}
			
	}
	public static void main(String[] args) {
		sleepmethod sl=new sleepmethod();
		
		sl.start();
		
	}

}
