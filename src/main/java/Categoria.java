import java.util.ArrayList;

public class Categoria {

	private String nombre;
	private String descripcion;
	private ArrayList<Libro> libros;

	public Categoria(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public ArrayList<Libro> getLibros() { return libros; }

	public void agregarLibro(Libro libro) {
		libros.add(libro);
	}

	public void eliminarLibro(Libro libro) {
		libros.remove(libro);
	}
}