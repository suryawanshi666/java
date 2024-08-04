class demo
{
    int a=10;
    void show()
    {
        int a=55;
        System.Out.Println("value=",+a);
        this.a=99;
         System.Out.Println("value=",+this.a);
          System.Out.Println("value=",+a);
    }
    public static void main(String arg[])
    {
         demo ob=new demo();
         ob.show();
    }
}
