package BlackJack_Remake;

public class Carta {

    private Valor valor;
    private Palo palo;
    private final String finCartas = "No quedan más cartas en la baraja.";

    public Carta(){

    }
    public Carta(Valor valor, Palo palo){
        this.valor = valor;
        this.palo = palo;
    }

    @Override
    public String toString(){
        if(valor == null){
            return finCartas;
        }
        return valor.toString() + palo;
    }

}
