package ejercicio4;

public class Libro {

    private String autor;
    private String  titulo;
    private static int cantidadInicial = 5;

    private int cantidadActual;

    private int cantidad;

    public Libro(String autor, String titulo){
        this.autor = autor;
        this.titulo = titulo;
        this.cantidadActual = cantidadInicial;
    }

    public boolean prestamo(int cantidad){
        if(cantidad<=cantidadInicial && cantidad>0 && cantidadActual>0) {
            cantidadActual -= cantidad;
            return true;
        }
        else {
            System.out.println("No podemos prestar tantos libros");
            return false;
        }
    }

    public boolean devolucion(int cantidad){
        if(cantidad<=cantidadInicial && cantidadActual<cantidadInicial && cantidad>0) {
            cantidadActual += cantidad;
            return true;
        }else{
            System.out.println("Ya tenemos todos los libros. Gracias.");
            return false;
        }
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    @Override
    public String toString(){
        return "Autor: " + autor + "\n" +
                "Título: " + titulo + "\n" +
                "Libros disponibles: " + cantidadActual;
    }

}
