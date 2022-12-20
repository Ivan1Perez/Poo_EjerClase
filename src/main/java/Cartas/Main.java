package Cartas;

//barajar cartas
//coger carta arriba
//coger carta abajo
//mostrar última cartaxd

public class Main {
    public static void main(String[] args) {

//        Baraja baraja = new Baraja();

       /* baraja.shuffle();

        Carta c;
        System.out.println(baraja);
        for(int i=0;i<baraja.getSize();i++) {
            c = baraja.getDown();
            System.out.println(c + " " + c.getValor().getPuntuacion()[0]);
        }*/

//        Jugador jugador = new Jugador("Iván");

//        baraja.shuffle();
//
//        System.out.println(baraja);
//        jugador.addCarta(baraja.getUp());
//
//        System.out.println(jugador);


        int cantidadJugadores = Entrada.getInt("Cuantos jugadores quieren jugar.");
        Jugador[] jugadors = new Jugador[cantidadJugadores];

        for(int i=0;i<cantidadJugadores;i++)
            jugadors[i] = new Jugador(Entrada.getString("Nombre para el jugador " + (i+1)));

        Partida partida = new Partida(jugadors);

        partida.start();

    }
}