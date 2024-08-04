class demo
{
    static int a;
    void show()
    System.out.println("i am show");
}
static
{
       System.out.println("i am static block");
        a=55;
       System.out.println("value of a="+a);
}
public static void main(String arg[])
{
   System.out.println("i am main");
   demo ob=new demo();
   ob.show();
}
