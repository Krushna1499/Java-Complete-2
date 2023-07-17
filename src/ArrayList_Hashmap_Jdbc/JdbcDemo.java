package ArrayList_Hashmap_Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;


public class JdbcDemo {

	public static void main(String[] args) throws SQLException{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db2","root","123456");
		
		Statement stmt =con.createStatement();
		String s="insert into Stu values(103,'hamu')";
		
		ResultSet rs=stmt.executeQuery(s);
		while(rs.next())
		{
			int sid =rs.getInt("Sid");
			String sname=rs.getString("Sname");
			System.out.println(sid+" "+sname);
		}
		
		//stmt.execute(s);
		con.close();
		System.out.println("QUERY EXECUTED...");
		
		

	}

}
