package myproject;

import java.util.Scanner;

public class frequencychar {
	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		int len=st.length();
		int[] frequency=new int[len];
		char ch[] =st.toCharArray();
		int i,j;
		for( i=0;i<len;i++)
		{
			frequency[i]=1;
			
			for( j=i+1;j<len;j++)
			{
				if(ch[i]==ch[j]);
				{
				frequency[i]++;
				ch[j]='0';
				}
			}
		}
		for( i=0;i<frequency.length;i++)
		
			if(ch[i]!=' ' && ch[i]!='0')
			System.out.println(ch[i]+"="+frequency[i]);
		
	}

}
