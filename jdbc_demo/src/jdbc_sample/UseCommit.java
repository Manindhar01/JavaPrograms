package jdbc_sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UseCommit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String q="update city set population=42000 where district='thanjavur'";
			String q1="update city set population=32000 where district='manhattan'";
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","Mani123");
			con.setAutoCommit(false);
			Statement st = con.createStatement();
			int row = st.executeUpdate(q);
			int row1 = st.executeUpdate(q1);
			System.out.println("no of rows affected: "+row);
			System.out.println("no of rows affected: "+row1);
			
			if(row>0&&row1>0) {
				con.commit();
			}
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
