
public class Prestamo {

	private int id_libro;
	private String id_socio;
	private String fecha;
	private String devuelto;
	
	public Prestamo() {}
	
	public Prestamo(int id, String id_socio, String fecha, String devuelto) {
		this.id_libro = id;
		this.id_socio = id_socio;
		this.fecha = fecha;
		this.devuelto = devuelto;
	}

	public int getId_libro() {
		return id_libro;
	}

	public void setId_libro(int id) {
		this.id_libro = id;
	}

	public String getId_socio() {
		return id_socio;
	}

	public void setId_socio(String id_socio) {
		this.id_socio = id_socio;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getDevuelto() {
		return devuelto;
	}

	public void setDevuelto(String devuelto) {
		this.devuelto = devuelto;
	}
	@Override
	public String toString() {
		return "Prestamo " + id_libro + ", id_socio=" + id_socio + ", fecha=" + fecha + ", devuelto=" + devuelto;
	}
	

}
