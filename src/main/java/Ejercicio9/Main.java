package Ejercicio9;

public class Main {

    public static void main(String[] args) {
        Segmento punto1 = new Segmento(4,4);
        Segmento punto2 = new Segmento(7,7);

        System.out.print(punto1);
        System.out.print("-");
        System.out.println(punto2);

        System.out.println();

        punto1.moveRight(2);
        punto1.moveUp(2);
        System.out.print(punto1);
        System.out.print("-");
        System.out.println(punto2);

        System.out.println();

        punto1.movePuntosUp(2, punto2);
        System.out.print(punto1);
        System.out.print("-");
        System.out.println(punto2);

        System.out.println();

        punto1.movePuntosUp(2, punto2);
        System.out.print(punto1);
        System.out.print("-");
        System.out.println(punto2);

    }

}
