/*Define a class patient (patient_name, patient_age,
patient_oxy_level,patient_HRCT_report). Create an object of patient. Handle
appropriate exception while patient oxygen level less than 95% and HRCT scan
report greater than 10, then throw user defined Exception “Patient is Covid Positive(+)
and Need to Hospitalized” otherwise display its information. */
 package Slips;
import java.util.*;
class Covid extends Exception
{
  public String toString()
  {
	  return "Patient is Covid +ve and need to be Hosp...";
  }
}
 public class  slip3_2
{
  String name;
  int age,olevel,hrct;
  void accept()
  {
	try
	{
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter name age oxy level hrct:");
	 name=sc.next();
	 age=sc.nextInt();
	 olevel=sc.nextInt();
	 hrct=sc.nextInt();
	if(olevel<95&&hrct>=10)
		throw new Covid();
	System.out.println("Patient Name="+name);
	System.out.println("Patient Age="+age);
	System.out.println("Patient Oxylevel="+olevel);
	System.out.println("Patient HRCT="+hrct);
	}catch(Exception e)
	{
		System.out.println(e);
	}
  }
  public static void main(String[] args)
  {
	  slip3_2 ob=new slip3_2();
	 ob.accept();
  }
}
