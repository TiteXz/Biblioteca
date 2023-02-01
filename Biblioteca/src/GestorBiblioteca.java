import java.util.Scanner;

public class GestorBiblioteca {
	
	
	
	public static void run() {
		Scanner sc = new Scanner(System.in);
		int opcion_menu;

		Menu.mostrarMenuPrincipal();
		opcion_menu = Integer.parseInt(sc.nextLine());
	
		do {
			switch (opcion_menu) {
			case Menu.GESTIONAR_LIBROS:
				Menu.mostrarMenuLibros();
				break;
			case Menu.GESTIONAR_SOCIOS:
				Menu.mostrarMenuSocios();
				break;
			case Menu.GESTIONAR_PRESTAMOS:
				Menu.mostrarMenuPrestamos();
				break;
			default:
				System.out.println("Opcion incorrecta!");
			}
		}while (opcion_menu != Menu.SALIR);
		sc.close();
		
	}
}
