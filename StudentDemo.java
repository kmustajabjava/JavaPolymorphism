import java.util.Scanner;
public class StudentDemo 
{
	
	public static void main(String[] args) 
	{
		int choice;
		int num_of_Students;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the Number of Students:  ");
		num_of_Students=obj.nextInt();
		Student S[]=new Student[num_of_Students];
		for(int i=0;i<num_of_Students;i++)
		{
		do
		{
			   System.out.println("Enter 1 If You Are A Dayscholar");
			   System.out.println("Enter 2 If You Are A Hostellite");
			   System.out.println("Enter 3 To Exit");
			   choice=obj.nextInt();
			   if(choice==1)
			   {
				   S[i]=new Dayscholars();
				   S[i].setdata();
			   }
			   else if(choice==2)
			   { 
					   S[i]=new Hostellite();
					   S[i].setdata();
			   }
			   else
			   {
				   System.out.println("Please enter right choice");
			   }
			   
		}while(choice!=1&&choice!=2);

	}
		for(int i=0;i<num_of_Students;i++)
		{
			S[i].getdata();
			S[i].feecal();
		}
	}

}
