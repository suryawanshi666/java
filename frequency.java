import java.util.*;
class demo
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit");
        int n=sc.nextInt();
        int a[]=new int [n];
        System.out.println("enter n number");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int b[]=new int[1000];
        for(int i=0;i<b.length;i++)
        b[i]=0;
        for(int i=0;i<n;i++)
        {
            b[a[i]]++;
        }
        for(int i=0;i<b.length;i++)
        {
            if(b[i]!=0)
            System.out.println(i+"count="+b[i]);
        }
    }
}
