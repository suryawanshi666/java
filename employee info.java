// create a class emp using parametrised constructor
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
        System.out.println("Emp no="+eno);
        System.out.println("Emp name="+ename);
        System.out.println("Salary="+sal);
    }
    public static void main(String arg[])
    {
      emp ob=new emp(1,"om",5238790);
      ob.disp();
    }
}
