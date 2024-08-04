import java.io.*;
class dispdemo
{
     public static void main(String arg[])
     {
        try
        {
           FileInputStream f1=newInputStream("demo.txt");
           int k;
           while(true)
           {
              k=f1.read();
              if(k==-1)
              break;
              System.out.println((char)k);
           }
           f1.close();
        }catch(Exception e)
        {
           System.out.println("error="+e);
        }
     }
}
