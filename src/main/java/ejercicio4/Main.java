package ejercicio4;

public class Main {
    public static void main(String[] args) {

        boolean prestamoCorrecto;
        Libro  libro = new Libro("Pepe", "Las vidas de Bonifacio");

        System.out.println(libro);

        prestamoCorrecto = libro.prestamo(4);
        System.out.println("Cantidad actual: " + libro.getCantidadActual() + "\n");

        if(prestamoCorrecto) {
            libro.devolucion(5);
            System.out.println("Cantidad actual: " + libro.getCantidadActual() + "\n");
        }

    }
}
