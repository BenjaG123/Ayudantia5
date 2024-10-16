public class Gestion {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Garcés", "Francisco Salazar");

        System.out.println("Bienvenido a "+biblioteca.getNombre());

        Categoria terror = new Categoria("Terror", "De Miedo");

        Libro libro1 = new Libro("El Resplandor", "Stephen King", "1234", 1977, terror);

        biblioteca.agregarLibro(libro1);

        Usuario usuario = new Usuario("Benjamin Garces", "3155");

        Prestamo prestamo = new Prestamo(libro1, usuario);
        usuario.realizarPrestamo(prestamo);

        System.out.println("Prestamo realizado con exito!");
        System.out.println("Usuario: "+usuario.getNombre());
        System.out.println("Libro: "+prestamo.getLibro().toString());

        Multa multa = new Multa(500, prestamo);
        System.out.println("Multa generada : $" + multa.getMonto() + " (Estado: " + multa.getEstado() + ")");

        multa.pagar();
        System.out.println("Multa pagada: $"+multa.getMonto() + " (Estado: " + multa.getEstado() + ")");

    }
}
