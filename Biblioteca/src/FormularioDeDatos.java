import java.util.Date;
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
	
	public static int pedirIdLibro(Scanner sc) {
		System.out.println("Cual es el id del libro");
		int id = Integer.parseInt(sc.nextLine());
		
		return id;
	}
	
	public static Socio pedirDatosSocio(Scanner sc) {
		Socio socio = new Socio();
		
		System.out.println("¿Cual es el nombre del socio?");
		socio.setNombre(sc.nextLine());
		System.out.println("¿Cual es el apellido del socio?");
		socio.setApellido(sc.nextLine());
		System.out.println("¿Cual es la direccion del socio?");
		socio.setDireccion(sc.nextLine());
		System.out.println("¿Cual es la provincia del socio?");
		socio.setProvincia(sc.nextLine());
		System.out.println("¿Cual es la poblacion del socio?");
		socio.setPoblacion(sc.nextLine());
		System.out.println("¿Cual es el dni del socio?");
		socio.setDni(sc.nextLine());
		
		return socio;
		
	}
	
	public static Socio modificarDatosSocio(Socio socio, Scanner sc) {
		
		System.out.println("Introduce el id del socio que quieras modificar");
		socio.setId(Integer.parseInt(sc.nextLine()));
		System.out.println("Introduce el nuevo nombre del socio");
		socio.setNombre(sc.nextLine());
		System.out.println("Introduce el nuevo apellido del socio");
		socio.setApellido(sc.nextLine());
		System.out.println("Introduce la nueva direccion del socio");
		socio.setDireccion(sc.nextLine());
		System.out.println("Introduce la nueva provincia del socio");
		socio.setProvincia(sc.nextLine());
		System.out.println("Introduce la nueva poblacion del socio");
		socio.setPoblacion(sc.nextLine());
		System.out.println("Introduce el nuevo dni del socio");
		socio.setDni(sc.nextLine());
		
		return socio;
		
	}
	
	public static int pedirIdSocio(Scanner sc) {
		System.out.println("Cual es el id del socio");
		int id = Integer.parseInt(sc.nextLine());
		
		return id;
	}
	
	public static Prestamo getDatosDePrestamo(Scanner scan) {
		Prestamo prestamo = new Prestamo();
		
		
		System.out.println("Intdoduce un id de Libro");
		prestamo.setId_libro(Integer.parseInt(scan.nextLine()));

		System.out.println("Intdoduce un id de socio");
		prestamo.setId_socio(Integer.parseInt(scan.nextLine()));
		
		prestamo.setFecha(new Date()); //fecha actual del sistema
		prestamo.setDevuelto(false); //cuando se crea un prestamo nuevo devuelto a false
		return prestamo;
	}
	
}
