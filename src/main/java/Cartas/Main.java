package Cartas;

//barajar cartas
//coger carta arriba
//coger carta abajo
//mostrar última carta

public class Main {
    public static void main(String[] args) {

        Baraja baraja = new Baraja();

       /* baraja.shuffle();

        Carta c;
        System.out.println(baraja);
        for(int i=0;i<baraja.getSize();i++) {
            c = baraja.getDown();
            System.out.println(c + " " + c.getValor().getPuntuacion()[0]);
        }*/

        Jugador jugador = new Jugador("Iván");

        baraja.shuffle();

        jugador.addCarta(baraja.getUp());
        System.out.println();

    }
}