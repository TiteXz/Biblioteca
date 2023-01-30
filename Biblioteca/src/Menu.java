import java.text.ParseException;
import java.util.Scanner;

public class Menu {

	public void run() throws ParseException {
		
		//declaracion de constantes (final) para las opciones
		final int OPCION_UNO = 1;
		final int OPCION_DOS = 2;
		final int OPCION_TRES = 3;
		final int OPCION_CUATRO = 4;
		final int SALIR = 0;

		Scanner scan = new Scanner(System.in);
		int opcion_menu;

		do {
			System.out.println("------MENU-------");
			System.out.println(OPCION_UNO + ". Mostrar el menu principal ");
			System.out.println(OPCION_DOS + ". Mostrar el menu de los libros");
			System.out.println(OPCION_TRES + ". Mostrar el menu de los socios");
			System.out.println(OPCION_CUATRO + ". Mostrar el menu de los prestamos");
			System.out.println(SALIR + ". Salir");
			System.out.println("Elije una de las opciones");
			opcion_menu = Integer.parseInt(scan.nextLine());

			switch (opcion_menu) {
			case OPCION_UNO:
				mostrarMenuPrincipal();
				break;
			case OPCION_DOS:
				mostrarMenuLibros();
				break;
			case OPCION_TRES:
				mostrarMenuSocios();
				break;
			case OPCION_CUATRO:
				mostrarMenuPrestamos();
				break;
			case SALIR:
				System.out.println("ADIOS");
				break;
			default:
				System.out.println("Opcion incorrecta!");
			}

		} while (opcion_menu != SALIR);
		scan.close();
	}
	
	static public void mostrarMenuPrincipal() {
		//declaracion de constantes (final) para las opciones
		final int OPCION_UNO = 1;
		final int OPCION_DOS = 2;
		final int OPCION_TRES = 3;
		final int SALIR = 0;

		
	
			System.out.println("------MENU-------");
			System.out.println(OPCION_UNO + ". Gestionar Libros");
			System.out.println(OPCION_DOS + ". Gestionar Socios");
			System.out.println(OPCION_TRES + ". Gestionar Prestamos");
			System.out.println(SALIR + ". Salir");
			System.out.println("Elije una de las opciones");
	}

	static public void mostrarMenuLibros() {
		//declaracion de constantes (final) para las opciones
		final int OPCION_UNO = 1;
		final int OPCION_DOS = 2;
		final int OPCION_TRES = 3;
		final int SALIR = 0;

			System.out.println("------MENU-------");
			System.out.println(OPCION_UNO + ". Insertar Libro");
			System.out.println(OPCION_DOS + ". Eliminar Libro");
			System.out.println(OPCION_TRES + ". Ver Libro");
			System.out.println(SALIR + ". Salir");
			System.out.println("Elije una de las opciones");
	}

	static public void mostrarMenuSocios() {
		//declaracion de constantes (final) para las opciones
		final int OPCION_UNO = 1;
		final int SALIR = 0;

			System.out.println("------MENU-------");
			System.out.println(OPCION_UNO + ". Ver Socios");
			System.out.println(SALIR + ". Salir");
			System.out.println("Elije una de las opciones");
	}

	static public void mostrarMenuPrestamos() {
		//declaracion de constantes (final) para las opciones
		final int OPCION_UNO = 1;
		final int SALIR = 0;

			System.out.println("------MENU-------");
			System.out.println(OPCION_UNO + ". Realizar Prestamo");
			System.out.println(SALIR + ". Salir");
			System.out.println("Elije una de las opciones");
	}
}
