package Ejercicio10;

public enum Valor {

    UNO("A",new int[]{1,10}),
    DOS("2",new int[]{2}),
    TRES("3",new int[]{3}),
    CUATRO("4",new int[]{4}),
    CINCO("5",new int[]{5}),
    SEIS("6",new int[]{6}),
    SIETE("7",new int[]{7}),
    DIEZ("J",new int[]{10}),
    ONCE("Q",new int[]{11}),
    DOCE("K",new int[]{12});

    private String figura;
    private int[] puntuacion;

    Valor(String figura, int[] puntuacion){
        this.figura = figura;
        this.puntuacion = puntuacion;
    }

    public int[] getPuntuacion() {
        return puntuacion;
    }

    @Override
    public String toString(){
        if(figura.equalsIgnoreCase("A"))
            return figura + "(" + puntuacion[1] + ")";
        return figura + "(" + puntuacion[0] + ")";
    }

}
