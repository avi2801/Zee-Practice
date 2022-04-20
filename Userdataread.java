package n19April;
import java.sql.*;
import java.util.*;

public class Userdataread {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Pass@123");
			Statement stmt = con.createStatement();
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the employee id whose salary you want to know : ");
			int id = sc.nextInt();
			sc.close();
			
			ResultSet rs = stmt.executeQuery("Select salary from employee where id = (?)");
			while(rs.next())
			{
				System.out.println("Id is "+rs.getInt(1)+": name is "+rs.getString(2));
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
