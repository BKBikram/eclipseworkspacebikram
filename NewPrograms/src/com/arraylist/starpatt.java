package com.arraylist;

import java.util.Scanner;

public class starpatt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rows");
		int rows=sc.nextInt();

        for (int i = 1; i <= rows; i++)
        {
            for (int j = rows; j > i; j--)
            {
                System.out.print(" ");
            }

            int temp = 1;
            for (int k = 1; k <= i; k++)
            {
                System.out.print(temp + " ");
                temp = temp * (i - k) / (k);
            }
            System.out.println();
        }
    }

	}

