package com.exampractice;

public class ArrayEqualInSizeOrNot {

	public static void main(String[] args) {
		int[] arr= {4,5,8,92,3,6,6,23,63};
		int[] arr1= {5,2,6,8,2,9};
		int len=arr.length;
		int len1=arr1.length;
		if(len==len1)
			System.out.println("Equal size array");
		else
			System.out.println("not equal size array");
	}

}
