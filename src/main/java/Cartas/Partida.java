package Cartas;

public class Partida {

    private Jugador[] jugadores;
    private Baraja baraja;
    private Jugador pc;

    public Partida(Jugador... jugadores){
        this.baraja = new Baraja();
        this.pc = new Jugador("La Banca");
        this.jugadores = jugadores;
    }

    public void start() {

        ListaCartas l = new ListaCartas();
        l.shuffle(baraja.getCartas());

        for (Jugador jugador : jugadores)
            juegaJugador(jugador);

        juegaMaquina(pc);

        /*
        barajar
        cada jugador pide carta hasta diga basta o se pase
        juega Pc
            - Solicita siempre carta mientras no se haya pasado y su puntuacin sea inferior
               a todos los jugadores
        Comprobar por cada jugador si ha ganado o ha perdido.
         */

    }

    private void juegaJugador(Jugador jugador) {

        System.out.println("Le toca jugar a " + jugador.getNombre());
        String opcion = "";
        do {
            jugador.addCarta(baraja.getDown());
            System.out.println(jugador);
            if (jugador.getPuntuacion() < 21)
                opcion = Entrada.getOption("Quieres otra carta? [Y|N]");
            else if (jugador.getPuntuacion() == 21)
                System.out.println("BlackJack!\n");
            else {
                System.out.println("Te has pasado!\n");
            }
        } while (jugador.getPuntuacion() < 21 && opcion.equals(Entrada.YES));

    }

    private void juegaMaquina(Jugador maquina){

        System.out.println("Es el turno de La Banca");

        do{
            maquina.addCarta(baraja.getDown());
        }while(maquina.getPuntuacion() < 17);

        System.out.println(maquina);

        if(maquina.getPuntuacion() == 21){
            System.out.println("BlackJack!");
        }
        else if (maquina.getPuntuacion() > 21){
            System.out.println("\nLa Banca se ha pasado!");
        }

        checkGanadores();

    }

    private void checkGanadores(){

        System.out.println("\nPuntuaciones:");

        for (Jugador jugador : jugadores)
            System.out.println(jugador.getNombre() + ": " + jugador.getPuntuacion());
        System.out.println("Banca: " + pc.getPuntuacion());
        System.out.println();

        for(int i = 0 ; i < jugadores.length ; i++){
            if(pc.getPuntuacion() <= 21){
                if(jugadores[i].getPuntuacion() > pc.getPuntuacion() && jugadores[i].getPuntuacion() < 22){
                    System.out.println("Jugador: " + jugadores[i].getNombre() + " gana!");
                }
                else if(jugadores[i].getPuntuacion() == pc.getPuntuacion())
                    System.out.println("Jugador: " + jugadores[i].getNombre() + " empata!");
                else
                    System.out.println("Jugador: " + jugadores[i].getNombre() + " pierde!");
            }else if (pc.getPuntuacion() > 21 && jugadores[i].getPuntuacion() < 22)
                System.out.println("Jugador: " + jugadores[i].getNombre() + " gana!");
            else if (pc.getPuntuacion() <= 21 && jugadores[i].getPuntuacion() > 22)
                System.out.println("Jugador: " + jugadores[i].getNombre() + " pierde!");
        }

    }

}

