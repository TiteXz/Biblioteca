import java.util.Scanner;

public class GestorLibros {

	public void run() {
		Scanner sc = new Scanner(System.in);
		int opcion_menu;
		
		Menu.mostrarMenuLibros();
		opcion_menu = Integer.parseInt(sc.nextLine());
		
		do {
		switch (opcion_menu) {
		case Menu.INSERTAR_LIBRO:
			
			System.out.println("Has insertado un libro");
			break;
		case Menu.ELIMINAR_LIBRO:
			System.out.println("Has eliminado un libro");
			break;
		case Menu.MOSTRAR_LIBRO:
			System.out.println("Has modificado un libro");
			break;
		default:
			System.out.println("Opcion incorrecta!");
			}
		
		}while (opcion_menu != Menu.SALIR);
		sc.close();
	
	}
}
