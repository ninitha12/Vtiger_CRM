package genericutilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DataBaseUtility {

	Connection conn=null;
	ResultSet result=null;
	public void connectToDB() throws SQLException {
		//register the db
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		//get connection for database
		conn=DriverManager.getConnection(IpathConstants.dbURL,IpathConstants.Dbusername,IpathConstants.Dbpassword);
		
		
	}
	/**
	 * this method is used to execute query
	 * @param query
	 * @return
	 * @throws SQLException
	 */
	//method for executing query
	public ResultSet executeQuery(String query) throws SQLException
	{
		//create Statement
		Statement state=conn.createStatement();
		result=state.executeQuery(query);
		///execute query
		return result;
		
		
		
	}
	/**
	 * this method is used to update query
	 * @param query
	 * @return
	 * @throws SQLException
	 */
	//method for updatequery
	public int updateQuery(String query) throws SQLException
	{
		//create Statement
		Statement state=conn.createStatement();
	int res=state.executeUpdate(query);
	return res;
	
	}
	/**
	 * this method is used to disconnect the db
	 * @throws SQLException
	 */
	//disconnect db
	public void disconnectDB() throws SQLException
	{
		conn.close();

	}

}

