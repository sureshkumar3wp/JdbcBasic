package checkmysql;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class createtable {

	static String user ="root";
	static String pass ="";
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/checking";
		String Query="CREATE table if not exists client(cfname varchar(50),clname varchar(100),cid int,cage int)";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, pass);
		PreparedStatement st= con.prepareStatement(Query);
		
		st.executeUpdate();
		System.out.println("Table created...");
		
		st.close();
		con.close();
		
	

	}

}
