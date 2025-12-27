package studentMangementSystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class CreateConnection {
	static String url="jdbc:mysql://localhost:3306/SMS";
	static String user="root";
	static String password="Hadhi@123";
	
	
	public static Connection getconnection(){
		
		Connection con=null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,user,password);
			System.out.println("Databse Connected");
		}catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}
}
