import java.util.Scanner;

public class Hostellite extends Student {
	int Hostel_No;
	int Room_No;
	double Hostelfee;
	Scanner myObj=new Scanner(System.in);
	Hostellite()
	{
		super();
		Hostel_No=23;
		Room_No=21;
		Hostelfee=30000.0;
	}
	void setdata()
	{
		super.setdata();
		System.out.print("Enter Hostel Number: ");
		Hostel_No=myObj.nextInt();
		System.out.print("Enter Room Number: ");
		Room_No=myObj.nextInt();
		System.out.print("Enter Hostel Fee: ");
		Hostelfee=myObj.nextDouble();
		}
	void getdata()
	{
		System.out.println("HOSTELLITE STUDENT");
		super.getdata();
		System.out.print( "\nHostel Number:     "+Hostel_No
				         +"\nRoom Number:       "+Room_No
		                 +"\nHostel Fee:        "+Hostelfee);		
	}
void feecal()
{
	double TotalFee=Fee+Hostelfee;
	System.out.println(   "\nTotal Fee is:      "+TotalFee);
}
}
