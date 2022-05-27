package myproject;
//print the no which is divisible by 5 from 1 to 25
public class e4 {
	public static void main(String[] args) {
		System.out.println("The no which is divisible by 5 from 1 to 25 are ");
		for(int i=1;i<25;i++)
		{
			if(i%5==0)
			{
				if(i%2==0)
				System.out.println(i);
			}
		}
	}

}
