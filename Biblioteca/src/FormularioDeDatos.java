import java.util.Scanner;

public class FormularioDeDatos {
	
	public static Libro pedirDatosLibro(Scanner sc) {
		Libro libro = new Libro();
		
		System.out.println("¿Cual es el titulo del libro?");
		libro.setTitulo(sc.nextLine());
		System.out.println("¿Cual es el nombre del autor del libro?");
		libro.setAutor(sc.nextLine());
		System.out.println("¿Cuantas paginas tiene el libro?");
		libro.setNum_pag(Integer.parseInt(sc.nextLine()));
		
		return libro;
		
	}
	
	public static Libro modificarDatosLibro(Libro libro, Scanner sc) {
		
		System.out.println("Introduce el id del libro que quieras modificar");
		libro.setId(Integer.parseInt(sc.nextLine()));
		System.out.println("Introduce el nuevo titulo para el libro");
		libro.setTitulo(sc.nextLine());
		System.out.println("Introduce el nuevo autor del libro");
		libro.setAutor(sc.nextLine());
		System.out.println("Introduce el numero de paginas del nuevo libro");
		libro.setNum_pag(Integer.parseInt(sc.nextLine()));
		return libro;
		
	}
}
