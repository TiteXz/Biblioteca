import java.util.Scanner;

public class GestorLibros {

	public void run() {
		Scanner sc = new Scanner(System.in);
		int opcion_menu;
		
		Menu.mostrarMenuLibros();
		opcion_menu = Integer.parseInt(sc.nextLine());
		
		switch (opcion_menu) {
		case Menu.INSERTAR_LIBRO:
			Menu.mostrarMenuPrincipal();
			break;
		case Menu.ELIMINAR_LIBRO:
			Menu.mostrarMenuLibros();
			break;
		case Menu.MOSTRAR_LIBRO:
			Menu.mostrarMenuSocios();
			break;
		default:
			System.out.println("Opcion incorrecta!");
		}
	
	sc.close();
	}
}
