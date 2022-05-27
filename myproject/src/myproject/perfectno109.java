package myproject;

public class perfectno109 {
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("the perfect no between 1 to 1000 is");
		for(int i=1;i<100;i++)
		{
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
				{
				sum=sum+j;
				}
			}
			if(sum==i)
				System.out.println(i);
		}
		
	}

}
