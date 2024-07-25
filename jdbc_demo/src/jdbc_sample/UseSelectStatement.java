package jdbc_sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class UseSelectStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String query="select* from city";
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","Mani123");
			Statement st=con.createStatement();
			ResultSet rs = st.executeQuery(query);
			ResultSetMetaData md = rs.getMetaData();
			for(int i=1;i<=5;i++) {
			//	System.out.print(md.getColumnName(i)+" ");
			}
			System.out.println();
			while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getInt(5));
			System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
