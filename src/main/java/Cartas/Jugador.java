package Cartas;

//nombre
//mano de cartas
//puntuacion

public class Jugador {

    private String nombre;
    private Carta[] mano;

    public Jugador (String nombre){
        this.nombre = nombre;
        mano = new Carta[0];
    }

    public String getNombre() {
        return nombre;
    }

    public void addCarta(Carta carta){
        Carta[] aux = new Carta[mano.length+1];
        for(int i=0;i<mano.length;i++)
            aux[i] = mano[i];
        aux[aux.length-1] = carta;
        mano = aux;
    }

    public int getPuntuacion(){

        int puntuacion = 0;

        for(Carta carta : mano){
            if(carta.getValor().equals(Valor.UNO) && puntuacion < 11)
                puntuacion+=carta.getValor().getPuntuacion()[1];
            else
                puntuacion+=carta.getValor().getPuntuacion()[0];
        }


        return puntuacion;
    }

    public int puntuacionPasado(){
        return -1;
    }

    @Override
    public String toString(){
        String salida = "Nombre: " + nombre + "\n";
        salida+="Cartas: ";
        for (Carta carta : mano)
            salida+=carta+" ";

        salida+="\nPuntuación: " + getPuntuacion();

        return salida;
    }

}
