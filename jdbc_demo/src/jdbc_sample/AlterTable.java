package jdbc_sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AlterTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String q="alter table city modify district varchar(20)";
			String q1="alter table city add lastupdated date after district";
			String q2="alter table city drop lastupdated";
			String q3="alter table city change column cname name varchar(14)";
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root", "Mani123");
			Statement st=con.createStatement();
			int rows = st.executeUpdate(q3);
			System.out.println("number of rows affected: "+rows);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
