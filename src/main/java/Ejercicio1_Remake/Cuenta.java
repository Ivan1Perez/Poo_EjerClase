package Ejercicio1_Remake;

public class Cuenta {

    private final String numeroCuenta = "4886-5941-9422-0";
    private int incrementoCuenta;
    private static int acumuladoCuenta;
    private int saldoInicial;
    private int saldoActual;
    private Persona titular;
    private Date fechaIngreso;

    public Cuenta(){
        incrementoCuenta += acumuladoCuenta++;
    }

//    String.valueOf(incrementoCuenta++)

    public Cuenta(int saldoInicial, Persona titular){
        incrementoCuenta += acumuladoCuenta++;
        this.saldoInicial = saldoInicial;
        saldoActual = saldoInicial;
        this.titular = titular;
    }

    public int getSaldoInicial(){
        return saldoInicial;
    }

    public Persona getTitular(){
        return titular;
    }

    public void setTitular(Persona titular){
        this.titular = titular;
    }

    public void ingreso(int cantidad){
        if(cantidad>0) {
            System.out.println("Realiza un ingreso de " + cantidad + "€");
            saldoActual += cantidad;
        }else System.out.println("No es posible realizar un ingreso negativo.");
    }

    public void reintegro(int cantidad){
        if(cantidad>0){
            System.out.println("Realiza un reintegro de " + cantidad + "€");
            saldoActual -= cantidad;
        }else System.out.println("No es posible realizar un reintegro negativo.");

    }

    public void transferencia(int cantidad, Cuenta cuenta){
        if(cantidad>0) {
            System.out.println("La cuenta " + numeroCuenta + incrementoCuenta + " de titular " +
                    getTitular().getNombre() + " " + getTitular().getApellidos() + " realiza una transferencia de " + cantidad + "€ a la cuenta " +
                    cuenta.numeroCuenta + cuenta.incrementoCuenta + " de titular " +
                    cuenta.getTitular().getNombre() + " " + getTitular().getApellidos() + ".\n");
            saldoActual -= cantidad;
            cuenta.saldoActual += cantidad;
        }else System.out.println("No es posible realizar una transferencia de cantidad negativa.");
    }

    @Override
    public String toString(){
        return "Numero de cuenta: " + numeroCuenta + incrementoCuenta + "\n" +
                "Titular: " + getTitular() + "\n" +
                "Saldo: " + saldoActual + "€";
    }

}
