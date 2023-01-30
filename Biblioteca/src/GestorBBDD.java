import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class GestorBBDD extends Conector{
	
	
	public void insertarLibros(Libro libro) throws SQLException, ClassNotFoundException {
		super.conectar();
			PreparedStatement pst = con.prepareStatement("INSERT INTO libros VALUES (null,?,?,?)");
			pst.setString(1,libro.getTitulo());
			pst.setString(2,libro.getAutor());
			pst.setInt(1,libro.getNum_pag());
			
			pst.execute();
		super.cerrar();	
	}
	
	public void eliminarLibro(int id) throws SQLException, ClassNotFoundException {
		super.conectar();
			PreparedStatement pst = con.prepareStatement("DELETE FROM libros WHERE id = ?");
			pst.setInt(1, id);
		
			pst.execute();
		super.cerrar();		
	}

	public Libro getLibro(int id) throws ClassNotFoundException, SQLException {
		super.conectar();
		Libro libro = new Libro();
		PreparedStatement pst = con.prepareStatement("SELECT FROM libros WHERE id = ?");
		pst.setInt(1, id);
		ResultSet resultado = pst.executeQuery();
		System.out.println();
	return null;
	
	
//	PreparedStatement Pst = con.prepareStatement("SELECT * FROM arboles ");
//
//	 ResultSet resultado = Pst.executeQuery();
//		 while(resultado.next()) {
//		 System.out.println(resultado.getInt(1)+ " - " +resultado.getString(2)+ " - " +resultado.getString(3)+ " - " +resultado.getString(4)+ " - " +resultado.getString(5)+ " - " +resultado.getString(6));
//}
	}
	
}

