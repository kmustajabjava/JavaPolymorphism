import java.util.Scanner;
abstract public class Student 
{
String Sname,Reg_No,Address,Fname,CNIC;
double Fee;
Scanner myObj=new Scanner(System.in);
Student()
{
	Sname="Kainat";
	Reg_No="521-BSITF20";
	Address="ISLAMABAD";
	Fname="Mustajab";
	CNIC="61101";
	Fee=66700;
}
void setdata()
{
	System.out.print("Enter Student Name: ");
	Sname=myObj.nextLine();
	System.out.print("Enter Reg Num: ");
	Reg_No=myObj.nextLine();
	System.out.print("Enter Address: ");
	Address=myObj.nextLine();
	System.out.print("Enter Father Name: ");
	Fname=myObj.nextLine();
	System.out.print("Enter CNIC: ");
	CNIC=myObj.nextLine();
	System.out.print("Enter Fee: ");
	Fee=myObj.nextDouble();
	}
void getdata()
{
	System.out.print("Student Name:      "+Sname
			      +"\nReg Num:           "+Reg_No
	              +"\nAddress:           "+Address
                  +"\nFather Name:       "+Fname
	              +"\nCNIC:              "+CNIC
	              +"\nFee:               "+Fee);		
}
abstract void feecal();
}
