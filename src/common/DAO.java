package common;

import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DAO {
	static Connection conn;

	public static Connection getConnection() {

		Properties prop = new Properties();
		String path = DAO.class.getResource("com.yedam.config.database.properties").getPath();
		try {
			path = URLDecoder.decode(path, "UTF-8");
			prop.load(new FileReader(path));
		} catch (IOException e) {
			e.printStackTrace();
		}

		String user = prop.getProperty("user");
		String passwd = prop.getProperty("passwd");
		String url = prop.getProperty("url");
		String driver = prop.getProperty("driver");

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, passwd);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		System.out.println("success!!");

		return conn;

	}
}
