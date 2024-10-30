/*Write a program to display the Employee(Empid, Empname,
mpdesignation, Empsal) information using toString(). 
*/
Slip6_1:package Slips;
import java.util.*;
public class slip6_1
{
  int id,sal;
  String name,desig;
  void accept()
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter id name desig sal:");
	  id=sc.nextInt();
	  name=sc.next();
	  desig=sc.next();
	  sal=sc.nextInt();
  }
  public String toString()
  {
return "\nId="+id+"\n Name="+name+"\nDesignation="+desig+"\n sal="+sal;			  
  }
public static void main(String[] args)
{
	slip6_1 ob=new slip6_1();
  ob.accept();
  System.out.println(ob);
}
}

/*Create an abstract class “order” having members id, description. Create two
subclasses “PurchaseOrder” and “Sales Order” having members customer name and
Vendor name respectively. Definemethods accept and display in all cases. Create 3
objects each of Purchase Order and Sales Order and accept and display details. */



slip6_2


  
package Slips;
import java.util.*;
abstract class order
{
	int id;
	String desc;
	abstract void accept();
	abstract void disp();
	Scanner sc=new Scanner(System.in);
}

class purchase extends order
{
	String cname;
	void accept()
	{
	System.out.println("enter pid=");
	id=sc.nextInt();
	System.out.println("enter desc=");
	 desc=sc.next();
	System.out.println("enter cname=");
	 cname=sc.next();
}
	void disp()
	{
	System.out.println(" pid="+id);
	System.out.println(" dest="+desc);
	System.out.println(" cname="+cname);
}
}

class sales extends order
{

	String vname;
	void accept()
{
	System.out.println("enter pid=");
	int id=sc.nextInt();
	System.out.println("enter desc=");
	String desc=sc.next();
	System.out.println("enter vname=");
	String vname=sc.next();
}
	void disp()
	{
	System.out.println(" pid="+id);
	System.out.println(" dest="+desc);
	System.out.println(" vname="+vname);
}
}
class slip6_2
{
public static void main(String arg[])
{
	purchase ob=new purchase();
	purchase ob1=new purchase();
	purchase ob2=new purchase();
	ob.accept(); 
	ob1.accept();
	ob2.accept();
	ob.disp();
	ob1.disp();
	ob2.disp();
	sales ob3=new sales();
	sales ob4=new sales();
	sales ob5=new sales();
	ob3.accept(); 
	ob4.accept();
	ob5.accept();
	ob3.disp();
	ob4.disp();
	ob5.disp();
}
}

