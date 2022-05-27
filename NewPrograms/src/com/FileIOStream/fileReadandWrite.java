package com.FileIOStream;
import java.util.Scanner;
import java.io.*;

public class fileReadandWrite {

	public static void main(String[] args) throws FileNotFoundException {
		File f=new File("xyz.txt");
//		/*try {
//			if(f.createNewFile());
//			{
//				System.out.println("File created successfully");
//			}
//		} catch (IOException e) {
//			System.out.println("Some error occured while creating the file");
//		}*/
		
		
		
		try {
			FileWriter fr=new FileWriter("xyz.txt");
			fr.write("Hi how are you!");
			System.out.println("successfully written");
			fr.close();
		} catch (IOException e) {
			System.out.println("Couldnt written into the file");
		}
		
		
//		char[] ch=new char[100];
//		FileReader fr=new FileReader("xyz.txt");
//		//Scanner sc-new Scanner(fr);
//		try {
//			fr.read(ch);
//			System.out.println(ch);
//		} catch (IOException e) {
//			System.out.println("Couldnot read the file");
//		}
		Scanner sc=new Scanner(f);
		while(sc.hasNextLine())
		{
			String l=sc.nextLine();
			System.out.println(l);
		}
		
		
		
	}

}
