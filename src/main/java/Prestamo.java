public class Prestamo {

	private int fechaPrestamo;
	private int fechaEntrega;
	private Usuario usuario;
	private Libro libro;

	public int getFechaPrestamo() {
		return this.fechaPrestamo;
	}

	public void setFechaPrestamo(int fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public int getFechaEntrega() {
		return this.fechaEntrega;
	}

	public void setFechaEntrega(int fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public Usuario getUsuario() { return usuario; }

	public void setUsuario(Usuario usuario) { this.usuario = usuario; }

	public Libro getLibro() { return libro; }

	public void setLibro(Libro libro) { this.libro = libro; }
}