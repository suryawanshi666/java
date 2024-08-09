/*create a class employee.accept values from user 
passing to the paramerised constructor and display*/
import java.util.*;
class emp
{
   int eno;
   String ename;
   float sal;
   emp(int eno,String ename,float sal)
   {
      this.eno=eno;
      this.ename=ename;
      this.sal=sal;
   }
   void disp()
   {
      System.out.println("emp no="+eno);
      System.out.println("emp name="+ename);
      System.out.println("emp sal="+sal);
   }
   public static void main(String arg[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter emp no");
      int eno=sc.nextInt();
      System.out.println("enter emp name");
      String ename=sc.next();
      System.out.println("enter emp sal");
      float sal=sc.nextFloat();
      
      emp ob=new emp(eno,ename,sal);
      ob.disp();
   }
}
