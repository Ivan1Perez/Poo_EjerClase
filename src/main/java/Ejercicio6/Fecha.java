package Ejercicio6;

public class Fecha {

    private int dia;
    private int mes;
    private int anyo;

    public Fecha (int dia, int mes, int anyo){

        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;

    }

    public Fecha getFecha(){

        return ;

    }


    @Override
    public String toString(){

        return "Fecha:" + dia + "/" + mes + "/" + anyo;

    }

}
