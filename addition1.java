import java.util.*;
class demo
{
   void add(int a,int b)
   {
       int c=a+b;
       System.out.println("Addition 1="+c);
   }
   void add(int a,int b,int c)
   {
       int z=a+b+c;
       System.out.println("Addition 2="+z);
   }
   void add(int a,float b)
   {
       float c=a+b;
       System.out.println("addition 3="+c);
   }
   public static void main(String arg[])
   {
      demo ob=new demo();
      ob.add(11,22);
       ob.add(11,22,55);
        ob.add(11,10.55f);
         ob.add(100,300);
   }
}
