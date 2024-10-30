/*: Write a program to implement Border Layout Manager.
Slip18_1:*/ 
package Slips;
import java.awt.*;
import javax.swing.*; 
class slip18_1 extends JFrame
{  
	slip18_1() 
{   
JButton b1=new JButton("North"); 
 JButton b2=new JButton("South");  
JButton b3=new JButton("East"); 
 JButton b4=new JButton("West"); 
 JButton b5=new JButton("Center");  
      
add(b1,BorderLayout.NORTH);
  add(b2,BorderLayout.SOUTH); 
 add(b3,BorderLayout.EAST); 
 add(b4,BorderLayout.WEST);  
add(b5,BorderLayout.CENTER); 
 setSize(300,300);   
setVisible(true); 
} 
public static void main(String[] args) 
{  
slip18_1 ob=new slip18_1(); 
} 
}

/*Define a class CricketPlayer (name,no_of_innings,no_of_times_notout, totatruns, bat_avg).
Create an array of n player objects. Calculate the batting average for each player
using static method avg(). Define a static sort method which sorts the array on the
basis of average.
Display the player details in sorted order. 
Slip 18_2*/ 
  package Slips;
import java.util.Scanner;

class slip18_2
{
    String name;
    int innings,notout,tot_runs;
    double bat_avg;
    Scanner sc=new Scanner(System.in);

    slip18_2()
    {
        System.out.println("enter name innings notout totruns");
        name=sc.next();
        innings=sc.nextInt();
        notout=sc.nextInt();
        tot_runs=sc.nextInt();
        bat_avg=slip18_2.avg(tot_runs,innings,notout);
    }

    void disp()
    {
        System.out.println(name+"\t"+innings+"\t"+notout+"\t"+tot_runs+"\t"+bat_avg);
    }
    static double avg(int tot_runs,int innings,int notout)
    {
        return tot_runs/(innings-notout);
    }
    static void sort(slip18_2 c[],int n)
    {
    	slip18_2 temp;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(c[i].bat_avg>c[j].bat_avg)
                {
                    temp=c[i];
                    c[i]=c[j];
                    c[j]=temp;
                }
            }
        }
    }

    public static void main(String ar[]) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Limit for players:");
        int n=sc.nextInt();
        slip18_2 ob[]=new slip18_2[n];
        for(int i=0;i<n;i++)
        {
            ob[i]=new slip18_2();
        }
        System.out.println("\nName\tInnings\tNotOuts\tTotRuns\tBat_avg");        
        for(int i=0;i<n;i++)
        {
            ob[i].disp();
        }
        sort(ob, n);
        System.out.println("\n\nAfter sorting on bat avg:");
        System.out.println("\nName\tInnings\tNotOuts\tTotRuns\tBat_avg");
        for(int i=0;i<n;i++)
        {
            ob[i].disp();
        }
    }
    
}


