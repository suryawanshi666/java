import java.util.*;
class Emp
{
    int Eno;
    String Ename;
    double sal;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter emp number");
           Eno=sc.nextInt();
        System.out.println("enter emp name");
           Ename=sc.next();
        System.out.println("enter emp sal");
           sal=sc.nextDouble();
    }
    void display()
    {
        System.out.println("emp no="+Eno);
        System.out.println("emp name="+Ename);
        System.out.println("emp sal="+sal);
    }
    public static void main(String arg[])
    {
         Emp ob[]=new Emp[10];
         Scanner sc=new Scanner(System.in);
         System.out.println("enter limit");
         int n=sc.nextInt();
         for(int i=0;i<n;i++)
         {
             ob[i]=new Emp();
             ob[i].accept();
         }
         for(int i=0;i<n;i++)
         {
            ob[i].display();
         }
    }
}
