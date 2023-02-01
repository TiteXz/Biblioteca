import java.text.ParseException;
import java.util.Scanner;

public class Menu {

		
		//declaracion de constantes (final) para las opciones
	public static final int MENU_PRINCIPAL = 1;
	public static final int MENU_LIBROS = 2;
	public static final int MENU_SOCIOS = 3;
	public static final int MENU_PRESTAMOS = 4;
	public static final int SALIR = 0;
		
		
		//declaracion de constantes (final) para las opciones
	public static final int GESTIONAR_LIBROS = 1;
	public static final int GESTIONAR_SOCIOS = 2;
	public static final int GESTIONAR_PRESTAMOS = 3;
		
				//declaracion de constantes (final) para las opciones
	public static final int INSERTAR_LIBRO = 1;
	public static final int ELIMINAR_LIBRO = 2;
	public static final int MOSTRAR_LIBRO = 4;
	public static final int MODIFICAR_LIBRO = 3;
		

				//declaracion de constantes (final) para las opciones
	public static final int INSERTAR_SOCIO = 1;
	public static final int ELIMINAR_SOCIO = 2;
	public static final int MODIFICAR_SOCIO = 3;
	public static final int VER_SOCIOS = 4;
				
				//declaracion de constantes (final) para las opciones
	public static final int REALIZAR_PRESTAMO = 1;
				

	 public static void mostrarMenuPrincipal() {
		
			System.out.println("------MENU-------");
			System.out.println(GESTIONAR_LIBROS + ". Gestionar Libros");
			System.out.println(GESTIONAR_SOCIOS + ". Gestionar Socios");
			System.out.println(GESTIONAR_PRESTAMOS + ". Gestionar Prestamos");
			System.out.println(SALIR + ". Salir");
			System.out.println("Elije una de las opciones");
			
			
	}

	public static void mostrarMenuLibros() {
		
			System.out.println("------MENU-------");
			System.out.println(INSERTAR_LIBRO + ". Insertar Libro");
			System.out.println(ELIMINAR_LIBRO + ". Eliminar Libro");
			System.out.println(MODIFICAR_LIBRO + ". Modificar Libro");
			System.out.println(MOSTRAR_LIBRO + ". Ver Libro");
			System.out.println(SALIR + ". Salir");
			System.out.println("Elije una de las opciones");
			
	}

	 public static void mostrarMenuSocios() {
		 
			System.out.println("------MENU-------");
			System.out.println(INSERTAR_SOCIO + ". Insertar Socios");
			System.out.println(ELIMINAR_SOCIO + ". Eliminar Socios");
			System.out.println(MODIFICAR_SOCIO + ". Modificar Socios");
			System.out.println(VER_SOCIOS + ". Ver Socios");
			System.out.println(SALIR + ". Salir");
			System.out.println("Elije una de las opciones");
			
			
	}

	public static void mostrarMenuPrestamos() {
		Scanner scan = new Scanner(System.in);
		int opcion_menu;

			System.out.println("------MENU-------");
			System.out.println(REALIZAR_PRESTAMO + ". Realizar Prestamo");
			System.out.println(SALIR + ". Salir");
			System.out.println("Elije una de las opciones");
			opcion_menu = Integer.parseInt(scan.nextLine());
			
			switch (opcion_menu) {
			case REALIZAR_PRESTAMO:
				mostrarMenuPrincipal();
				break;
			default:
				System.out.println("Opcion incorrecta!");
			}
		
		scan.close();
	}
}
