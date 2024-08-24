*/ example of inheritance collage and student
import java.util.*;
class college
{
   int cno;
   String cname,cadd,sname;
   Scanner sc=new Scanner(System.in);
   void acceptc()
   {
       System.out.println("enter college number");
       cno=sc.nextInt();
       System.out.println("enter college name");
       cname=sc.next();
        System.out.println("enter college address");
       cadd=sc.next(); 
   }
}
class student extends college
{
    int rno;
    String cname;
    float per;
    void accepts()
    {
         System.out.println("enter student number");
       rno=sc.nextInt();
        System.out.println("enter student name");
       String sname=sc.next();
        System.out.println("enter student per");
       per=sc.nextFloat();
    }
    void disp()
    {
       System.out.println("collage no="+cno);
       System.out.println("collage name="+cname);
       System.out.println("collage address="+cadd);
       System.out.println("student no="+rno);
       System.out.println("student name="+sname);
       System.out.println("student per="+per);
    }
    public static void main(String arg[])
    {
        student ob=new student();
        ob.acceptc();
        ob.accepts();
        ob.disp();
    }
}
