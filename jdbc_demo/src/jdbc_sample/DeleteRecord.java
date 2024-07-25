package jdbc_sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String q="delete from city where id=114";
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","Mani123");
			Statement st=con.createStatement();
			int row = st.executeUpdate(q);
			System.out.println("number of rows affected: "+row);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
