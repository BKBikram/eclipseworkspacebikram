package myproject;
import java.util.Scanner;
public class weekdays {
	public static void main(String[]args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number between 1 to 7");
		int week;
		week=sc.nextInt();
		switch(week)
		{
		case 1:
		    System.out.println("SUNDAY");
		    break;
		case 2:
			System.out.println("MONDAY");
		    break;
		case 3:
			System.out.println("TUESDAY");
		    break;
		case 4:
			System.out.println("WEDNESDAY");
		    break;
		case 5:
			System.out.println("THURSDAY");
		    break;
		case 6:
			System.out.println("FRYDAY");
		    break;
		case 7:
			System.out.println("SATURDAY");
		    break;
			default:
				System.out.print("Enter a valid number");
		    
		}
	}

}
