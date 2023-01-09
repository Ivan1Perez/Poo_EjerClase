package BlackJack_Remake;

public class Partida {

    private Entrada partida;
    private Jugador[] jugadores;

    public Partida(){
        System.out.println("¿Empezar partida?\n" + "Presiona [S] para jugar o [N] para salir del juego.");
        this.partida = new Entrada();
        System.out.println(partida + "\n");
        getJugador();

        for(int i = 0 ; i < jugadores.length ; i ++){
            System.out.println(jugadores[i]);
        }


    }

    public Jugador[] getJugador(){
        Jugador[] jugadores = new Jugador[partida.getNumJugadores()];

        for(int i = 0 ; i < jugadores.length ; i++){
            System.out.println("¿Quieres introducir el nombre del jugador?");
            partida.datosJugador();

            if(partida.getDatosJugador()){
                jugadores[i] = new Jugador(jugadores[i].setNombre(), jugadores[i].getEdad());
            }else jugadores[i] = new Jugador();

        }

        this.jugadores = jugadores;
        return this.jugadores;
    }

//    @Override
//    public String toString(){
//        return partida.toString();
//    }
}
