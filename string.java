import java.util.*;
class one
{
    public static void main(String arg[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter string");
       String s1=sc.nextLine();
       System.out.println("enter string");
       String s2=sc.nextLine();
       if(s1.equelsIgnorecase(s2))
             System.out.println("string are same");
       else
             System.out.println("string are not same");
    }
}
