package Ejercicio6;

public class Fecha {

    private int dia;
    private int anyo;
    private Mes mes;

    public Fecha(){
//        mes = new Mes[Mes.values().length];
    }
    public Fecha (int dia, Mes mes, int anyo){

        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;

    }

    public int getDia(){
        return dia;
    }

    public void setDia(int dia){
        this.dia = dia;
    }

    public Mes getMes(){
        return mes;
    }

    public void setMes(Mes mes) {
        this.mes = mes;
    }

    public int getAnyo(){
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public void sumarDia(){
        if(dia==mes.diasTotales(anyo) && mes.ordinal()!=11) {
            dia = 1;
            mes = Mes.values()[mes.ordinal()+1];
        }else if(dia==mes.diasTotales(anyo)){
            dia = 1;
            mes = Mes.ENERO;
            anyo++;
        }else{
            dia++;
        }
    }

    @Override
    public String toString(){

        return "Fecha:" + dia + "/" + mes + "/" + anyo;

    }

}
