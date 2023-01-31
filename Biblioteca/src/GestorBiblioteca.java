import java.util.Scanner;

public class GestorBiblioteca {
	
	
	
	public static void run() {
		Scanner sc = new Scanner(System.in);
		int opcion_menu;

		Menu.mostrarMenuMenus();
		opcion_menu = Integer.parseInt(sc.nextLine());
	
		do {
			switch (opcion_menu) {
			case Menu.MENU_PRINCIPAL:
				Menu.mostrarMenuPrincipal();
				break;
			case Menu.MENU_LIBROS:
				Menu.mostrarMenuLibros();
				break;
			case Menu.MENU_SOCIOS:
				Menu.mostrarMenuSocios();
				break;
			case Menu.MENU_PRESTAMOS:
				Menu.mostrarMenuPrestamos();
				break;
			case Menu.SALIR:
				System.out.println("ADIOS");
				break;
			default:
				System.out.println("Opcion incorrecta!");
			}
		}while (opcion_menu != Menu.SALIR);
		sc.close();
		
	}
}
