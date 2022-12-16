package Cartas;

public class Carta {

    private Cartas.Palo palo;
    private Cartas.Valor valor;

    public Carta(Cartas.Valor valor, Cartas.Palo palo) {
        this.palo = palo;
        this.valor = valor;
    }

    public Cartas.Valor getValor(){
        return valor;
    }

    @Override
    public String toString() {
        return valor + palo.toString();
    }
}
