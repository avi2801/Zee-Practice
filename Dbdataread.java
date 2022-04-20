package n19April;
import java.sql.*;
import java.util.*;
public class Dbdataread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Pass@123");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from employee");
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
