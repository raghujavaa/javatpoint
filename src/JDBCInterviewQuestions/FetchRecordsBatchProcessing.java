//Example of batch processing in jdbc

package JDBCInterviewQuestions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class FetchRecordsBatchProcessing {
	public static void main(String args[]) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
		con.setAutoCommit(false);

		Statement stmt = con.createStatement();
		stmt.addBatch("insert into user420 values(190,'abhi',40000)");
		stmt.addBatch("insert into user420 values(191,'umesh',50000)");

		stmt.executeBatch();// executing the batch

		con.commit();
		con.close();
	}
}
/*
 * Let's see the simple example of batch processing in jdbc. It follows following steps:

 Load the driver class
 Create Connection
 Create Statement
 Add query in the batch
 Execute Batch
 Close Connection
 */