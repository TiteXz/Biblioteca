import java.sql.SQLException;
import java.util.Scanner;

public class GestorBiblioteca {
	
	
	
	public static void run() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		int opcion_menu;
		


	
		
			Menu.mostrarMenuPrincipal();
			opcion_menu = Integer.parseInt(sc.nextLine());
			
			switch (opcion_menu) {
			case Menu.GESTIONAR_LIBROS:
				GestorLibros.run(sc);
				break;
			case Menu.GESTIONAR_SOCIOS:
				GestorSocios.run(sc);
				break;
			case Menu.GESTIONAR_PRESTAMOS:
				Menu.mostrarMenuPrestamos();
				break;
			default:
				System.out.println("Opcion incorrecta!");
			}
		
		sc.close();
		
	}
}
