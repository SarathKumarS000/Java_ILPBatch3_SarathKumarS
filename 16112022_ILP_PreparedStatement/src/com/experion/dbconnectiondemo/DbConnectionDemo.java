package com.experion.dbconnectiondemo;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DbConnectionDemo {

	public static void main(String[] args) {

		Scanner scanner= new Scanner(System.in);
		System.out.println("enter id:");  
		int id= scanner.nextInt();  

		try {
			String connectionString = "jdbc:mysql://localhost:3306/bankemp_db";
			String userName = "root";
			String password = "mysql@123";
			Connection connection = DriverManager.getConnection(connectionString, userName, password);
//			Statement statement = connection.createStatement();
			PreparedStatement statement=connection.prepareStatement("select * from employee where employeename=?");  
			statement.setInt(1,id);
			ResultSet resultSet=statement.executeQuery();  
			while(resultSet.next())
				System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2));
			connection.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
