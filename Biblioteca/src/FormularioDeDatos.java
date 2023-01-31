import java.util.Scanner;

public class FormularioDeDatos {

	Scanner sc = new Scanner(System.in);
	
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
}
