package Ejercicio10;

public class Jugador {

    private String nombre;
    private int ID;
    private static int ultimoID;
    private Carta[] cartasJugador;

    public Jugador(String nombre){
        this.nombre = nombre;
        this.ID = ++ultimoID;
    }

    @Override
    public String toString(){
        return "Jugador " + ID + ":\n" +
                nombre;
    }

}
