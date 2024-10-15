import java.util.ArrayList;

public class Biblioteca {

	private String nombre;
	private String direccion;
	private ArrayList<Libro> libros;
	private ArrayList<Empleado> empleados;

	public Biblioteca(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.libros = new ArrayList<>();
		this.empleados = new ArrayList<>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void agregarLibro(Libro libro) {
		libros.add(libro);
	}

	public void agregarEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}

	public void eliminarLibro(Libro libro) {
		libros.remove(libro);
	}
}