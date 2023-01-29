package Cartas;

//barajar cartas
//coger carta arriba
//coger carta abajo
//mostrar última carta

public class Main {
    public static void main(String[] args) {

        int cantidadJugadores = Entrada.getInt("¿Cuántos jugadores quieren jugar?");
        Jugador[] jugadors = new Jugador[cantidadJugadores];

        for(int i=0;i<cantidadJugadores;i++)
            jugadors[i] = new Jugador(Entrada.getString("Nombre para el jugador " + (i+1)));

        Partida partida = new Partida(jugadors);

        partida.start();

    }
}