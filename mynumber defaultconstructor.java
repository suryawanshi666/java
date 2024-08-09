/*Define a class my number having one private int data member
write a default constructor to initalize it to zero and
another constructor to initalize it to avalue(use this)
write methods isnegative,ispositive,iszero,iseven,isodd
create an object in main*/
class mynumber
{
    private int n;
    mynumber()
    {
        n=0;
    }
    mynumber(int n)
    {
       this.n=n;
    }
    int isnegative()
    {
       if(n<0)
          return 1;
       else
          return 0;
    }
    boolean ispositive()
    {
       if(n>0)
          return true;
       else
          return false;
    }
    boolean iszero()
    {
       if(n==0)
          return true;
       else
          return false;
    }
    boolean isodd()
    {
       if(n%2==1)
         return true;
       else
         return false;
    }
      boolean iseven()
    {
       if(n%2==0)
         return true;
       else
         return false;
    }
    public static void main(String arg[])
    {
       mynumber ob=new mynumber();
         if(ob.isnegative()==1)
            System.out.println("Number is negative");
         if(ob.ispositive())
            System.out.println("Number is positive");
         if(ob.iszero())
            System.out.println("Number is Zero");
         if(ob.isodd())
            System.out.println("Number is Odd");
         if(ob.iseven())
            System.out.println("Number is Even");
      System.out.println("calling pc");
      mynumber ob1=new mynumber(5);
       if(ob.isnegative()==1)
            System.out.println("Number is negative");
         if(ob.ispositive())
            System.out.println("Number is positive");
         if(ob.iszero())
            System.out.println("Number is Zero");
         if(ob.isodd())
            System.out.println("Number is Odd");
         if(ob.iseven())
            System.out.println("Number is Even");
    }
}
