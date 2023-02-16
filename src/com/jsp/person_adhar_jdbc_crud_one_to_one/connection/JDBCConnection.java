package com.jsp.person_adhar_jdbc_crud_one_to_one.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {

	public static Connection getJdbcConnection() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/person-adhar-jdbc";
			String user = "root";
			String pass = "root";
			
			Connection connection = DriverManager.getConnection(url, user, pass);
			
			return connection;
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
