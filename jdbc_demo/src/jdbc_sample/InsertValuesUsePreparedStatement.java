package jdbc_sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertValuesUsePreparedStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con;
		try {
			String q="insert into city values(?,?,?,?,?)";
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","Mani123");
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1,114);
			ps.setString(2,"Beijing");
			ps.setInt(3, 86);
			ps.setString(4,"Beijing Municipality");
			ps.setInt(5,15500);
			int rows = ps.executeUpdate();
			System.out.println("number of rows affected: "+rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
