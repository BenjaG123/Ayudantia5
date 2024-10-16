import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String nombre;
	private String identificacion;
	private List<Prestamo> prestamos;

	public Usuario(String nombre, String identificacion) {
		this.nombre = nombre;
		this.identificacion = identificacion;
		this.prestamos = new ArrayList<Prestamo>();
	}

	public void realizarPrestamo(Prestamo prestamo) {
		prestamos.add(prestamo);
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdentificacion() {
		return this.identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	private List<Prestamo> getPrestamos() { return this.prestamos; }

	private void agregarPrestamo(Prestamo prestamo) {
		prestamos.add(prestamo);
	}
}