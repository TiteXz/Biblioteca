import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class GestorBBDD extends Conector{
	
	
	public void insertarLibros(Libro libro) throws SQLException {
			PreparedStatement pst = con.prepareStatement("INSERT INTO libros VALUES (null,?,?,?)");
			pst.setString(1,libro.getTitulo());
			libro.setAutor(null);
			libro.setNum_pag(null);
			
			pst.execute();
	}
	
	public void eliminarLibro(int id) throws SQLException {
		PreparedStatement Pst = con.prepareStatement("DELETE FROM libros WHERE id = ?");
		
		Pst.execute();
	}

	public Libro getLibro(int id) {
		
	return null;
	
	}
	
}

