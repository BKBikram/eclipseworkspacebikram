package myproject;

class thread1 extends Thread{
	 public void run() 
	{
		for(int i=0;i<3;i++) 
		{
		System.out.println("hi  "+Thread.currentThread().getName());
		Thread.currentThread().setName("bikram");
		}
	}
}
class thread2 extends Thread{
	 public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("hello  "+Thread.currentThread().getName());
			Thread.currentThread().setName("biki");
		}
	}
	
}
public class thread {
	public static void main(String[] args) {
		thread1 t=new thread1();
		thread2 t2=new thread2();
		t2.start();
		t.start();
		
	}

}
