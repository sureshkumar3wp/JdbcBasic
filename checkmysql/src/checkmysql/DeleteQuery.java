package checkmysql;
import java.sql.*;
import java.util.Scanner;

public class DeleteQuery {

	static String user="root";
	static String pass="";
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    Scanner sc= new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/checking";
    System.out.println("Enter the id of the employee to delete : ");
    int id=sc.nextInt();
    String Query="Delete from client where cid =?";
    
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection(url, user, pass);
    PreparedStatement st= con.prepareStatement(Query);
    st.setInt(1, id);
    int n=st.executeUpdate();
    System.out.println(n+" row/s is affected.");
    st.close();
    con.close();
    
    
		
	}

}
