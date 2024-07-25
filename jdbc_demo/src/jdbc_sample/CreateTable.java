package jdbc_sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String q="create table city(id int primary key,name varchar(15),countrycode int,district  varchar(15),population int)";
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","Mani123");
			Statement st=con.createStatement();
			int rows = st.executeUpdate(q);
			System.out.println("number of rows affected: "+rows);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
