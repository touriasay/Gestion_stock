package application;
import java.sql.*;

public class ConnexionMysql {
	public Connection conn=null;
	public static Connection connexionDB() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestock","root","");
			System.out.println("connexion r�ussie");
			return conn;
			
			
		}catch(ClassNotFoundException | SQLException e) {
			System.out.println("connexion echouee");
			e.printStackTrace();
			return null;
		}


	}
}
