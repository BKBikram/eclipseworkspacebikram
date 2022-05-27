package TestQs;
//*                  *
//* *              * *
//* * *          * * *
//* * * *      * * * *
//* * * * *  * * * * *
//* * * * *  * * * * *
//* * * *      * * * *
//* * *          * * *
//* *              * *
//*                  *

public class PatternProgram {

	public static void main(String[] args) {
		int i;
		// TODO Auto-generated method stub
		for(i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			   for(int k=i*2;k<=5*2-1;k++)
			    {
				System.out.print(" ");
			    }
			for(int l=1;l<=i;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=1;i<=4;i++)
		{
			for(int j=1;j>=i;j--);
			{
			System.out.print("*");
			}
			//System.out.print("");
		   for(int k=1;k<=i*2;k++)
		   {
		 	System.out.print(" ");
		   }
		  for(int l=4;l>=i;l--)
		   {
			System.out.println("*");
		   }
		  System.out.println();
		}

	}

}
