import java.util.*;
class student
{
    int rno;
    String name;
    float per;
    void accept()
    {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter roll no:");
              rno=sc.nextInt();
          System.out.println("enter name:");
              name=sc.next();
          System.out.println("enter per:");
              per=sc.nextFloat();
    }
    static void sort_by_per(student ob[],int n)
    {
        int i,pass;
        for(pass=1;pass<n;pass++)
        {
            for(i=0;i<n-pass;i++)
            {
                 if(ob[i].per<ob[i+1].per)
                 {
                     student t=ob[i];
                     ob[i]=ob[i+1];
                     ob[i+1]=t;
                 }
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.println(ob[i].rno+"\t"+ob[i].name+"\t"+ob[i].per+"\t");
        }
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit");
        int n=sc.nextInt();
        student ob[]=new student[n];
        for(int i=0;i<n;i++)
        {
           ob[i]=new student();
           ob[i].accept();
        }
        sort_by_per(ob,n);
    }
}
