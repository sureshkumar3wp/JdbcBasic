package checkmysql;
import java.sql.*;
import java.util.Scanner;

public class UpdateQuery {

	static String user="root";
	static String pass="";
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/checking";
          String Query="update client set cfname=?,clname=?,cage=? where cid=?";
        
          int id=40039567;
          String fname="rocky";
          String lname ="man";
          int age=55;
          
          Class.forName("com.mysql.jdbc.Driver");
          Connection con= DriverManager.getConnection(url, user, pass);
          PreparedStatement st=con.prepareStatement(Query);
          
          st.setString(1, fname);
          st.setString(2, lname);
          st.setInt(3, age);
          st.setInt(4, id);
          
          int count =st.executeUpdate();
          System.out.println(count+" row/s affected..");
          
	}

}
