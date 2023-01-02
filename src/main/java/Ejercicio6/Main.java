package Ejercicio6;

public class Main {
    public static void main(String[] args) {

        Fecha fecha1 = new Fecha(31, Mes.DICIEMBRE, 2001);
        Fecha fecha2 = new Fecha();


        System.out.println(fecha1);
//        System.out.println(fecha2);
        fecha1.sumarDia();

        System.out.println(fecha1);
        System.out.println();

        System.out.println(fecha1.calendarioAnual());
        System.out.println(fecha1.calendarioAnual());
        System.out.println(fecha1.calendarioAnual());

    }
}
