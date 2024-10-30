/*Define a class CricketPlayer (name,no_of_innings,no_of_times_notout, totatruns,
bat_avg). Create an array of n player objects .Calculate the batting average for each player
using static method avg(). Define a static sort method which sorts the array on the basis of
average. Display the player details in sorted order. */
package Slips;
import java.util.*;
class slip2_2
 {
   String name;
   int innings,notout,totalruns;
   float batavg;
     void accept()
      {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter Name:");
           name=sc.next();
         System.out.println("Enter No. of innings:");
           innings=sc.nextInt();
         System.out.println("Enter No. of Notout inning:");
           notout=sc.nextInt();
         System.out.println("Enter Total runs:");
           totalruns=sc.nextInt();
         batavg=avg(innings,totalruns,notout);
      }
	static float avg(int innings,int totalruns,int notout)
	 {
	   return totalruns/(innings-notout);
	 }
	 static void sort(slip2_2 ob[],int n)
	 {
	   int i,pass;
	     for(pass=1;pass<n;pass++)
	      {
	        for(i=0;i<n-pass;i++)
	        {
	          if(ob[i].batavg<ob[i+1].batavg)
	             {
	      		 slip2_2 t=ob[i];
	   		ob[i]=ob[i+1];
	   		ob[i+1]=t;
	             }
	        }
              }
        for(i=0;i<n;i++)
        {
          System.out.println(ob[i].name+"\t"+ob[i].innings+"\t"+ob[i].notout+"\t"+ob[i].totalruns+"\t"+ob[i].batavg);
        }
   }
	 public static void main(String arg[])
	    {
	       Scanner sc=new Scanner(System.in);
	         System.out.println("Enter Limit:");
	           int n=sc.nextInt();
	           slip2_2 ob[]=new slip2_2[n];
	             for(int i=0;i<n;i++)
	               {
	                 ob[i]=new slip2_2();
	                 ob[i].accept();
	               }
	               sort(ob,n);
	      }
}
