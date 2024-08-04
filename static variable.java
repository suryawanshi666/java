class demo
{
   static int a;
   void show()
   {
       a++;
       System.out.println("value of a="+a);
   }
   public static void main(String arg[])
   {
   demo ob=new demo();
      ob.show();
   demo ob1=new demo();
      ob.show();
   demo ob2=new demo();
      ob.show();
    }
}
