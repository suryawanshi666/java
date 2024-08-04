import java.util.*;
class book
{
    int bno,qty;
    String bname;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter book number:");
          bno=sc.nextInt();
        System.out.println("enter book name");
          bname=sc.next();
        System.out.println("enter book qty");
          qty=sc.nextInt();
    }
    public static void main(String arg[])
    {
         book ob[]=new book[100];
         Scanner sc=new Scanner(System.in);
         System.out.println("enter limit");
         int n=sc.nextInt();
         for(int i=0;i<n;i++)
         {
             ob[i]=new book();
             ob[i].accept();
         }
         System.out.println("enter book name to search quantity");
         String name=sc.next();
         int flag=0;
         for(int i=0;i<n;i++)
         {
             if(ob[i].bname.equals(name))
             {
                 System.out.println("quantity="+ob[i].qty);
                 flag=1;
                 break;
             }
         }
         if(flag==0)
           System.out.println("book not found");
    }
}
