import java.sql.SQLException;
import java.util.Scanner;

public class GestorLibros {

	public static void run(Scanner sc) throws ClassNotFoundException, SQLException {
		int opcion_menu=0;
		GestorBBDD gBD = new GestorBBDD();
		Libro libro = new Libro();
		
		

		
		
	do {
		Menu.mostrarMenuLibros();
		opcion_menu = Integer.parseInt(sc.nextLine());
		switch (opcion_menu) {
		case Menu.INSERTAR_LIBRO:
			gBD.conectar();
			gBD.insertarLibros(FormularioDeDatos.pedirDatosLibro(sc));
			gBD.cerrar();
			System.out.println("Has insertado un libro");
			break;
		case Menu.ELIMINAR_LIBRO:
			gBD.conectar();
			gBD.eliminarLibro(FormularioDeDatos.pedirIdLibro(sc));
			gBD.cerrar();
			System.out.println("Has eliminado un libro");
			break;
		case Menu.MODIFICAR_LIBRO:
			gBD.conectar();
			FormularioDeDatos.modificarDatosLibro(libro, sc);
			gBD.cerrar();
			System.out.println("Has modificado el libro");
			break;
		case Menu.MOSTRAR_LIBROS:
			gBD.conectar();
			Visor.mostrarLibros(gBD.getLibros());;
			gBD.cerrar();
			break;
		default:
			System.out.println("Opcion incorrecta!");
			}
		
		}while(opcion_menu !=0);
		sc.close();
	
	}
}
