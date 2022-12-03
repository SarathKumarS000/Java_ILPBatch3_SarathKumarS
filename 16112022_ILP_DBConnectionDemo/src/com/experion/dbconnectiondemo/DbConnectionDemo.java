package com.experion.dbconnectiondemo;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbConnectionDemo {

	public static void main(String[] args) {


		try {
			String connectionString = "jdbc:mysql://localhost:3306/bankemp_db";
			String userName = "root";
			String password = "mysql@123";
			Connection connection = DriverManager.getConnection(connectionString, userName, password);
			Statement statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery("select * from employee where employeeid = 2");
			while(resultSet.next())
				System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2));
			connection.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
