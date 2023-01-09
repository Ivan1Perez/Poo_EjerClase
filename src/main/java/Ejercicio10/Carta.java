package Ejercicio10;

public class Carta {

    private Valor valor;
    private Palo palo;

    public Carta(Valor valor, Palo palo){
        this.valor = valor;
        this.palo = palo;
    }

    public Valor getValor(){
        return valor;
    }

    @Override
    public String toString(){
        return valor + "-" + palo + "\n";
    }

}
