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

		// INSERT INTO animales (nombre) VALUES ( 'gato')
		// String sentenciaInsertar = "INSERT INTO animales (nombre) VALUES
		// ('"+nombreAnimal+"')";
		// st.execute(sentenciaInsertar);

		// UPDATE animales SET nombre='aaaa' WHERE id 2
		// String sentenciaUpdate = "UPDATE animales SET nombre='elefante' WHERE id =
		// 2";
		// st.executeUpdate("sentenciaUpdate");

		// DELETE FROM animales WHERE nombre = 'aaaa'
		// String sentenciaDelete = "DELETE FROM animales WHERE nombre =
		// '"+nombreAnimal+"'";
		// st.execute(sentenciaDelete);

		// SELECT * FROM animales
		// SELECT * FROM animales WHERE AAAA=AAAA
		// String sentenciaSelect = "SELECT * FROM animales";
		// ResultSet resultado = st.executeQuery(sentenciaSelect);
		// while(resultado.next()) {
		// System.out.println(resultado.getInt(1)+ " - " +resultado.getString(2));

	}

	private static void insertarArbol() {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + BBDD, USERNAME, PASSWORD);
			Statement st = con.createStatement();
			Scanner sc = new Scanner(System.in);
			
			String nombre_comun;
			String nombre_cientifico;
			String habitat;
			int altura;
			String origen;
			
			System.out.println("introduce el nombre común del arbol");
			nombre_comun = sc.nextLine();
			System.out.println("introduce el nombre científico del arbol");
			nombre_cientifico = sc.nextLine();
			System.out.println("introduce el habitat del arbol");
			habitat = sc.nextLine();
			System.out.println("introduce la altura en metros del arbol");
			altura = Integer.parseInt(sc.nextLine());
			System.out.println("introduce el origen del arbol");
			origen = sc.nextLine();

			String sentenciaInsertar = "INSERT INTO arboles (nombre_comun, nombre_cientifico, habitat, altura, origen) VALUES ('"
					+ nombre_comun + "','" + nombre_cientifico + "','" + habitat + "','" + altura + "','" + origen
					+ "')";
			st.execute(sentenciaInsertar);

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
			Statement st = con.createStatement();
			Scanner sc = new Scanner(System.in);

			System.out.println("introduce el id del arbol que quieras eliminar");
			int id = Integer.parseInt(sc.nextLine());

			
			String sentenciaDelete = "DELETE FROM arboles WHERE id = ('"+id+"')";
			st.execute(sentenciaDelete);

			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	private static void updateArbol() {

		try {
			
			// UPDATE animales SET nombre='aaaa' WHERE id 2
			// String sentenciaUpdate = "UPDATE animales SET nombre='elefante' WHERE id =
			// 2";
			// st.executeUpdate("sentenciaUpdate");

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + BBDD, USERNAME, PASSWORD);
			
			Statement st = con.createStatement();
			Scanner sc = new Scanner(System.in);

			System.out.println("introduce el id del arbol que quieras modificar");
			int id = Integer.parseInt(sc.nextLine());
			System.out.println("introduce los nuevos datos que quieras darle");
			System.out.println("introduce el nombre común del arbol");
			String nombre_comun = sc.nextLine();
			System.out.println("introduce el nombre científico del arbol");
			String nombre_cientifico = sc.nextLine();
			System.out.println("introduce el habitat del arbol");
			String habitat = sc.nextLine();
			System.out.println("introduce la altura en metros del arbol");
			int altura = Integer.parseInt(sc.nextLine());
			System.out.println("introduce el origen del arbol");
			String origen = sc.nextLine();

		    String sentenciaUpdate ="UPDATE arboles SET nombre_comun='"+nombre_comun+"' WHERE id ="+id+"";
		    st.executeUpdate(sentenciaUpdate);
		    String sentenciaUpdate2 ="UPDATE arboles SET nombre_cientifico='"+nombre_cientifico+"' WHERE id ="+id+"";
		    st.executeUpdate(sentenciaUpdate2);
		    String sentenciaUpdate3 ="UPDATE arboles SET habitat='"+habitat+"'WHERE id ="+id+"";
		    st.executeUpdate(sentenciaUpdate3);
		    String sentenciaUpdate4 ="UPDATE arboles SET altura='"+altura+"' WHERE id ="+id+"";
		    st.executeUpdate(sentenciaUpdate4);
		    String sentenciaUpdate5 ="UPDATE arboles SET origen='"+origen+"' WHERE id ="+id+"";
		    st.executeUpdate(sentenciaUpdate5);

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
			
			Statement st = con.createStatement();
			Scanner sc = new Scanner(System.in);

			
			 String sentenciaVisualizar =  "SELECT * FROM arboles ";
			 ResultSet resultado = st.executeQuery(sentenciaVisualizar);
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
