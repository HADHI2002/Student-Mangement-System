package studentMangementSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentData {
	Connection con;
	
	public StudentData() {
		// TODO Auto-generated constructor stub
		con=CreateConnection.getconnection();
	}
	
	public void addStudent(String Name,int age,String grade) throws SQLException {
		String query="INSERT INTO students(Name,age,grade) VALUES(?,?,?) ";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, Name);
		ps.setInt(2, age);
		ps.setString(3, grade);
		ps.executeUpdate();
		System.out.println("Data inserted Successfully");
	}
	
	public void updateStudent(int id,String grade) throws SQLException {
		String query="UPDATE students SET grade=? WHERE id=? ";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, grade);
		ps.setInt(2, id);
		ps.executeUpdate();
		System.out.println("Data inserted Successfully");
	}
	
	public void displayStudents() throws SQLException{
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("SELECT* FROM Students");
		
		while(rs.next()){
			System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | " + rs.getInt("age") + " | " + rs.getString("grade"));
		}
	}
	
	public void deleteStudent(int id) throws SQLException {
        String query = "DELETE FROM students WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
        System.out.println("🗑️ Student Deleted Successfully!");
    }
}
