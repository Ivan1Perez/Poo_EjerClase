package BlackJack_Remake;

import java.util.Scanner;

public class Jugador {

    private final Scanner sc = new Scanner(System.in);
    private String nombre;
    private int edad;
    private Carta[] cartas;
    private Carta puntuacion;
    private int ID;
    private static int ultimoID;


    public Jugador(){
        this.nombre = "Desconocido";
        this.ID = ++ultimoID;
        this.puntuacion = puntuacion;
    }

    public Jugador(String  nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.ID = ++ultimoID;
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String setNombre(){
        String respuesta;
        do{
            respuesta = sc.nextLine();
            if(respuesta.length() < 2)
                System.out.println("Error. Este campo no puede tener menos de 2 caracteres");
            if(respuesta.length() > 30)
                System.out.println("Error. Este campo no puede tener más de 30 caracteres");

        }while(respuesta.length() < 2 || respuesta.length() > 30);

        this.nombre = respuesta;
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEdad(){
        int edad;

        do{
            while(!sc.hasNextInt()){
                System.out.println("Error. Has de introducir un número en este campo");
                sc.next();
            }
            edad = sc.nextInt();
            if(edad < 18){
                System.out.println("Lo sentimos, has de tener 18 años o más para poder jugar.");
            }
            if(edad > 130){
                System.out.println("Superas el límite de edad establecido.");
            }
        }while(edad > 130 || edad < 18);
        this.edad = edad;
    }

    public Carta getPuntuacion(Baraja baraja){
        this.puntuacion = baraja.getUp();
        return puntuacion;
    }

    @Override
    public String toString(){
        String salida = "";

        if(edad == 0){
            salida += "Jugador " + ID + ":\n" +
                    nombre + "\n";
        }else{
            salida += "Jugador " + ID + ":\n" +
                    nombre + "\n" +
                    "Edad: " + edad + "\n";
        }

        if(puntuacion != null){
            salida += "Puntuación: " + puntuacion + "\n";
        }

        return salida;

    }

}
