import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class GestorBBDD extends Conector{
	
	
	public void insertarLibros(int id) throws SQLException {
			PreparedStatement Pst = con.prepareStatement("INSERT INTO libros VALUES (null,?,?,?)");
			Libro libro = new Libro();
			Scanner sc = new Scanner(System.in);
			
			
			System.out.println("introduce el titulo del libro");
			libro.setTitulo( sc.nextLine());
			Pst.setString(1,libro.getTitulo());
			System.out.println("introduce el nombre del autor del libro");
			libro.setAutor( sc.nextLine());
			Pst.setString(2, libro.getAutor());
			System.out.println("introduce el número de paginas del libro");
			libro.setNum_pag( sc.nextLine());
			Pst.setString(3, libro.getNum_pag());

			Pst.execute();
			sc.close();
	}
	
public void eliminarLibro(int id) {
		
	}

public Libro getLibro(int id) {
	return null;
	
}
	
}

