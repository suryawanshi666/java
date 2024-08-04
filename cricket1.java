import java.util.*;
class cricketplayer
{
       String name;
       int pid,innings,notout,totalruns;
       float batavg;
       {
           Scanner sc=new Scanner(System.in);
           System.out.println("enter player id");
               pid=sc.nextInt();
           System.out.println("enter name");
               name=sc.next();
           System.out.println("enter number of innings");
               innings=sc.nextInt();
           System.out.println("enter number of not out");
               notout=sc.nextInt();
           batavg=totalruns/(innings*notout);
       }
       void disp()
       {
              System.out.println("player id="+pid);
              System.out.println("player name="+name);
              System.out.println("innings="+innings);
              System.out.println("not out="+notout);
              System.out.println("bat average="+batavg);
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
              float max=ob[0].batavg;
              int index=0;
              for(int i=0;i<n;i++)
              {
                   if(ob[i].batavg>max)
                   {
                        max=ob[i].batavg;
                        index=i;
                   }
              }
              ob[index].disp();
       }
}
