package com.exampractice;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random random =new Random();
		int a=random.nextInt(7);
		//System.out.println(a);
		System.out.println("Roll your dice");
		switch(a)
		{
		case 1:
			System.out.println(a);
			break;
		case 2:
			System.out.println(a);
			break;
		case 3:
			System.out.println(a);
			break;
		case 4:
			System.out.println(a);
			break;
		case 5:
			System.out.println(a);
			break;
		case 6:
			System.out.println(a);
			break;
		default:
			System.out.println("Roll your dice again");
		
		}
	}

}
