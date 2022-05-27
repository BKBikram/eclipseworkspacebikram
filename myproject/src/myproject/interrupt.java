package myproject;

class inter extends Thread{
	public void run() {
		try {
		for(int i=0;i<3;i++)
		{
			System.out.println("hi");
			Thread.sleep(1000);
		}	
		}
		catch(Exception e) {
			System.out.println("exception");
		}
	}
}
public class interrupt {
	public static void main(String[] args) {
		inter obj=new inter();
		obj.start();
		obj.interrupt();
		
		
	}

}
