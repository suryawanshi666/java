import java.util.*;
class evenodd
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        if(n%2==0)
            System.out.println("number is even");
        else
            System.out.println("number is odd");
    }
}
