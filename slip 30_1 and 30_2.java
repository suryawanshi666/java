/*Write program to define class Person with data member as
Personname,Aadharno, Panno. Accept information for 5 objects and display appropriate
information (use this keyword).
Slip30_1*/
  import java.util.*;
class Person
{
	String pname,adhar,pan;
	void accept(String pname,String adhar,String pan)
	{
		this.pname=pname;
		this.adhar=adhar;
		this.pan=pan;
	}
	void disp()
	{
		System.out.println("Person name="+pname);
		System.out.println("Person Adhar number="+adhar);
		System.out.println("Pancard="+pan);
	}
  public static void main(String[] args)
  {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Limit");
	 int n=sc.nextInt();
	 Person ob[]=new Person[n];
	 for(int i=0;i<n;i++)
	 {
	  ob[i]=new Person();
	  System.out.println("Enter Pname adharnumber pan number");
	  String pname=sc.next();
	  String ad=sc.next();
	  String pan=sc.next();
	  ob[i].accept(pname, ad, pan);
	 }
	 for(int i=0;i<n;i++)
	 {
		 ob[i].disp();
	 }
  }
}
/*Write a program that creates a user interface to perform integer divisions.
The user enters two numbers in the text fields, Number1 and Number2. The division of
Number1 and Number2 is displayed in the Result field when the Divide button is
clicked. If Number1 or Number2 were not an integer, the program would throw a
NumberFormatException. If Number2 were Zero, the program would throw an
Arithmetic Exception Display the exception in a message
dialog box 
slip30_2*/
  import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class slip30_2 extends JFrame implements ActionListener
{
	JTextField t1,t2;
	JButton b1;
	JLabel l1,l2,Result;
	slip30_2()
	{
		t1=new JTextField(8);
		t2=new JTextField(8);
		Result=new JLabel();
		l1=new JLabel("Enter First Number:");
		l2=new JLabel("Enter Second Number:");
		b1=new JButton("Division");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(Result);
		setLayout(new FlowLayout());
		b1.addActionListener(this);
		setVisible(true);
		setSize(400,500);
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
			int v1=Integer.parseInt(t1.getText());
			int v2=Integer.parseInt(t2.getText());
			int ans=v1/v2;
			System.out.println(ans+"");	
		}
		catch(NumberFormatException e)
		{
			System.out.println("Enter a Valid Number");
		}
		catch(ArithmeticException e1)
		{
			System.out.println("Divide by Zero");
		}
	}
	public static void main(String[] args)
	{
		slip30_2 ob=new slip30_2();
	}
}
