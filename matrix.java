import java.util.*;
class demo
{
    public static void main(String arg[])
    {
        int m,n,i,j;
        int a[][]=new int[10][10];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows and columns");
        m=sc.nextInt();
        n=sc.nextInt();
        System.out.println("enter matrix");
        for(i=0;i<m;i++)
        for(j=0;j<n;j++)
        a[i][j]=sc.nextInt();
        System.out.println("display original matrix");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                   System.out.println(a[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("display tranpose matrix");
        for(i=0;i<n;i++)
        {
           for(j=0;j<n;j++)
           {
               System.out.println(a[i][j]+"\t");
           }
           System.out.println();
        }
    }
}
