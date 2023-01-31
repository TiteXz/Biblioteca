import java.text.ParseException;
import java.util.Scanner;

public class Menu {

	public void run() throws ParseException {
		
		//declaracion de constantes (final) para las opciones
		final int MENU_PRINCIPAL = 1;
		final int MENU_LIBROS = 2;
		final int MENU_SOCIOS = 3;
		final int MENU_PRESTAMOS = 4;
		final int SALIR = 0;

		Scanner scan = new Scanner(System.in);
		int opcion_menu;

		do {
			System.out.println("------MENU-------");
			System.out.println(MENU_PRINCIPAL + ". Mostrar el menu principal ");
			System.out.println(MENU_LIBROS + ". Mostrar el menu de los libros");
			System.out.println(MENU_SOCIOS + ". Mostrar el menu de los socios");
			System.out.println(MENU_PRESTAMOS + ". Mostrar el menu de los prestamos");
			System.out.println(SALIR + ". Salir");
			System.out.println("Elije una de las opciones");
			opcion_menu = Integer.parseInt(scan.nextLine());

			switch (opcion_menu) {
			case MENU_PRINCIPAL:
				mostrarMenuPrincipal();
				break;
			case MENU_LIBROS:
				mostrarMenuLibros();
				break;
			case MENU_SOCIOS:
				mostrarMenuSocios();
				break;
			case MENU_PRESTAMOS:
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
		final int GESTIONAR_LIBROS = 1;
		final int GESTIONAR_SOCIOS = 2;
		final int GESTIONAR_PRESTAMOS = 3;
		final int SALIR = 0;

		
	
			System.out.println("------MENU-------");
			System.out.println(GESTIONAR_LIBROS + ". Gestionar Libros");
			System.out.println(GESTIONAR_SOCIOS + ". Gestionar Socios");
			System.out.println(GESTIONAR_PRESTAMOS + ". Gestionar Prestamos");
			System.out.println(SALIR + ". Salir");
			System.out.println("Elije una de las opciones");
	}

	static public void mostrarMenuLibros() {
		//declaracion de constantes (final) para las opciones
		final int INSERTAR_LIBRO = 1;
		final int ELIMINAR_LIBRO = 2;
		final int MOSTRAR_LIBRO = 3;
		final int SALIR = 0;

			System.out.println("------MENU-------");
			System.out.println(INSERTAR_LIBRO + ". Insertar Libro");
			System.out.println(ELIMINAR_LIBRO + ". Eliminar Libro");
			System.out.println(MOSTRAR_LIBRO + ". Ver Libro");
			System.out.println(SALIR + ". Salir");
			System.out.println("Elije una de las opciones");
	}

	static public void mostrarMenuSocios() {
		//declaracion de constantes (final) para las opciones
		final int VER_SOCIOS = 1;
		final int SALIR = 0;

			System.out.println("------MENU-------");
			System.out.println(VER_SOCIOS + ". Ver Socios");
			System.out.println(SALIR + ". Salir");
			System.out.println("Elije una de las opciones");
	}

	static public void mostrarMenuPrestamos() {
		//declaracion de constantes (final) para las opciones
		final int REALIZAR_PRESTAMO = 1;
		final int SALIR = 0;

			System.out.println("------MENU-------");
			System.out.println(REALIZAR_PRESTAMO + ". Realizar Prestamo");
			System.out.println(SALIR + ". Salir");
			System.out.println("Elije una de las opciones");
	}
}
