public class Empleado {

	private String nombre;
	private String identificacion;
	private String cargo;

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdentificacion() {
		return this.identificacion;
	}

	/**
	 * 
	 * @param identificacion
	 */
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getCargo() {
		return this.cargo;
	}

	/**
	 * 
	 * @param cargo
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void getAttribute() {
		// TODO - implement Empleado.getAttribute
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param attribute
	 */
	public void setAttribute(int attribute) {
		// TODO - implement Empleado.setAttribute
		throw new UnsupportedOperationException();
	}

}