import java.util.*;
class person
{
   int pid,age;
   String pname,gender;
   person()
   {
       pid=1;
       pname="sai";
       age=44;
       gender="male";
   }
   person(int pid,String pname,int age,String gender)
   {
       this.pid=pid;
       this.pname=pname;
       this.age=age;
       this.gender=gender;
   }
   void disp()
   {
       System.out.println(pid+"\t"+pname+"\t"+age+"\t"+gender);
   }
   public static void mai(String arg[])
   {
      person ob[]=new person[5];
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<5;i++)
      {
          System.out.println("enter person id");
              int id=sc.nextInt();
          System.out.println("enter person name");
              String name=sc.next();
          System.out.println("enter person age");
              int age=sc.nextInt();
          System.out.println("enter person gender");
              String gender=sc.next();
          ob[i]=new person(id,name,age,gender);
      }
      for(int i=0;i<5;i++)
      {
         ob[i].disp();
      }
   }
}
