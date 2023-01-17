package principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
	private static final String HOST = "localhost";
	private static final String BBDD = "2dser_1ebal_exa";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.println("introduce un nombre de animal");
			String nombreAnimal = sc.nextLine();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://"+HOST+"/"+BBDD, USERNAME, PASSWORD);
			Statement st = con.createStatement();
			
			//	INSERT INTO animales (nombre) VALUES ( 'gato')
			String sentenciaInsertar = "INSERT INTO animales (nombre) VALUES ('"+nombreAnimal+"')";
			st.execute(sentenciaInsertar);
			
			//UPDATE animales SET nombre='aaaa' WHERE id 2
			String sentenciaUpdate = "UPDATE animales SET nombre='elefante' WHERE id = 2";
			st.executeUpdate("sentenciaUpdate");
			
			//DELETE FROM animales WHERE nombre = 'aaaa'
			String sentenciaDelete = "DELETE FROM animales WHERE nombre = '"+nombreAnimal+"'";
			st.execute(sentenciaDelete);
			
			
			//SELECT * FROM animales
			//SELECT * FROM animales WHERE AAAA=AAAA
			String sentenciaSelect = "SELECT * FROM animales";
			ResultSet resultado = st.executeQuery(sentenciaSelect);
			while(resultado.next()) {
				System.out.println(resultado.getInt(1)+ " - " +resultado.getString(2));
			}
			
			
			
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	
	}
}
