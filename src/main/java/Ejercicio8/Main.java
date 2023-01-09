package Ejercicio8;

public class Main {
    public static void main(String[] args) {

        Punto punto1 = new Punto(3, 4);
        System.out.println(punto1);
        punto1.setEjeX(5);
        punto1.setEjeY(8);
        System.out.println(punto1);
        punto1.moveUp(4);
        System.out.println(punto1);
        punto1.moveLeft(2);
        System.out.println(punto1);

    }
}
