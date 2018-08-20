//Java Example to store image in the database
package JDBCInterviewQuestions;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertImage {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");

			PreparedStatement ps = con
					.prepareStatement("insert into imgtable values(?,?)");
			ps.setString(1, "sonoo");

			FileInputStream fin = new FileInputStream("d:\\g.jpg");
			ps.setBinaryStream(2, fin, fin.available());
			int i = ps.executeUpdate();
			System.out.println(i + " records affected");

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
// For storing image into the database, BLOB (Binary Large Object) datatype is used in the table. For example:
/*
 * CREATE TABLE  "IMGTABLE"   
   (    "NAME" VARCHAR2(4000),   
    "PHOTO" BLOB  
   )  
/  
 */
*/