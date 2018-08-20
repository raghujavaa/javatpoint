//Example of DatabaseMetaData interface that prints total number of views :
package JDBCInterviewQuestions;

public class Dbmd3 {
	public static void main(String args[]){  
		try{  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		  
		Connection con=DriverManager.getConnection(  
		"jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
		  
		DatabaseMetaData dbmd=con.getMetaData();  
		String table[]={"VIEW"};  
		ResultSet rs=dbmd.getTables(null,null,null,table);  
		  
		while(rs.next()){  
		System.out.println(rs.getString(3));  
		}  
		  
		con.close();  
		  
		}catch(Exception e){ System.out.println(e);}  
		  
		}  
}
