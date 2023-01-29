package Cartas;

public class Partida {

    private Jugador[] jugadores;
    private Baraja baraja;
    private Jugador pc;

    public Partida(Jugador... jugadores){
        this.baraja = new Baraja();
        this.pc = new Jugador("PC");
        this.jugadores = jugadores;
    }

    public void start() {

        baraja.shuffle();

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
            else System.out.println("Te has pasado!\n");
        } while (jugador.getPuntuacion() < 21 && opcion.equals(Entrada.YES));

    }

    private void juegaMaquina(Jugador maquina){
        boolean seHaPasado = false;

        System.out.println("Es el turno de La Casa");

        do{
            maquina.addCarta(baraja.getDown());
        }while(maquina.getPuntuacion() < 16);

        System.out.println(maquina);

        if(maquina.getPuntuacion() == 21)
            System.out.println("\nLa Casa gana");
        else if(maquina.getPuntuacion() < 21){
            checkGanadores();
        }
        else {
            System.out.println("\nLa Casa se ha pasado!");
            seHaPasado = true;
        }

        maquinaLoose(seHaPasado);
    }

    private void maquinaLoose(boolean seHaPasado){
        int i = 0;

        if(seHaPasado){
            while(i < jugadores.length){
                if(jugadores[i].getPuntuacion() <= 21){
                    System.out.println("jugador: " + jugadores[i].getNombre() + " gana.");
                }
                i++;
            }
        }
    }

    private void checkGanadores(){
        int i = 0;

        while(i < jugadores.length){
            if(jugadores[i].getPuntuacion() > pc.getPuntuacion()){
                System.out.println("jugador: " + jugadores[i].getNombre() + " gana.");
            }
            i++;
        }

    }

}

