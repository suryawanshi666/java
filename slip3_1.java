/*Write a program to accept ‘n’ name of cities from the user and sort them in
ascending order.
*/
package Slips;
import java.util.*;
public class slip3_1
{
  public static void main(String[] args)
  {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Limit:");
	 int n=sc.nextInt();
	 String s1[]=new String[n];
	 System.out.println("Enter n city Names:");
	 for(int i=0;i<n;i++)
	 {
		 s1[i]=sc.next();
	 }
	 for(int pass=1;pass<n;pass++)
	 {
	  for(int i=0;i<n-pass;i++)
	  {
		 if((s1[i].compareTo(s1[i+1]))>0)
		 {
			 String t=s1[i];
			 s1[i]=s1[i+1];
			 s1[i+1]=t;
		 }
	  }
	 }
	 System.out.println("City Names:");
	 for(int i=0;i<n;i++)
		 System.out.println(s1[i]);
  }
}



