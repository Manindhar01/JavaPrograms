package jdbc_sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","Mani123");
			Statement st = con.createStatement();
			int row = st.executeUpdate("create database hi");
			System.out.println("number of rows affected: "+row);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
