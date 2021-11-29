package pac.TestYantra_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class TryCatch_JDBC_Banking {

static	Connection con= null;
	public static void main(String[] args) throws SQLException {
		try {
		//Step 1: Register / load MySQL DataBase (import com.mysql.jdbc.Driver;)
		Driver driverref = new Driver();
		DriverManager.registerDriver(driverref);
		
		//Step 2: Connect to MySQL DataBase
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root","root");
		
		//Step 3: Create SQL statement
		Statement stat =con.createStatement();
		String query = "select * from students_info";
		
		//Step 4: Execute Statement/Query
		ResultSet rs = stat.executeQuery(query);
		
		while(rs.next()) {
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
		}}
		catch (Exception e) {
			
			System.err.println("Invalid");
		
		//Step 5: Close the established connection
		con.close();
	}
}
}
