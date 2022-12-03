package com.experion.connectionpool;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionPool {

	private static ComboPooledDataSource dataSource;
	static {
		try {
			dataSource = new ComboPooledDataSource ();
			Properties properties = new Properties();
			//Loading properties file
			InputStream inputStream = new FileInputStream("resources/db.properties");
			properties.load(inputStream);
			dataSource.setDriverClass(properties.getProperty("DRIVER_CLASS"));	//loads the jdbc driver
			dataSource.setJdbcUrl(properties.getProperty("CONNECTION_STRING"));
			dataSource.setUser(properties.getProperty("USERNAME"));
			dataSource.setPassword(properties.getProperty("PASSWORD"));
			dataSource.setInitialPoolSize(5);
			dataSource.setMinPoolSize(5);
			dataSource.setAcquireIncrement(5);
			dataSource.setMaxPoolSize(20);
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static DataSource getDataSource() {
		return dataSource;
	}
}
