package Ejercicio10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Baraja {

    private Carta[] cartas;
    private boolean repartido = false;

    public Baraja(){
        cartas = new Carta[Valor.values().length * Palo.values().length];
        int j=0;
        for(Palo palo : Palo.values()){
            for(Valor valor : Valor.values()){
                cartas[j++] = new Carta(valor,palo);
            }
        }
    }

    public Carta getUp(){
        this.repartido = true;

        if(cartas.length==0)
            return null;

        Carta carta = cartas[cartas.length-1];

        Carta[] aux = new Carta[cartas.length-1];

        for(int i = 0 ; i < aux.length ; i++){
            aux[i] = cartas[i];
        }

        cartas = aux;

        return carta;
        
    }

    public Carta getDown(){
        if(cartas.length==0){
            return null;
        }

        Carta carta = cartas[0];

        Carta[] aux = new Carta[cartas.length-1];

        for(int i = 0; i < aux.length ; i++){
            aux[i] = cartas[i+1];
        }

        cartas = aux;

        return carta;
    }

    public void shuffle(){
        if(!repartido) {
            System.out.println("Se barajan las cartas:");
            List<Ejercicio10.Carta> cartaList = Arrays.asList(cartas);
            Collections.shuffle(cartaList);
            cartaList.toArray(cartas);
        }else System.out.println("No se puede barajar una vez se ha comenzado a repartir.");
    }

    @Override
    public String toString(){
        String salida = "";

        for(int i=0;i< cartas.length;i++)
            salida += cartas[i] +" ";

        return salida;
    }

}
