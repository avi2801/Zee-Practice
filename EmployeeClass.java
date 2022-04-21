package n19April;
import java.util.Scanner;
import java.sql.*;
class Work
{
	Scanner sc = new Scanner(System.in);
	void create()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/work","root","Pass@123");
			PreparedStatement ps = con.prepareStatement("insert into workers values(?,?,?,?,?)");
			System.out.print("Enter the id");
			int id = sc.nextInt();
			
			System.out.print("Enter the name");
			String name = sc.next();
			
			System.out.print("Enter the age");
			int age = sc.nextInt();
			
			System.out.print("Enter the salary");
			int salary =sc.nextInt();
			
			System.out.print("Enter the desig");
			String desig = sc.next();
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, age);
			ps.setInt(4, salary);
			ps.setString(5, desig);
			ps.execute();
			
			
		}
		catch(Exception e)
		{
			
		}
		
	}
	
}
public class EmployeeClass extends Work {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		do
		{
			System.out.println("Enter the choice\n1 to create the profile\n"
					+ "2 for display\n" + "3 for update the data\n4 to exit");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			if(choice == 1)
			{
				
				Work w = new Work();
				w.create();
				System.out.println("Profile  created");
				
				
			}
			else if(choice == 2)
			{
				System.out.println("Enter the desig you want to display about");
				System.out.println("1 for Tester");
				System.out.println("2 for developer");
				System.out.println("3 for Manager");
			}
			else {
				System.out.println("End of program");
				break;
			}
			sc.close();
			
		}
		while(true);
		
		
	}

}
