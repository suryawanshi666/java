import java.util.*;
class leapyear
{
    public static void main(String arg[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        n=sc.nextInt();
        if(n%4==0)
            System.out.println("leap year");
        else
            System.out.println("not leap year");
    }
}
