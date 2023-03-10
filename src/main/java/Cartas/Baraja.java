package Cartas;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Baraja {
    private Carta[] cartas;

    public Baraja(){
        cartas = new Carta[Cartas.Valor.values().length* Cartas.Palo.values().length];
        int j=0;
        for(Cartas.Palo palo : Cartas.Palo.values()){
            for(Cartas.Valor valor : Cartas.Valor.values())
                cartas[j++] = new Carta(valor,palo);
        }
    }

    public void shuffle(){
        List<Carta> cartaList = Arrays.asList(cartas);
        Collections.shuffle(cartaList);
        cartaList.toArray(cartas);

    }

    public Carta getUp(){
        if(cartas.length==0)
            return null;

        Carta carta = cartas[cartas.length-1];

        Carta[] aux = new Carta[cartas.length-1];

        for(int i=0;i<aux.length;i++)
            aux[i]=cartas[i];

        cartas = aux;

        return carta;
    }

    public Carta getDown(){
        if(cartas.length==0)
            return null;

        Carta carta = cartas[0];

        Carta[] aux = new Carta[cartas.length-1];

        for(int i=0;i<aux.length;i++)
            aux[i]=cartas[i+1];

        cartas = aux;

        return carta;

    }

    public Carta showUp(){
        if(cartas.length>0)
            return cartas[cartas.length-1];
        return null;
    }

    public Carta showDown(){
        if(cartas.length>0)
            return cartas[0];
        return null;
    }

    public int getSize() {
        return cartas.length;
    }

    public Carta[] getCartas() {
        return cartas;
    }

    @Override
    public String toString(){
        String salida = "";

        for(int i=0;i< cartas.length;i++)
            salida += cartas[i] +" ";

        return salida;
    }

}

