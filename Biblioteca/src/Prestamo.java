
public class Prestamo {

	private int id_libro;
	private int id_socio;
	private String fecha;
	private Boolean devuelto;
	
	public Prestamo() {}
	
	public Prestamo(int id, int id_socio, String fecha, Boolean devuelto) {
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

	public int getId_socio() {
		return id_socio;
	}

	public void setId_socio(int id_socio) {
		this.id_socio = id_socio;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Boolean getDevuelto() {
		return devuelto;
	}

	public void setDevuelto(Boolean devuelto) {
		this.devuelto = devuelto;
	}
	@Override
	public String toString() {
		return "Prestamo " + id_libro + ", id_socio=" + id_socio + ", fecha=" + fecha + ", devuelto=" + devuelto;
	}
	

}
