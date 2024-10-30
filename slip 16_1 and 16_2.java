/* Write a program to find the Square of given number using function interface.
Slip16_1*/
  package Slips;
interface Square
{
void square(int num);
}
class demo implements Square
{
   public void square(int num)
    {
	int c=num*num;
	System.out.println("Square="+c);
    }
}
class slip16_1
{
    public static void main(String args[])
      {
	demo ob=new demo();
	ob.square(5);
      }
}
/* Write a program to design a screen using Awt that, 
Slip16_2 */
  package Slips;
import javax.swing.*;
import java.awt.*;
class slip16_2
{
  JMenu File;
  JMenu Edit;
  JMenu About;
  JMenuItem i1, i2, i3, i4, i5;

  slip16_2()
    {
	JFrame f= new JFrame("Menu and MenuItem Example");
	JMenuBar mb=new JMenuBar();
	File=new JMenu("File");
	Edit=new JMenu("Edit");
	About=new JMenu("About");
	  i1=new JMenuItem("New Ctrl+N");
	  i2=new JMenuItem("Open");
	  i3=new JMenuItem("Save");
	  i4=new JMenuItem("Show About");
	  i5=new JMenuItem("Exit");
	File.add(i1); File.add(i2);
	File.add(i3);File.add(i4);File.add(i5);
	  mb.add(File);
	  mb.add(Edit);
	  mb.add(About);
	f.setJMenuBar(mb);
	f.setSize(400,400);
	f.setLayout(null);
	f.setVisible(true);
   }
public static void main(String args[])
   {
	new slip16_2();
   }
}


