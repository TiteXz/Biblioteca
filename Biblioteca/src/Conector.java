import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {

	private static final String HOST = "localhost";
	private static final String BBDD = "biblioteca";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";

	protected static Connection con;
	
	public void conectar() throws ClassNotFoundException {
		try{

		Class.forName("com.mysql.cj.jdbc.Driver");
		this.con = DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + BBDD, USERNAME, PASSWORD);

			
		}catch(
			SQLException e){
			e.printStackTrace();
		}
		
	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public void cerrar() throws SQLException {
		con.close();
	}

	
}


