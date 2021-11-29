package pac.TestYantra_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.cj.jdbc.Driver;

public class Demo_Insert_SQL_JDBC {
	
	public static void main(String[] args) throws SQLException {
		
		//Step 1: Register / load MySQL DataBase (import com.mysql.jdbc.Driver;)
		Driver driverref = new Driver();
		DriverManager.registerDriver(driverref);
		
		//Step 2: Connect to MySQL DataBase
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root","root");
		
		//Step 3: Create SQL statement
		Statement stat =con.createStatement();
		String query = "insert into students_info (regno, firstname, middlename, lastname) values('15', 'sam','dev', 'kannur');";
		
		//Step 4: Execute Statement/Query
		int rs = stat.executeUpdate(query);
		if(rs==1) {
			System.out.println("user is created");
		}
			else {
				System.out.println("user is not created");
			}
		//Step 5: Close the established connection
		con.close();
	}

}
