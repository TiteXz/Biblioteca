package eh_garden;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GestorArboles {
	private static final String HOST = "localhost";
	private static final String BBDD = "gh_garden";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";

	public static void main(String[] args) {

		try {

			// System.out.println("introduce un nombre de animal");
			// String nombreAnimal = sc.nextLine();

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + BBDD, USERNAME, PASSWORD);

			// declaracion de constantes (final) para las opciones
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
					insertarArbol();
					break;
				case ELIMINAR_ARBOL:
					eliminarArbol();
					break;
				case MODI_ARBOL:
					updateArbol();
					break;
				case VISU_ARBOL:
					visualizarArbol();
					break;
				case SALIR:
					System.out.println("ADIOS");
					break;
				default:
					System.out.println("Opcion incorrecta!");
				}

			} while (opcion_menu != SALIR);
			scan.close();

			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}


	}

	private static void insertarArbol() {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + BBDD, USERNAME, PASSWORD);
			PreparedStatement Pst = con.prepareStatement("INSERT INTO arboles VALUES (null,?,?,?,?,?)");
			Arbol arbol = new Arbol();
			Scanner sc = new Scanner(System.in);
			
			
			System.out.println("introduce el nombre común del arbol");
			arbol.setNombreComun( sc.nextLine());
			Pst.setString(1, arbol.getNombreComun());
			System.out.println("introduce el nombre científico del arbol");
			arbol.setNombreCientifico( sc.nextLine());
			Pst.setString(2, arbol.getNombreCientifico());
			System.out.println("introduce el habitat del arbol");
			arbol.setHabitat( sc.nextLine());
			Pst.setString(3, arbol.getHabitat());
			System.out.println("introduce la altura en metros del arbol");
			arbol.setAltura( Integer.parseInt(sc.nextLine()));
			Pst.setInt(4, arbol.getAltura());
			System.out.println("introduce el origen del arbol");
			arbol.setOrigen( sc.nextLine());
			Pst.setString(5, arbol.getOrigen());

			Pst.execute();
			sc.close();

			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void eliminarArbol() {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + BBDD, USERNAME, PASSWORD);
			PreparedStatement Pst = con.prepareStatement("DELETE FROM arboles WHERE id = ?");
			Scanner sc = new Scanner(System.in);

			System.out.println("introduce el id del arbol que quieras eliminar");
			int id = Integer.parseInt(sc.nextLine());
			Pst.setInt(1, id);
			Pst.execute();

			sc.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	private static void updateArbol() {

		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + BBDD, USERNAME, PASSWORD);
			
			PreparedStatement Pst=con.prepareStatement("UPDATE arboles SET nombre_comun= (?),nombre_cientifico= (?),habitat= (?),altura= (?),origen= (?) WHERE id=(?);");
			Arbol arbol = new Arbol();
			Scanner sc = new Scanner(System.in);
			
			System.out.println("introduce el id del arbol que quieras modificar");
			int id = Integer.parseInt(sc.nextLine());
			Pst.setInt(6, id);
			Pst.setInt(6, id);
			Pst.setInt(6, id);
			Pst.setInt(6, id);
			Pst.setInt(6, id);
			
			
			System.out.println("introduce los nuevos datos que quieras darle");
			System.out.println("introduce el nombre común del arbol");
			arbol.setNombreComun(sc.nextLine());
			Pst.setString(1, arbol.getNombreComun());
			
			System.out.println("introduce el nombre científico del arbol");
			arbol.setNombreCientifico(sc.nextLine());
			Pst.setString(2, arbol.getNombreCientifico());
			
			System.out.println("introduce el habitat del arbol");
			arbol.setHabitat(sc.nextLine());
			Pst.setString(3, arbol.getHabitat());
			
			System.out.println("introduce la altura en metros del arbol");
			arbol.setAltura(Integer.parseInt(sc.nextLine()));
			Pst.setInt(4, arbol.getAltura());
		
			System.out.println("introduce el origen del arbol");
			arbol.setOrigen(sc.nextLine());
			Pst.setString(5, arbol.getOrigen());
			
			Pst.executeUpdate();
			
			
			sc.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	private static void visualizarArbol() {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + BBDD, USERNAME, PASSWORD);
			
			PreparedStatement Pst = con.prepareStatement("SELECT * FROM arboles ");

			 ResultSet resultado = Pst.executeQuery();
				 while(resultado.next()) {
				 System.out.println(resultado.getInt(1)+ " - " +resultado.getString(2)+ " - " +resultado.getString(3)+ " - " +resultado.getString(4)+ " - " +resultado.getString(5)+ " - " +resultado.getString(6));
		 }

			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
