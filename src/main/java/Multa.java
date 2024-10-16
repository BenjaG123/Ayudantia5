import java.util.Date;

public class Multa {

	private int monto;
	private Date fechaEmision;
	private String estado;
	private Prestamo prestamo;

	public Multa(int monto, Prestamo prestamo) {
		this.monto = monto;
		this.fechaEmision = new Date();
		this.estado = "No pagada.";
		this.prestamo = prestamo;
	}

	public int getMonto() {
		return this.monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	public Date getFechaEmision() {
		return this.fechaEmision;
	}

	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void pagar(){
		this.estado = "Pagada.";
	}

}