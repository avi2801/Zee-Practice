package n19April;
import java.sql.*;
import java.util.*;
public class Dbinsert {
	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Pass@123");
			//Statement st = con.createStatement();
			//st.execute("insert into employee values(11,'Darshan',30,25000,'Dev')");
			//st.execute("insert into employee values (5,'Amit',25,30000,'Clerk')");
			
			PreparedStatement prestm = con.prepareStatement("insert into employee values(?,?,?,?,?)");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter the id: ");
			int id = sc.nextInt();
			
			System.out.print("Enter the Name: ");
			String name = sc.next();
			
			System.out.print("Enter the age :");
			int age = sc.nextInt();
			
			System.out.print("Enter the salary :");
			int salary = sc.nextInt();
			
			System.out.print("Enter the role : ");
			String desc = sc.next();
			
			sc.close();
			
			
			
			
			prestm.setInt(1, id);
			prestm.setString(2, name);
			prestm.setInt(3, age);
			prestm.setInt(4, salary);
			prestm.setString(5,desc);
			prestm.execute();
			
			con.close();
			System.out.println("Data Inserted");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		
		
	}

}
