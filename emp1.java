import java.util.*;
class emp
{
   int eno;
   String ename;
   double sal;
   void accept(int eno,String ename,double sal)
   {
       this.eno=eno;
       this.ename=ename;
       this.sal=sal;
   }
   void display()
   {
       System.out.println("emp no="+eno);
       System.out.println("emp name="+ename);
       System.out.println("emp sal="+sal);
   }
   public static void main(String arg[])
   {
       emp ob[]=new emp[10];
       Scanner sc=new Scanner(System.in);
       System.out.println("enter limit");
       int n=sc.nextInt();
       for(int i=0;i<n;i++)
       {
           ob[i]=new emp();
           System.out.println("enter emp no:");
                int eno=sc.nextInt();
           System.out.println("enter emp name:");
                String ename=sc.next();
           System.out.println("enter emp sal:");
                double sal=sc.nextDouble();
                ob[i].accept(eno,ename,sal);
       }
   }
}
