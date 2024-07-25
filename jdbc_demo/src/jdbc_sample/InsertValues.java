package jdbc_sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String q="insert into city values(111,'orathanadu',91,'thanjavur',32000)";
			String q1="insert into city values(112,'new york',1,'manhattan',21000)";
			String q2="insert into city values(113,'moscow',7,'moscow',40000)";
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","Mani123");
			Statement st=con.createStatement();
			int rows = st.executeUpdate(q2);
			System.out.println("number of rows affected: "+rows);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
