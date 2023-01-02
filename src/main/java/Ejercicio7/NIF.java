package Ejercicio7;

public class NIF {
    private String numero;
    private Letra letra;

    /*La clase contendrá un método privado que calcule la letra del NIF a partir del número de DNI*/

    public NIF(String numero){
        this.numero = numero;
    }

    public String getNumero(){
        return numero;
    }

    private Letra calcularLetra(){
        int numeroCodigo;
        numeroCodigo = (Integer.parseInt(numero)%23);
        return Letra.values()[numeroCodigo];
    }

//    public Letra getLetra(){
//        return letra;
//    }

    @Override
    public String toString(){
        return "NIF: " + numero + "-" + calcularLetra();
    }

}
