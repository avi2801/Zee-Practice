package n19April;
import java.sql.*;
import java.util.*;
public class TwethApril {
	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Pass@123");
			//Statement st = con.createStatement();
			//st.execute("insert into employee values(11,'Darshan',30,25000,'Dev')");
			//st.execute("insert into employee values (5,'Amit',25,30000,'Clerk')");
			
			PreparedStatement prestm =  con.prepareStatement("delete from employee where id=(?)");
			//PreparedStatement prestm = con.prepareStatement("insert into employee values(?,?,?,?,?)");
			System.out.print("Enter the id: ");
			Scanner sc = new Scanner(System.in);
			int id = sc.nextInt();
			prestm.setInt(1,id);
			prestm.execute();
			con.close();
			sc.close();
			
			System.out.println("Data Deleted");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		
		
	}

}
