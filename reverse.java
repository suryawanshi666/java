import java.util.*;
class demo
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.printf("enter string");
        String s1=sc.nextLine();
        String s2[]=s1.split(" ");
        for(int i=0;i<s2.length;i++)
        {
           StringBuffer sbr=new StringBuffer(s2[i]);
           sbr.reverse();
           System.out.printf(sbr +" ");
        }
    }
}
