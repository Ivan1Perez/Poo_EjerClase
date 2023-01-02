package Ejercicio1_Remake;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Ramón", "González Gutierrez", "44123991K");
        Cuenta cuenta1 = new Cuenta(3000, persona1);
        System.out.println(cuenta1);
        cuenta1.ingreso(300);
        cuenta1.reintegro(250);
        System.out.println(cuenta1 + "\n");

        Cuenta cuenta2 = new Cuenta();
        cuenta2.setTitular(new Persona("Jorge", "Ibañez Báez", "19499173C"));

        cuenta1.transferencia(500, cuenta2);

        Cuenta cuenta3 = new Cuenta();

        System.out.println(cuenta1 + "\n");
        System.out.println(cuenta2 + "\n");
        System.out.println(cuenta3 + "\n");

    }
}
