package n19April;
import java.sql.*;
import java.util.Scanner;
public class Batchdata {
	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Pass@123");
			Statement st = con.createStatement();
			//st.execute("insert into employee values(9,'Abhishek',23,34000,'Tester')");
			st.addBatch("insert into employee values(10,'Anil',35,34000,'Tester')");
			st.addBatch("insert into employee values(11,'Rishu',23,43000,'Dev')");
			st.addBatch("insert into employee values(11,'Rishu',23,43000,Dev)");
			st.executeBatch();
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}
