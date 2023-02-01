import java.util.Scanner;

public class GestorSocios {
	public void run() {
		Scanner sc = new Scanner(System.in);
		int opcion_menu;
		
		Menu.mostrarMenuLibros();
		opcion_menu = Integer.parseInt(sc.nextLine());
		
		switch (opcion_menu) {
		case Menu.GESTIONAR_LIBROS:
			Menu.mostrarMenuPrincipal();
			break;
		case Menu.GESTIONAR_SOCIOS:
			Menu.mostrarMenuLibros();
			break;
		case Menu.GESTIONAR_PRESTAMOS:
			Menu.mostrarMenuSocios();
			break;
		default:
			System.out.println("Opcion incorrecta!");
		}
	
	sc.close();
	}
}
