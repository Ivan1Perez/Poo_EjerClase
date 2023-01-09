package Ejercicio10;

/*Simula mediante la programación orientada a objetos una baraja española. La
baraja debe tener la funcionalidad de barajar (puedes consultar por la web como
implementar esta funcionalidad), repartir la carta que esta encima del montón, repartir la
que esta debajo. Se asume que una vez se ha empezado a repartir no se puede volver a
barajar. Para comprobar el correcto funcionamiento, deberás sobrescribir el método
toString() para visualizar el estado de la baraja.*/

public class Main {

    public static void main(String[] args) {

        Baraja baraja = new Baraja();
        System.out.println(" " + baraja);
        System.out.println();
        baraja.shuffle();
        System.out.println(" " + baraja);

        Jugador jugador1 = new Jugador("Ivan Perez");
        System.out.println(jugador1);
        System.out.println();

        System.out.println(baraja.getDown());
//        System.out.println(baraja.getUp());
        System.out.println(" " + baraja);


    }

}
