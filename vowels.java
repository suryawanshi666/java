import java.util.*;
class demo
{
     public static void main(String arg[])
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter string");
         String s1=sc.nextLine();
         System.out.println("vowels=");
         for(int i=0;i<s1.length();i++)
         {
              if(s1.charAt(i)=='a'||s1.charAt(i)=='A')
              if(s1.charAt(i)=='e'||s1.charAt(i)=='E')
              if(s1.charAt(i)=='i'||s1.charAt(i)=='I')
              if(s1.charAt(i)=='o'||s1.charAt(i)=='O')
              if(s1.charAt(i)=='u'||s1.charAt(i)=='U')
              System.out.println(s1.charAt(i));     
         }
     }
}
