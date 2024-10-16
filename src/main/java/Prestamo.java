import java.util.Date;

public class Prestamo {

	private Date fechaPrestamo;
	private Date fechaEntrega;
	private Usuario usuario;
	private Libro libro;

	public Prestamo(Libro libro, Usuario usuario) {
		this.libro = libro;
		this.usuario = usuario;
		this.fechaPrestamo = new Date();
	}

	public void devolverLibro() {
		this.fechaEntrega = new Date();
	}

	public Date getFechaPrestamo() {
		return this.fechaPrestamo;
	}

	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public Date getFechaEntrega() {
		return this.fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public Usuario getUsuario() { return usuario; }

	public void setUsuario(Usuario usuario) { this.usuario = usuario; }

	public Libro getLibro() { return libro; }

	public void setLibro(Libro libro) { this.libro = libro; }
}