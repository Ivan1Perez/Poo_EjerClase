package ejercicio5;

public class Main {
    public static void main(String[] args) {

        Fraccion fraccion1 = new Fraccion(4, 5);
        Fraccion fraccion2 = new Fraccion(8, 9);

//        System.out.print(fraccion1);
//        System.out.print("-->Multiplicar-->");
//        fraccion1.multiplicar(fraccion1, fraccion2);
//        System.out.println(fraccion1);

//        System.out.print(fraccion1 + "-->Dividir-->" + fraccion2);
//        fraccion1.dividir(fraccion1, fraccion2);
//        System.out.println(" = " + fraccion1);

//        System.out.print(fraccion1 + " + " + fraccion2);
//        fraccion1.sumar(fraccion1,fraccion2);
//        System.out.println(" = " + fraccion1);

        System.out.print(fraccion1 + " - " + fraccion2);
        fraccion1.restar(fraccion1,fraccion2);
        System.out.println(" = " + fraccion1);



    }
}
