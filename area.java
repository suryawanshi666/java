import java.util.*;
class Area
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius");
        float r=sc.nextfloat();
        float a=3.14f*r*r;
        System.out.println("Area of circle="+a);
    }
}
