/*Write a program to accept a number from the user, if number is zero then throw user
defined exception “Number is 0” otherwise check whether no is prime or not (Use static keyword).*/
slip14_1 package Slips;
import java.util.Scanner;
import java.util.*;
class slip14_1 extends Exception
{ 
	static int count=0;
	public static void main(String args[])
	{
			int num,i,j;
			Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("enter number");
			num=sc.nextInt();
			if(num==0)
				throw new slip14_1();
			if(num>0)
			{
				for(i=2;i<=num/2;i++)
				{
					if(num%i==0)
					{
						count++;
					}
				}
			}
			if(count==0)
				System.out.println("Number is Prime");
			else
				System.out.println("number is not prime");
		}
		catch(slip14_1 ob)
		{
			System.out.println("number is  zero");
		}
	}
}
/*Write a Java program to create a Package “SY” which has a class SYMarks (members –
ComputerTotal, MathsTotal, and ElectronicsTotal). Create another package TY which has a class
TYMarks (members – Theory, Practicals). Create ‘n’ objects of Student class (having rollNumber,
name, SYMarks and TYMarks). Add the marks of SY and TY computer subjects and calculate the
Grade (‘A’ for >= 70, ‘B’ for >= 60 ‘C’ for >= 50, Pass Class for > =40 else‘FAIL’) and display the result
of the student in proper format*/
package SY;
public class SYmarks 
{
	int ct,mt,et;
	public SYmarks(int ct,int mt,int et)
	{
		this.ct=ct;
		this.mt=mt;
		this.et=et;
	}
	public int ct()
	{
		return ct;
	}
}


package TY;
public class TYmarks 
{
	int th,prac;
	public TYmarks(int th,int prac)
	{
		this.th=th;
		this.prac=prac;
	}
	public int th()
	{
	return th;	
	}
	public int getprac() 
	{
		return prac;
	}
}


import SY.*;
import TY.*;
import java.util.*;
class student
{
	int rno;
	String nm;
	SYmarks sy;
	TYmarks ty;
	int grade;
	student(int r,String nm,int ct,int mt,int et,int th,int prac)
	{
		rno=r;
		this.nm=nm;
		sy=new SYmarks(ct,mt,et);
		ty=new TYmarks(th,prac);
		int totm=sy.ct()+ty.th()+ty.getprac();
		System.out.println("total="+totm);
		float per=totm/7;
		System.out.println("total="+per);
		if(per>=70)
			System.out.println("Grade='A'");
		else if(per>=60)
			System.out.println("Grade='B'");
		else if(per>=50)
			System.out.println("Grade='C'");
		else if(per>=40)
			System.out.println("Grade='PASS'");
		else
			System.out.println("Grade='FAIL'");
	}
}
public class stud
{
	public static void main(String[] args)
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter number of student=");
	  int n=sc.nextInt();
	  student s[]=new student[n];
	  for(int i=0;i<n;i++)
	  {
		  System.out.println("enter roll number ,name,ct,mt,et,th,prac");
		  int r=sc.nextInt();
		  String nm=sc.next();
		  int ct=sc.nextInt();
		  int mt=sc.nextInt();
		  int et=sc.nextInt();
		  int th=sc.nextInt();
		  int prac=sc.nextInt();
		   s[i]=new student(r,nm,ct,mt,et,th,prac);
	  }
	}

}

