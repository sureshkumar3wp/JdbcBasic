package checkmysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import com.mysql.jdbc.Driver;

public class newconnection {
	static String user ="root";
	static String pass="";

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/checking";
		
		String query="select * from client";
		
		System.out.println("Before driver....");
//		Class.forName(Driver.class.getPackageName());
		DriverManager.registerDriver(new Driver());
		Connection con = DriverManager.getConnection(url, user, pass);
		Statement st=con.createStatement();
		
		ResultSet rs= st.executeQuery(query);
		while(rs.next())
		{
			String fname= rs.getString("cfname");
			String lname=rs.getString("clname");
			int id=rs.getInt("cid");
			int age=rs.getInt("cage");
			
			System.out.println("first name : "+fname);
			System.out.println("last name : "+lname);
			System.out.println("ID : "+id);
			System.out.println("Age : "+age);
			System.out.println("---------End of then current record-------");
		}
		rs.close();
		st.close();
		con.close();
		System.out.println("Work done.............");
		

	}

}
