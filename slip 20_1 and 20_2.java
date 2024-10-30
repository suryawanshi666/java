/*Write a Program to illustrate multilevel Inheritance such that country is
inherited from continent. State is inherited from country. Display the place, state,
country and continent.
slip5_20_1*/
  import java.util.*;
class conti
{
		String cname;
		
}
class country extends conti
{
	String con_name;
}
class state extends country
{
	String sname,place;
	void disp()
	{
		System.out.println("continent name="+cname);
		System.out.println("country name="+con_name);
		System.out.println("state name="+sname);
		System.out.println("place name="+place);
	}
public static void main(String arg[])
{
	state ob=new state();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter continent name:");
	 ob.cname=sc.next();
	System.out.println("enter country name:");
	 ob.con_name=sc.next();
	System.out.println("enter state name:");
	ob.sname=sc.next();
	System.out.println("enter place name:");
	 ob.place=sc.next();
	ob.disp();
}
}
/*Write a package for Operation, which has two classes, Addition and
Maximum. Addition has two methods add () and subtract (), which are
used to add two integers and subtract two, float values respectively.
20_2*/
package operation;
public class Addition {

	public int add(int a,int b)
	{
		return a+b;
	}
	public float  sub(float a,float b)
	{
		return a-b;
	}
}


package operation;

public class maximun {
	public void  max(int a,int b)
	{
		if(a>b)
			System.out.println("1 st no is maximim");
			else
				System.out.println("2nd no is maximum");
	}

}


package operation;
import operation.*;
import java.util.*;
public class demo 
{
	public static void main(String arg[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter two no:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	Addition ob=new Addition();
	maximun ob1=new maximun();
	int c=ob.add(a,b);
	System.out.println("addition="+c);
	
	float d=ob.sub(a,b);
	System.out.println("subtraction="+d);
	
	ob1.max(a, b);

	}
}
