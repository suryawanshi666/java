/*: Write a program to create a class
Customer(custno,custname,contactnumber,custaddr). Write a method to search the
customer name with given contact number and display the details.
Slip 29 */
  package Slips;
import java.util.Scanner;
class slip29_1
{
    int custno;
    String custname,contno,custaddr;
    Scanner sc=new Scanner(System.in);

    slip29_1()
    {
        System.out.println("enter custno name contact no addr::");
        custno=sc.nextInt();
        custname=sc.next();
        contno=sc.next();
        custaddr=sc.next();
    }
    int search(String cno)
    {
        if(cno.equals(contno))
            return 1;
        return 0;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Limit::");
        int n=sc.nextInt();
        slip29_1 c[]=new slip29_1[n];
        for(int i=0;i<n;i++)
        {
            c[i]=new slip29_1();
        }
        System.out.println("enter contact no to search customer");
        String cno=sc.next();
        for(int i=0;i<n;i++)
        {
            if(c[i].search(cno)==1)
            {
                System.out.println("\nCustomer name::"+c[i].custname);
                break;
            }
        }
    }
}
/*Write a program to create a super class Vehicle having members Company and
price.
Derive two different classes LightMotorVehicle(mileage) and HeavyMotorVehicle
(capacity_in_tons). Accept the information for "n" vehicles and display the
information in appropriate form. While taking data, ask user about the type of vehicle first
29_2*/
  package Slips;
import java.util.Scanner;
class Vehical
{
	String company;
	double price;
}
class LightMotorVehicle extends Vehical
{
	double mileage;
	LightMotorVehicle(String company,double price,double mileage){
		this.mileage=mileage;
		this.company=company;
		this.price=price;
	}
	
	void display() {
		System.out.println(company+"\t"+price+"\t"+mileage);
	}
}
class HeavyMotorVehicle extends Vehical{
	double capacity;
	HeavyMotorVehicle(String company,double price,double capacity)
	{
		this.capacity=capacity;
		this.company=company;
		this.price=price;
	}
	
	void display()
	{
		System.out.println(company+"\t"+price+"\t"+capacity);
	}
}

public class slip29_2
{
	public static void main(String[] args)
	{
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Accept Detaiis For :\n\n1-LightMotorVehicle\n2-HeavyMotorVehicle");
		int c=sc1.nextInt();
		if(c==1)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Limit ::");
			int n=sc.nextInt();
			LightMotorVehicle ob1[]=new LightMotorVehicle[n];
			for(int i=0;i<n;i++) {
				System.out.println("Enter Company Name ::");
				String company=sc.next();
				System.out.println("Enter Price of Vehicle ::");
				double price=sc.nextDouble();
				System.out.println("Enter Mileage ::");
				double mileage=sc.nextDouble();
				ob1[i]=new LightMotorVehicle(company,price,mileage);
			}
			System.out.println("Company\tPrice\tMileage");
			for(int i=0;i<n;i++) {
				ob1[i].display();
			}
		}
		else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Limit ::");
			int n=sc.nextInt();
			HeavyMotorVehicle ob2[]=new HeavyMotorVehicle[n];
			for(int i=0;i<n;i++) {
				System.out.println("Enter Company Name ::");
				String company=sc.next();
				System.out.println("Enter Price of Vehicle ::");
				double price=sc.nextDouble();
				System.out.println("Enter Capacity ::");
				double capacity=sc.nextDouble();
				ob2[i]=new HeavyMotorVehicle(company,price,capacity);
			}
			System.out.println("Company\tPrice\tCapacity");
			for(int i=0;i<n;i++) {
				ob2[i].display();
			}
		}
	}
}
