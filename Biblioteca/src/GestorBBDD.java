import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class GestorBBDD extends Conector{
	
	
	public void insertarLibros(Libro libro) throws SQLException {
			PreparedStatement pst = con.prepareStatement("INSERT INTO libros VALUES (null,?,?,?)");
			pst.setString(1,libro.getTitulo());
			pst.setString(2,libro.getAutor());
			pst.setInt(1,libro.getNum_pag());
			
			pst.execute();
	}
	
	public void eliminarLibro(int id) throws SQLException {
		PreparedStatement pst = con.prepareStatement("DELETE FROM libros WHERE id = ?");
		pst.setInt(1, id);
		
		pst.execute();
	}

	public Libro getLibro(int id) {
		
	return null;
	
	}
	
}

