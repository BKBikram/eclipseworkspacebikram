package com.FileIOStream;

import java.io.*;
import java.nio.CharBuffer;
import java.util.Scanner;

public class FileOutput {

	public static void main(String[] args) throws Exception  {
		//File f=new File("bik.txt");
//		char[] dat=new char[100];
//		FileReader fr=new FileReader("abc.txt");
//		fr.read(dat);
//		System.out.println(dat);
//		fr.close();
		
		
		//how to append data
		String data="Data is appended";
		FileWriter fw=new FileWriter("abc.txt",true);
		fw.write(data);
		System.out.println("data append successfully");
		fw.close();
		//how to delete a file
		File file=new File("bikram.txt");
		file.createNewFile();
		if(file.delete())
		{
			System.out.println("file deleted successfully");
		}
		else
			System.out.println("file couldnot deleted");

	}

}
