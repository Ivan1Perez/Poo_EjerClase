package BlackJack_Remake;

import java.util.Scanner;

public class Entrada {

    private final Scanner sc = new Scanner(System.in);
    private int numJugadores;
    private boolean datosJugador;
    private String jugar;
    private String texto;
    private String pedirCarta;

    public Entrada(){
        empezar();
    }

    public void empezar() {
        String empezar;
        do{
            empezar = sc.nextLine();
            if(!empezar.equalsIgnoreCase("S") && !empezar.equalsIgnoreCase("N"))
                System.out.println("Error. Recuerda, has de introducir [S] para jugar o [N] para salir.");

        }while(!empezar.equalsIgnoreCase("S") && !empezar.equalsIgnoreCase("N"));
        this.jugar = empezar;
    }

    public void setNumJugadores(){
        System.out.println("¿Cuántos jugadores va a tener la partida? (Máximo 4 jugadores)");
        int jugadores;
        do{
            while(!sc.hasNextInt()){
                System.out.println("Error. Recuerda, has de introducir un número entre '1' y '4'.");
                sc.next();
            }
            jugadores = sc.nextInt();
            if(jugadores < 1 || jugadores > 4)
                System.out.println("Error. Recuerda, has de introducir un número entre '1' y '4'.");

        }while(jugadores < 1 || jugadores > 4);
        this.numJugadores = jugadores;
    }

    public int getNumJugadores(){
        return numJugadores;
    }

    public void setPedirCarta(String pedirCarta){
        this.pedirCarta = pedirCarta;
    }

    public String getPedirCarta() {
        return pedirCarta;
    }

    public void datosJugador(){
        String respuesta;
        boolean datos;
        do{
            respuesta = sc.nextLine();
            if(!respuesta.equalsIgnoreCase("S") && !respuesta.equalsIgnoreCase("N"))
                System.out.println("Error. Recuerda, has de introducir [S] para " +
                        "introducir datos o [N] para dejarlo en blanco.");

        }while(!respuesta.equalsIgnoreCase("S") && !respuesta.equalsIgnoreCase("N"));
        if(respuesta.equalsIgnoreCase("S"))
            datos = true;
        else datos = false;
        this.datosJugador = datos;
    }

    public boolean getDatosJugador(){
        return datosJugador;
    }

    public void texto(){
        String respuesta;
        do{
            respuesta = sc.nextLine();
            if(respuesta.length() < 2)
                System.out.println("Error. Este campo no puede tener menos de 2 caracteres");
            if(respuesta.length() > 30)
                System.out.println("Error. Este campo no puede tener más de 30 caracteres");

        }while(respuesta.length() < 2 || respuesta.length() > 30);

        this.texto = respuesta;
    }

    public String getTexto(){
        return texto;
    }

    @Override
    public String toString(){
        if(jugar.equalsIgnoreCase("N"))
            return "¡Hasta pronto!";
        setNumJugadores();

        if(numJugadores==1){
            return "¡De acuerdo! Comenzamos la partida con " + numJugadores + " jugador.";
        }
        return "¡De acuerdo! Comenzamos la partida con " + numJugadores + " jugadores.";
    }
}
