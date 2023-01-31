import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Visor extends Conector{
	
	ArrayList<String> libros = new ArrayList<String>();

	public static void mostrarLibros(ArrayList<String>libros) throws SQLException {
		PreparedStatement Pst = con.prepareStatement("SELECT * FROM libros ");

		 ResultSet resultado = Pst.executeQuery();
			 while(resultado.next()) {
			 System.out.println(resultado.getInt(1)+ " - " +resultado.getString(2)+ " - " +resultado.getString(3)+ " - " +resultado.getInt(4));
	 
			 }	
	}
	

	public static void mostrarLibro(Libro libro) {
		System.out.println(libro.getId()+"--"+libro.getTitulo()+"--"+libro.getAutor()+"--"+libro.getNum_pag());
	}
	
	public static void mostrarMensaje(String mensaje) {
		
	}
}
