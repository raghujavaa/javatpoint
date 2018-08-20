//Example of PreparedStatement interface that inserts the record

package JDBCInterviewQuestions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertPrepared {
	public static void main(String args[]) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");

			PreparedStatement stmt = con
					.prepareStatement("insert into Emp values(?,?)");
			stmt.setInt(1, 101);// 1 specifies the first parameter in the query
			stmt.setString(2, "Ratan");

			int i = stmt.executeUpdate();
			System.out.println(i + " records inserted");

			// Example of PreparedStatement interface that updates the record
			/*
			 * PreparedStatement
			 * stmt=con.prepareStatement("update emp set name=? where id=?");
			 * stmt.setString(1,"Sonoo");//1 specifies the first parameter in
			 * the query i.e. name stmt.setInt(2,101);
			 * 
			 * int i=stmt.executeUpdate();
			 * System.out.println(i+" records updated");
			 */

			// Example of PreparedStatement interface that deletes the record
			/*
			 * PreparedStatement
			 * stmt=con.prepareStatement("delete from emp where id=?");
			 * stmt.setInt(1,101);
			 * 
			 * int i=stmt.executeUpdate();
			 * System.out.println(i+" records deleted");
			 */

			// Example of PreparedStatement interface that retrieve the records
			// of a table
			/*
			 * PreparedStatement stmt=con.prepareStatement("select * from emp");
			 * ResultSet rs=stmt.executeQuery(); while(rs.next()){
			 * System.out.println(rs.getInt(1)+" "+rs.getString(2)); }
			 */

			// connection close:
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
