package newera;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class arraylist {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List numbers=new ArrayList();
		numbers.add(9);
		numbers.add("bikram");
		numbers.add(5);
		numbers.add(5);
		System.out.println(numbers);
		List<String> name=new ArrayList<String>();
		name.add("anil");
		/*System.out.println("how many name will u enter");
		int len=sc.nextInt();
		System.out.println("Enter your name:");
		while(sc.hasNextLine()) {
			name.add(sc.nextLine());

		}
		//write */
		numbers.addAll(name);
		System.out.println(name.addAll(numbers));
		System.out.println(name);
	}

}
