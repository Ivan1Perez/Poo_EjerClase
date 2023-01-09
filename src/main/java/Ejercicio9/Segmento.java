package Ejercicio9;

public class Segmento {

    private int ejeX;
    private int ejeY;
//    private int ejeX1;
//    private int ejeY1;
//    private int ejeX2;
//    private int ejeY2;


    public Segmento(){

    }

    public Segmento(int ejeX, int ejeY){
        this.ejeX = ejeX;
        this.ejeY = ejeY;
    }

//    public Segmento(int ejeX1, int ejeY1, int ejeX2, int ejeY2){
//        this.ejeX1 = ejeX1;
//        this.ejeY1 = ejeY1;
//        this.ejeX2 = ejeX2;
//        this.ejeY2 = ejeY2;
//    }

    public void setEjeX(int ejeX) {
        this.ejeX = ejeX;
    }

    public void setEjeY(int ejeY) {
        this.ejeY = ejeY;
    }

    public void moveUp(int distance){
        this.ejeX += distance;
    }

    public void moveDown(int distance){
        this.ejeX -= distance;
    }

    public void moveLeft(int distance){
        this.ejeY -= distance;
    }

    public void moveRight(int distance){
        this.ejeY += distance;
    }

    public void movePuntosUp(int distance, Segmento segmento){
        this.ejeX += distance;
        this.ejeY += distance;
        segmento.ejeX += distance;
        segmento.ejeY += distance;
    }

    @Override
    public String toString(){
        return "(" + ejeX + "," + ejeY + ")";
    }


}
