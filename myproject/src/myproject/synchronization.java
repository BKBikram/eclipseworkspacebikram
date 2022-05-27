package myproject;

class bookmovietickets{
	int total_seats=10;
	synchronized void bookseats(int seats) {
		if(total_seats>=seats)
		{
			System.out.println("you have successfully booked "+seats+" seats");
			 total_seats=total_seats-seats;
			System.out.println("seats left"+total_seats);
		}
		else
		{
			System.out.println(seats+" seats unavailable");
			System.out.println("seats left"+total_seats);
		}
	}
}
public class synchronization extends Thread {
	 static bookmovietickets b;
	int seats;
	public void run() {
		 b.bookseats(seats);
		
	}
	
	public static void main(String[] args) {
		b=new bookmovietickets();
		synchronization bikram=new synchronization();
		bikram.seats=8;
		bikram.start();
		
		synchronization anil=new synchronization();
		anil.seats=5;
		anil.start();
	}

}
