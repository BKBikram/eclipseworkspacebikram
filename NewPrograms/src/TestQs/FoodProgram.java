package TestQs;
import java.util.*;
import java.security.*;


//		In this problem, you are given an interface Food. There are two classes Pizza and Cake which 
//		implement the Food interface, 
//		and they both contain a method getType().
//
//		The main function in the Main class creates an instance of the FoodFactory class. 
//		The FoodFactory class contains a method getFood(String) that returns a new instance of Pizza or 
//		Cake according to its parameter.
//
//		You are given the partially completed code in the editor. Please complete the FoodFactory class.
//		Sample Input 1
//
//		cake
//		Sample Output 1
//
//		The factory returned class Cake
//		Someone ordered a Dessert!
//		Sample Input 2
//
//		pizza
//		Sample Output 2
//
//		The factory returned class Pizza
//		Someone ordered Fast Food!
		
		interface Food
		  {
		   public String getType();
		  }
		
		  class Pizza implements Food 
		  {
		   public String getType() 
		   {
		   return "Someone ordered a Fast Food!";
		   }
		  }

		  class Cake implements Food 
		  {

		   public String getType() {
		   return "Someone ordered a Dessert!";
		   }
		  }
		  
		  class FoodFactory 
		  {
		    public Food getFood(String order) 
		    {

		     switch (order)
		      {
		     case "pizza": return new Pizza();
		     case "cake" : return new Cake();
		     default : return null;
		       }
		    }
		  }
		class FoodProgram{
		public static void main(String[] args) 
		{
		
		  Scanner sc=new Scanner(System.in);
		  FoodFactory ff=new FoodFactory();
		  System.out.println("Enter the food which you want to order:");
		  Food food=ff.getFood(sc.nextLine());
		  System.out.println(food.getType());
		
		}
}


	

