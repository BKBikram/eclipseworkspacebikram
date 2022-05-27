package myproject;
import java.util.Scanner;
class functionavg{
public static float avg(int n[])
      {
      int sum=0;
      float avg1;
      for(int i=0;i<10;i++)
        {
        sum=sum+n[i];
        }
        avg1=(float)sum/10;
        return avg1;
      }
   public static void main(String[] args)
   {
   float r;
   Scanner sc=new Scanner(System.in);
   System.out.println("How many elements you want to store");
   int n=sc.nextInt();
   int arr[]=new int[n];
   for(int i=0;i<n;i++)
      {
      arr[i]=sc.nextInt();
      }
      r=avg(arr);
      System.out.println("The avg of 10 elements are:"+r);
      }
  }
