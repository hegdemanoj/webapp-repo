package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDb {
	String dbURL = "jdbc:mysql://localhost:3306/aweshopdb";
	String username = "root";
	String password = "root";
	Connection dbCon = null;

	public Connection connectDatabase() {
		try {
			// getting database connection to MySQL server
			dbCon = DriverManager.getConnection(dbURL, username, password);
		} catch (SQLException ex) {
			System.out.println("Database Exception Occured");
		}
		return dbCon;
	}
}
