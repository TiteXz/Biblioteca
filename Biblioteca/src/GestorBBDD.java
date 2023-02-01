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
		libro.setId(resultado.getInt(id));
		libro.setTitulo(resultado.getString("titulo"));
		libro.setAutor(resultado.getString("autor"));
		libro.setNum_pag(resultado.getInt("num_pag"));
		
	return libro;
	
	}
	
	public void insertarSocio(Socio socio) throws SQLException, ClassNotFoundException {
		super.conectar();
			PreparedStatement pst = con.prepareStatement("INSERT INTO socios VALUES (null,?,?,?,?,?,?)");
			pst.setString(1,socio.getNombre());
			pst.setString(2,socio.getApellido());
			pst.setString(3,socio.getDireccion());
			pst.setString(4,socio.getPoblacion());
			pst.setString(5,socio.getProvincia());
			pst.setString(6,socio.getDni());
			
			pst.execute();
		super.cerrar();	
	}
	
	public void eliminarSocio(int id) throws SQLException, ClassNotFoundException {
		super.conectar();
			PreparedStatement pst = con.prepareStatement("DELETE FROM socios WHERE id = ?");
			pst.setInt(1, id);
		
			pst.execute();
		super.cerrar();		
	}

	public Socio getSocio(int id) throws ClassNotFoundException, SQLException {
		super.conectar();
		Socio socio = new Socio();
		PreparedStatement pst = con.prepareStatement("SELECT FROM socios WHERE id = ?");
		pst.setInt(1, id);
		ResultSet resultado = pst.executeQuery();
		socio.setId(resultado.getInt(id));
		socio.setNombre(resultado.getString("nombre"));
		socio.setApellido(resultado.getString("apellido"));
		socio.setDireccion(resultado.getString("direccion"));
		socio.setPoblacion(resultado.getString("poblacion"));
		socio.setProvincia(resultado.getString("provincia"));
		socio.setDni(resultado.getString("dni"));
		
	return socio;
	
	}
	
}

