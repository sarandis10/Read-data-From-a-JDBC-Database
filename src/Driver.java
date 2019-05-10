import java.sql.*;
public class Driver {

	public static void main(String[] args) {

		try {
		// 1. get a connection to database
			
Connection myConnection= DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "sarandis10");

			
		// 2. create a statement
Statement myStatement= myConnection.createStatement();

		// 3. Execute SQL query

ResultSet myResult=myStatement.executeQuery("select * from Employees");
		// 4. Process the result set

while(myResult.next()) {
	System.out.println(myResult.getString("last_name")+ "," + myResult.getString("first_name")+ ","+ myResult.getString("email")+ "," + myResult.getString("salary") );
}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
