import java.sql.SQLException;
import java.util.Scanner;

public class GestorLibros {

	public void run() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		int opcion_menu;
		GestorBBDD gBD = new GestorBBDD();
		Libro libro = new Libro();
		
		
		Menu.mostrarMenuLibros();
		opcion_menu = Integer.parseInt(sc.nextLine());
		
		do {
		switch (opcion_menu) {
		case Menu.INSERTAR_LIBRO:
			gBD.insertarLibros(libro);
			System.out.println("Has insertado un libro");
			break;
		case Menu.ELIMINAR_LIBRO:
			gBD.eliminarLibro(FormularioDeDatos.pedirIdLibro(sc));
			System.out.println("Has eliminado un libro");
			break;
		case Menu.MODIFICAR_LIBRO:
			FormularioDeDatos.modificarDatosLibro(libro, sc);
			System.out.println("Has modificado el libro");
			break;
		case Menu.MOSTRAR_LIBRO:
			gBD.getLibro(FormularioDeDatos.pedirIdLibro(sc));
			break;
		default:
			System.out.println("Opcion incorrecta!");
			}
		
		}while (opcion_menu != Menu.SALIR);
		sc.close();
	
	}
}
