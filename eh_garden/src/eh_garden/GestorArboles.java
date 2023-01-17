package eh_garden;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GestorArboles {
	private static final String HOST = "localhost";
	private static final String BBDD = "gh_garden";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		try {
			
			//System.out.println("introduce un nombre de animal");
			//String nombreAnimal = sc.nextLine();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://"+HOST+"/"+BBDD, USERNAME, PASSWORD);
			Statement st = con.createStatement();
			
			
			//declaracion de constantes (final) para las opciones
			final int INSER_ARBOL = 1;
			final int ELIMINAR_ARBOL = 2;
			final int MODI_ARBOL = 3;
			final int VISU_ARBOL = 4;
			final int SALIR = 0;

			Scanner scan = new Scanner(System.in);
			int opcion_menu;

			do {
				System.out.println("------MENU-------");
				System.out.println(INSER_ARBOL + ". insertar arbol");
				System.out.println(ELIMINAR_ARBOL + ". eliminar arbol");
				System.out.println(MODI_ARBOL + ". modificar informacion del arbol");
				System.out.println(VISU_ARBOL + ". visualizar arboles");
				System.out.println(SALIR + ". Salir");
				System.out.println("Elije una de las opciones");
				opcion_menu = Integer.parseInt(scan.nextLine());

				switch (opcion_menu) {
				case INSER_ARBOL:
					System.out.println("introduce el nombre del arbol");
					//String nombreAnimal = sc.nextLine();
					String nomArbolComun = sc.nextLine();
					
//					//INSERT INTO animales (nombre) VALUES ( 'gato')
					String sentenciaInsertar = "INSERT INTO arboles (nombreComun) VALUES ('"+nomArbolComun+"')";
					st.execute(sentenciaInsertar);
					break;
				case ELIMINAR_ARBOL:
					System.out.println("Introduce nombreComun del arbol que desees eliminar");
					//String nombreAnimal = sc.nextLine();
					nomArbolComun = sc.nextLine();
					
					//DELETE FROM animales WHERE nombre = 'aaaa'
					String sentenciaDelete = "DELETE FROM arboles WHERE nombre = '"+nomArbolComun+"'";
					st.execute(sentenciaDelete);
					break;
				case MODI_ARBOL:
					System.out.println("tercera opcion seleccionada\n");
					break;
				case SALIR:
					System.out.println("ADIOS");
					break;
				default:
					System.out.println("Opcion incorrecta!");
				}

			} while (opcion_menu != SALIR);
			scan.close();
			
		}
		
		
		
		con.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	}
		
			//	INSERT INTO animales (nombre) VALUES ( 'gato')
			//String sentenciaInsertar = "INSERT INTO animales (nombre) VALUES ('"+nombreAnimal+"')";
			//st.execute(sentenciaInsertar);
			
			//UPDATE animales SET nombre='aaaa' WHERE id 2
			//String sentenciaUpdate = "UPDATE animales SET nombre='elefante' WHERE id = 2";
			//st.executeUpdate("sentenciaUpdate");
			
			//DELETE FROM animales WHERE nombre = 'aaaa'
			//String sentenciaDelete = "DELETE FROM animales WHERE nombre = '"+nombreAnimal+"'";
			//st.execute(sentenciaDelete);
			
			
			//SELECT * FROM animales
			//SELECT * FROM animales WHERE AAAA=AAAA
			//String sentenciaSelect = "SELECT * FROM animales";
			//ResultSet resultado = st.executeQuery(sentenciaSelect);
			//while(resultado.next()) {
			//	System.out.println(resultado.getInt(1)+ " - " +resultado.getString(2));
			
	
	}
}
