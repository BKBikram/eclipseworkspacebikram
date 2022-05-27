package myproject;

public class starpattern1 {
	public static void main(String []args) {
		/*
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 * 123456
		 * 
		 * 
		 * A
		 * AB
		 * ABC
		 * ABCD
		 * 
		 * 
		 * $ $ $ $
		 * $     $
		 * $     $
		 * $ $ $ $
		 * 
		 */
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
				{
				   System.out.print(" ");
			    }
				for(int k=4;k>=i;k--)
				{
					System.out.print("*");
				}
				for(int l=3;l>=i;l--)
				{
					System.out.print("*");
			    }
			System.out.println();
		}
		/*
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(char i='a';i<='e';i++)
		{
			for(char j='a';j<i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}*/
	}

}
