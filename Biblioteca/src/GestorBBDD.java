import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorBBDD extends Conector{
	
	
	public void insertarLibros(Libro libro) throws SQLException, ClassNotFoundException {
		super.conectar();
			PreparedStatement pst = con.prepareStatement("INSERT INTO libros VALUES (null,?,?,?)");
			pst.setString(1,libro.getTitulo());
			pst.setString(2,libro.getAutor());
			pst.setInt(3,libro.getNum_pag());
			
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
	
	public void modificarLibro() throws SQLException, ClassNotFoundException {
		super.conectar();
		PreparedStatement Pst=con.prepareStatement("UPDATE socios SET id= (?),nombre= (?),apellido= (?),num_pag= (?) WHERE id=(?);");
		Libro libro = new Libro();
		
		System.out.println("introduce el id del libro que quieras modificar");
	
		Pst.setInt(1, libro.getId());
		Pst.setString(2, libro.getTitulo());
		Pst.setString(3, libro.getAutor());
		Pst.setInt(4, libro.getNum_pag());
		
		Pst.executeUpdate();
		
		
		super.cerrar();
	}
	
	public ArrayList<Libro> getLibros() throws ClassNotFoundException, SQLException {
		ArrayList<Libro>libros = new ArrayList<Libro>();
		super.conectar();
		String senteciaSelect= "SELECT * FROM libros";
		PreparedStatement Pst =con.prepareStatement(senteciaSelect);
		ResultSet resultado = Pst.executeQuery();
		
		while(resultado.next()) {
		Libro libro = new Libro();
		libro.setId(resultado.getInt("id"));
		libro.setTitulo(resultado.getString("titulo"));
		libro.setAutor(resultado.getString("autor"));
		libro.setNum_pag(resultado.getInt("num_pag"));
		
		libros.add(libro);
		
		}
		
		super.cerrar();
		return libros;
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
	
	public void modificarSocio() throws SQLException, ClassNotFoundException {
		super.conectar();
		PreparedStatement Pst=con.prepareStatement("UPDATE socios SET id= (?),nombre= (?),apellido= (?),provincia= (?),poblacion= (?),dni= (?) WHERE id=(?);");
		Socio socio = new Socio();
	
		Pst.setInt(1, socio.getId());
		Pst.setString(2, socio.getNombre());
		Pst.setString(3, socio.getApellido());
		Pst.setString(4, socio.getProvincia());
		Pst.setString(5, socio.getPoblacion());
		Pst.setString(6, socio.getDni());
		
		Pst.executeUpdate();
		
		super.cerrar();
	}
	
	public ArrayList<Socio> getSocios() throws ClassNotFoundException, SQLException {
		ArrayList<Socio>socios = new ArrayList<Socio>();
		super.conectar();
		String senteciaSelect= "SELECT * FROM socios";
		PreparedStatement Pst =con.prepareStatement(senteciaSelect);
		ResultSet resultado = Pst.executeQuery();
		
		while(resultado.next()) {
		Socio socio = new Socio();
		socio.setId(resultado.getInt("id"));
		socio.setNombre(resultado.getString("nombre"));
		socio.setApellido(resultado.getString("apellido"));
		socio.setProvincia(resultado.getString("provincia"));
		socio.setPoblacion(resultado.getString("poblacion"));
		socio.setDni(resultado.getString("dni"));
		
		socios.add(socio);
		
		}
		
		super.cerrar();
		return socios;
	}
	
}

