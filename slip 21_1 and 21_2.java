/*Define a class MyDate(Day, Month, year) with methods to accept and display a
MyDateobject. Accept date as dd,mm,yyyy. Throw user defined exception
"InvalidDateException" if the date is invalid.
Slip 21 */
  import java.util.Scanner;
class InvalidDateException extends Exception
{
    public String toString()
    {
        return "Date is invalid";
    }
}
class slip21_1
{
    int dd,mm,yy,f=0;
    Scanner sc=new Scanner(System.in);
    slip21_1()
    {
        System.out.println("Enter date as dd-mm-yyyy:");
        dd=sc.nextInt();
        mm=sc.nextInt();
        yy=sc.nextInt();
        try
        {
            if(mm>=1 || mm<=12)
            {
                if(mm==1 || mm==3 || mm==5 || mm==7 || mm==8 || mm==10 || mm==12)
                {
                    if(dd>=1 && dd<=31)
                        f=1;
                    else
                        throw new InvalidDateException();
                }
                if(mm==2)
                {
                    if(dd>=1 && dd<=28)
                        f=1;
                    else
                        throw new InvalidDateException();
                }
                if(mm==4 || mm==6 || mm==9 || mm==11)
                {
                    if(dd>=1 && dd<=30)
                        f=1;
                    else
                        throw new InvalidDateException();
                }
            }
            else
            {
                throw new InvalidDateException();
            }
       }
       catch(InvalidDateException e)
       {
        System.out.println("Error::"+e);
       }
    }
    void display()
    {
        System.out.println("DD-MM-YYYY");
        System.out.println(dd+"-"+mm+"-"+yy);
    }
    public static void main(String arg[])
    {
    	slip21_1 md=new slip21_1();
        if(md.f==1)
        {
            md.display();
        }
    }
}
/* Create an employee class(id,name,deptname,salary). Define a default and
parameterized constructor. Use ‘this’ keyword to initialize instance variables. Keep a
count of objects created. Create objects using parameterized constructor and display the
object count after each object is created. (Use static member and method). Also display
the contents of each object.
Slip 21_2 */
  package Slips;
import java.util.Scanner;

class slip21_2
{
    int id;
    String name,deptname;
    double salary;
    static int cnt=0;
    slip21_2()
    {
        id=0;
        name="";
        deptname="";
        salary=0.0;
    }
    slip21_2(int id,String name,String deptname,double salary)
    {
        this.id=id;
        this.name=name;
        this.deptname=deptname;
        this.salary=salary;
    }
    static void display(slip21_2 e[],int n)
    {
        for(int i=0;i<n;i++)
            System.out.println(e[i].id+"\t"+e[i].name+"\t"+e[i].deptname+"\t"+e[i].salary);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Limit:");
        int n=sc.nextInt();
        slip21_2 e[]=new slip21_2[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter id name deptname salary");
            int id=sc.nextInt();
            String name=sc.next();
            String deptname=sc.next();
            double sal=sc.nextDouble();
            e[i]=new slip21_2(id, name, deptname, sal);
            cnt++;
            System.out.println("Object count::"+cnt);
        }
        display(e,n);
    }
}
