package checkmysql;
import java.sql.*;
import java.util.Scanner;


public class InsertQuery {

	static String user="root";
	static String pass="";
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
          String url="jdbc:mysql://localhost:3306/checking";
         //System.out.println("Enter the number of rows to be insert : ");
         //int len=sc.nextInt();
          String fname="";
         String lname="";
          int id=0,age=0;
         // for( int i=1;i<=len;i++)
          //{
          System.out.println("Enter the values for the table : ");
          System.out.println("Enter the first name : ");
          fname=sc.nextLine();
          System.out.println("Enter the last name : ");
          lname=sc.nextLine();
           System.out.println("enter the id : ");
           id =sc.nextInt();
          System.out.println("Enter the age : ");
           age = sc.nextInt();
          //}
          
          String Query="insert into client values(?,?,?,?)";
          
          Class.forName("com.mysql.jdbc.Driver");
          Connection con= DriverManager.getConnection(url, user, pass);
          PreparedStatement st= con.prepareStatement(Query);
          st.setString(1,fname );
          st.setString(2, lname);
          st.setInt(3, id);
          st.setInt(4, age);
          int count = st.executeUpdate();
       
          
        System.out.println(count +" row/s is affected");
          st.close();
          con.close();
          
	}
	

}
