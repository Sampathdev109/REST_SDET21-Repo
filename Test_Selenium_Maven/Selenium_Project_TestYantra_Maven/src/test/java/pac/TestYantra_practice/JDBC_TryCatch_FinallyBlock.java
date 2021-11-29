package pac.TestYantra_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class JDBC_TryCatch_FinallyBlock {
	
	
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		try {
	//Step 1: Register / load MySQL DataBase (import com.mysql.jdbc.Driver;)
	Driver driverref = new Driver();
	DriverManager.registerDriver(driverref);
	
	//Step 2: Connect to MySQL DataBase
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root","root");
	
	//Step 3: Create SQL statement
	Statement stat =con.createStatement();
	String query = "insert into students_info (regno, firstname, middlename, lastname) values('17', 'lam','rev', 'kannur');";
	
	//Step 4: Execute Statement/Query
			int rs = stat.executeUpdate(query);
			if(rs==1) {
				System.out.println("user is created");
			}

		}
		catch(Exception e)
		{
			System.err.println("Data unvailable == Failed");
		}
		
		finally {
			//Step 5: Close the established connection
			con.close();
		}
	
}
}

