/*write a program to print all prime number in an array of 'n'elements
(use command line arrguments)*/
class Prime
 {0arrguments)*
  public static void main(String arg[])
     {
	System.out.println("Prime Number=");
	 for(int i=0;i<arg.length;i++)
   	   {
		int n=Integer.parseInt(arg[i]);
		int s=0;
		  for(int j=2;j<n;j++)
		   {
		     if(n%j==0)
			{
			  s=s+1;
			}
		   }
		  if(s==0)
		   System.out.println(n+" ");
	   }
	}
}
