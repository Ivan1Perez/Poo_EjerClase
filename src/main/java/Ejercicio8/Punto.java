package Ejercicio8;

public class Punto {

    private int ejeX;
    private int ejeY;

    public Punto(){

    }

    public Punto(int ejeX, int ejeY){
        this.ejeX = ejeX;
        this.ejeY = ejeY;
    }

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

//    @Override
//    public String toString(){
//        return "(" + ejeX + "," + ejeY + ")";
//    }

}
