package n19April;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateData {
	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Pass@123");
			//Statement st = con.createStatement();
			//st.execute("insert into employee values(11,'Darshan',30,25000,'Dev')");
			//st.execute("insert into employee values (5,'Amit',25,30000,'Clerk')");
			
			PreparedStatement prestm =  con.prepareStatement("update  employee set name = (?) where id=(?)");
			//PreparedStatement prestm = con.prepareStatement("insert into employee values(?,?,?,?,?)");
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the names: ");
			String name = sc.next();
			prestm.setString(1,name);
			System.out.print("Enter the id: ");
			int id = sc.nextInt();
			prestm.setInt(2,id);
			prestm.executeUpdate();
			con.close();
			sc.close();
			
			System.out.println("Data Deleted");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}
