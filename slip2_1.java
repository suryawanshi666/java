/*Write a program to read the First Name and Last Name of a person, his weight and
height using command line arguments. Calculate the BMI Index which is defined as the
individual's body mass divided by the square of their height. */
package Slips;
class slip2_1
{
   public static void main(String args[])
    {
       String fname=args[1];
       String Lname=args[2];
      double weight=Double.parseDouble(args[2]);  
      double height=Double.parseDouble(args[3]);
      double BMI=weight/(height*height);
         System.out.println("First Name is="+fname);
         System.out.println("Last Name is="+Lname);
         System.out.println("Weight is="+weight);
         System.out.println("Height is="+height);
         System.out.println("The body mass index(BMI) is="+BMI+"kg/m2");
    }
}
