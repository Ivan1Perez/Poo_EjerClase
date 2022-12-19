package ejercicio4;

public class Main {
    public static void main(String[] args) {

        Libro  libro = new Libro("Pepe", "Las vidas de Bonifacio");

        System.out.println(libro);

        libro.prestamo(3);
        System.out.println(libro.getCantidadActual());
        libro.devolucion(4);

        System.out.println(libro);

    }
}
