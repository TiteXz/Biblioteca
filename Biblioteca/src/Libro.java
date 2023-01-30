
public class Libro {

	private int id;
	private String titulo;
	private String autor;
	private String num_pag;
	
	public Libro() {}
	
	public Libro(int id, String titulo, String autor, String num_pag) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.num_pag = num_pag;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getNum_pag() {
		return num_pag;
	}

	public void setNum_pag(String num_pag) {
		this.num_pag = num_pag;
	}
	
}
