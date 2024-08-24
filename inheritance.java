class A
{
    A()
    {
       System.out.println("i am base A");
    }
}
class B extends A
{
   B()
   {
       System.out.println("i am derived B");
   }
}
class MDemo
{
    public static void main(String arg[])
    {
       B ob=new B();
    }
}
