package BlackJack_Remake;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Baraja {

    private Carta[] cartas;
    private boolean repartido = false;

    public Baraja() {
        cartas = new Carta[BlackJack_Remake.Valor.values().length * BlackJack_Remake.Palo.values().length];
        int j = 0;
        for (BlackJack_Remake.Palo palo : BlackJack_Remake.Palo.values()) {
            for (BlackJack_Remake.Valor valor : BlackJack_Remake.Valor.values())
                cartas[j++] = new Carta(valor, palo);
        }
    }

    public void shuffle(){
        if(!repartido) {
            System.out.println("Se barajan las cartas:");
            List<BlackJack_Remake.Carta> cartaList = Arrays.asList(cartas);
            Collections.shuffle(cartaList);
            cartaList.toArray(cartas);
        }else System.out.println("No se puede barajar una vez se han repartido las cartas.");
    }

    public Carta getUp(){
        this.repartido = true;

        if(cartas.length==0){
//            System.out.println("No quedan más cartas en la baraja");
            return new Carta();
        }

        Carta carta = cartas[cartas.length-1];

        Carta[] aux = new Carta[cartas.length-1];

        for(int i = 0; i < aux.length; i++){
            aux[i] = cartas[i];
        }

        cartas = aux;

        return carta;
    }

    public Carta getDown(){
        this.repartido = true;

        if(cartas.length==0)
            return new Carta();

        Carta carta = cartas[0];

        Carta[] aux = new Carta[cartas.length-1];

        for(int i = 0; i < aux.length; i++){
            aux[i] = cartas[i+1];
        }

        cartas = aux;

        return carta;
    }

    @Override
    public String toString(){
        String salida = "";

        for(int i = 0 ; i < cartas.length ; i++)
            salida += cartas[i] + " ";

        return salida;
    }


}
