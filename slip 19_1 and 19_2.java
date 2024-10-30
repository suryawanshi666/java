/*Write a program to accept the two dimensional array from user and display
sum of its diagonal elements.
Slip19_1: */
package Slips;
import java.util.Scanner;   
class slip19_1  
{    
public static void main(String args[]) 
   { 
    int m, n, i, j,sum=0; 
    Scanner sc=new Scanner(System.in);    
   System.out.print("Enter order of matrix: ");    
   m = sc.nextInt();        
     int array[][] = new int[m][m];  
   System.out.println("Enter the elements of the array: ");  
   for (i = 0; i < m; i++)     
 for (j = 0; j < m; j++)     
  array[i][j] = sc.nextInt();  
      
System.out.println("Elements of the array are: ");   
  for (i = 0; i < m; i++)    
 {     
 for (j = 0; j < m; j++)  
    {    
   System.out.print(array[i][j] + " ");   
  if(i==j)  
  sum+=array[i][j];  
 }   
System.out.println();   
  }  
System.out.println("Sum of Diagonal elements is "+sum);   
 }
}
/*Write a program which shows the combo box which includes list of
T.Y.B.Sc.(Comp. Sci) subjects. Display the selected subject in a text field
19_2 */
  package Slips;
import java.awt.*;
import java.awt.event.*;
class Item extends Frame implements ItemListener
{
    Choice c1;
    TextField t1;
    Item()
    {
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());

        c1=new Choice();
        c1.add("C");
        c1.add("C++");
        c1.add("Java");
        add(c1);
        t1=new TextField(30);
        add(t1);
        c1.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent ie)
    {
         if(ie.getSource()==c1)
         {
             String s1=c1.getSelectedItem();
             t1.setText(s1);
         }
    }
}
class slip19_2
{
  public static void main(String[] args)
  {
	 Item ob=new Item();
}	
}
