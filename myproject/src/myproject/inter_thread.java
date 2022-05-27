package myproject;

class total_earnings extends Thread{
		int total=0;
	    public void run()
		{
			synchronized(this) 
			{
			for(int i=1;i<=10;i++)
		  total=total+100;
			this.notify();
			}
		}
	}
public class inter_thread {
	public static void main(String[] args) throws InterruptedException {
		total_earnings obj=new total_earnings();
		obj.start();
		synchronized(obj) {
			obj.wait();
			System.out.println(obj.total);
		}
		
	}

}
