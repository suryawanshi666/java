class area
{
   void area (float r)
   {
       float a=3.14f*r*r;
       System.out.println("area of circle="+a);
   }
   void area(float l,float b)
   {
      float a=l*b;
      System.out.println("area of rectangle="+a);
   }
   void area(double b,double h)
   {
   double a=0.5*b*h;
   System.out.println("area of triangle="+a);
   }
   public static void main(String arg[])
   {
       demo ob=new demo();
       ob.area(10.3,55.4);
       ob.area(6.3f,5.14f);
       ob.area(4.5f);
   }
}
