package eh_garden;

public class Arbol {

	private int id;
	private String nombreComun;
	private String nombreCliente;
	private String Habitat;
	private int altura;
	private String origen;
	
	public Arbol() {}
	
	public Arbol(int id, String nombreComun, String nombreCliente, String habitat, int altura, String origen) {
		super();
		this.id = id;
		this.nombreComun = nombreComun;
		this.nombreCliente = nombreCliente;
		Habitat = habitat;
		this.altura = altura;
		this.origen = origen;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreComun() {
		return nombreComun;
	}

	public void setNombreComun(String nombreComun) {
		this.nombreComun = nombreComun;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getHabitat() {
		return Habitat;
	}

	public void setHabitat(String habitat) {
		Habitat = habitat;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	
}
