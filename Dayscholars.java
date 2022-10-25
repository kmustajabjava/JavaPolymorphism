import java.util.Scanner;

public class Dayscholars extends Student 
{
	int Bus_No;
	double Transportfee;
	Scanner myObj=new Scanner(System.in);
	Dayscholars()
	{
		super();
		Bus_No=12;
		Transportfee=10000.0;
	}
	void setdata()
	{
		super.setdata();
		System.out.print("Enter Bus Number: ");
		Bus_No=myObj.nextInt();
		System.out.print("Enter Transport Fee: ");
		Transportfee=myObj.nextDouble();
		}
	void getdata()
	{
		System.out.println("DAYSCHOLAR STUDENT");
		super.getdata();
		System.out.print( "\nBus Number:        "+Bus_No
		                 +"\nTransport Fee:     "+Transportfee);		
	}
void feecal()
{
	double TotalFee=Fee+Transportfee;
	System.out.println(   "\nTotal Fee is:      "+TotalFee);
}
}
