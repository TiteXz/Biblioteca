package eh_garden;

public class Arbol {

	private int id;
	private String nombreComun;
	private String nombreCientifico;
	private String Habitat;
	private int altura;
	private String origen;
	
	public Arbol() {}
	
	public Arbol(int id, String nombreComun, String nombreCientifico, String habitat, int altura, String origen) {
		super();
		this.id = id;
		this.nombreComun = nombreComun;
		this.nombreCientifico = nombreCientifico;
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

	public String getNombreCientifico() {
		return nombreCientifico;
	}

	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
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
