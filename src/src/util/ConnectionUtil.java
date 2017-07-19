package util;
import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

import com.mysql.cj.jdbc.PreparedStatement;
	 
	public class ConnectionUtil {
	 
	    public static void main(String[] args) throws ClassNotFoundException, SQLException {
	 Connection conn=getConnection();
	        System.out.println(conn);
	 
	    }

		public static Connection getConnection() throws SQLException, ClassNotFoundException {
			// TODO Auto-generated method stub
			 Class.forName("com.mysql.jdbc.Driver");
		        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college2", "root", "root");
		       
			return conn;
		}

		

		
		

	}

