import java.util.Scanner;

public class GestorSocios {
	public void run() {
		Scanner sc = new Scanner(System.in);
		int opcion_menu;
		
		Menu.mostrarMenuLibros();
		opcion_menu = Integer.parseInt(sc.nextLine());
		
		do {
		switch (opcion_menu) {
		case Menu.VER_SOCIOS:
			Menu.mostrarMenuPrincipal();
			break;
		default:
			System.out.println("Opcion incorrecta!");
		}
		
			}while(opcion_menu != Menu.SALIR);
	
	sc.close();
	}
}
