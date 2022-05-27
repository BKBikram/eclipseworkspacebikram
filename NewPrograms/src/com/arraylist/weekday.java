package com.arraylist;
import java.util.*;
public class weekday {

	public static void main(String[] args) {
		// User enters  number, then program tells  name of the day using switch as well as if else if .
		//also print whether that day is weekend or weekday 
				Scanner sc=new Scanner (System.in);
				System.out.println("Enter a number between 1 to 7");
				int week;
				week=sc.nextInt();
				switch(week)
				{
				case 1:
				    System.out.println("SUNDAY AND Its HOLIDAY");
				    break;
				case 2:
					System.out.println("MONDAY and its a weekday");
				    break;
				case 3:
					System.out.println("TUESDAY and its a weekday");
				    break;
				case 4:
					System.out.println("WEDNESDAY and its a weekday");
				    break;
				case 5:
					System.out.println("THURSDAY and its a weekday");
				    break;
				case 6:
					System.out.println("FRYDAY and its a weekday");
				    break;
				case 7:
					System.out.println("SATURDAY and its a weekday");
				    break;
				default:
						System.out.print("Enter a valid number");
						
				//USING IF ELSE
				/*
				 * if(week==1) System.out.println("sunday"); else if(week==2)
				 * System.out.println("monday"); else if(week==3) System.out.println("tuesday");
				 * else if(week==4) System.out.println("wednesday"); else if(week==5)
				 * System.out.println("thursday"); else if(week==6)
				 * System.out.println("friday"); else if(week==7)
				 * System.out.println("saturday"); else System.out.println("Enter valid input");
				 */
				    
				}
			}



	}
