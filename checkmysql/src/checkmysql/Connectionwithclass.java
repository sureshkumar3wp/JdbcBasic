package checkmysql;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class Connectionwithclass {

	static String user="root";
	static String pass="";
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        String url="jdbc:mysql://localhost:3306/checking";
        
        String query="select id from employee where age = 21;";
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);
        
        while(rs.next())
        {
           int id= rs.getInt("id");
           System.out.println("The retrived id is : " +id);
           
           
        }
        rs.close();
        st.close();
        con.close();
        
		
	}

}
