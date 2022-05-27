package myproject;

public class nestedtry_task {
	public static void main(String[] args) {
		try {
			try {
			int arr[] =new  int[7];
			arr[3]=20/2;
			//arr[17]=23;
			System.out.println("i am in try block");
			}
			catch(ArithmeticException a)
			{
				System.out.println("no cannot be divided by zero");
			}
			try {
				int arr1[]=new int[7];
				arr1[17]=25;
			}
			
			catch(ArrayIndexOutOfBoundsException b)
			{
				System.out.println("array is out of bound");
			}
			}
		finally {
			System.out.println("i am out of try block");
		}
	}

}
