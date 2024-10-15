public class Libro {

	private String titulo;
	private String autor;
	private String ISBN;
	private int year;
	private Categoria categoria;

	public Libro(String titulo, String autor, String ISBN, int year, Categoria categoria) {
		this.titulo = titulo;
		this.autor = autor;
		this.ISBN = ISBN;
		this.year = year;
		this.categoria = categoria;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getISBN() {return this.ISBN;}

	public void setISBN(String ISBN){ this.ISBN = ISBN; }

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	private Categoria getCategoria() { return this.categoria; }

	private void setCategoria(Categoria categoria) { this.categoria = categoria; }

	public String toString() {
		return "Titulo: "+ this.titulo +" | Autor: "+this.autor+" | ISBN: "+this.ISBN+" | Año: "+this.year+ " | Categoria: "+this.categoria;
	}
}