
public class Menu {

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
