import java.util.*;
class cricketplayer
{
     String name;
     int innings,notout,totalruns;
     float batavg;
     void accept()
     {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter name");
             name=sc.next();
          System.out.println("enter number of innings");
             innings=sc.nextInt();
          System.out.println("enter number of not out");
             notout=sc.nextInt();
          System.out.println("enter total runs");
             totalruns=sc.nextInt();
             batavg=avg(innings,totalruns,notout);
     }
     static float avg(int innings,int totalruns,int notout)
     {
         return totalruns/(innings*notout);
         }
         
     static void sort(cricketplayer ob[],int n)
     {
         int i,pass;
         for(pass=1;pass<n;pass++)
         {
             for(i=0;i<n-pass;i++)
             {
                   if(ob[i].batavg<ob[i+1].batavg)
                   {
                     cricketplayer t=ob[i];
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
  System.out.println("enter limit");
  int n=sc.nextInt();
  cricketplayer ob[]=new cricketplayer[n];
  for(int i=0;i<n;i++)
  {
     ob[i]=new cricketplayer();
     ob[i].accept();
  } 
  sort(ob,n);
}
}
