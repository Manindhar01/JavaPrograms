package jdbc_sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UseSelectStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String query="select * from city";
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","Mani123");
			Statement st=con.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
			System.out.println("id: "+rs.getInt(1));
			System.out.println("name: "+rs.getString(2));
			System.out.println("country code: "+rs.getInt(3));
			System.out.println("district: "+rs.getString(4));
			System.out.println("population: "+rs.getInt(5));
			System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
