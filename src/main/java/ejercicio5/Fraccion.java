package ejercicio5;

public class Fraccion {

    private int numerador;
    private int denominador;

    private int numeradorFinal;

    private int denominadorFinal;


    public Fraccion(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
        this.numeradorFinal = numerador;
        this.denominadorFinal = denominador;
    }

    public Fraccion multiplicar(Fraccion f1, Fraccion f2){
        this.numeradorFinal = f1.numerador * f2.numerador;
        this.denominadorFinal = f1.denominador * f2.denominador;

        return new Fraccion (numeradorFinal, denominadorFinal);
    }

    public Fraccion dividir(Fraccion f1, Fraccion f2){
        this.numeradorFinal = f1.numerador * f2.denominador;
        this.denominadorFinal = f1.denominador * f2.numerador;

        return new Fraccion (numeradorFinal, denominadorFinal);
    }

    public Fraccion sumar(Fraccion f1, Fraccion f2){
        if(f1.denominador==f2.denominador){
            this.numeradorFinal = f1.numerador + f2.numerador;
            return new Fraccion (numeradorFinal, denominadorFinal);
        }else{
            this.numeradorFinal = (f1.numerador * f2.denominador) + (f2.numerador * f1.denominador);
            this.denominadorFinal = f1.denominador * f2.denominador;
            return new Fraccion (numeradorFinal, denominadorFinal);
        }
    }

    public Fraccion restar(Fraccion f1, Fraccion f2){
        if(f1.denominador==f2.denominador){
            this.numeradorFinal = f1.numerador - f2.numerador;
            return new Fraccion (numeradorFinal, denominadorFinal);
        }else{
            this.numeradorFinal = (f1.numerador * f2.denominador) - (f2.numerador * f1.denominador);
            this.denominadorFinal = f1.denominador * f2.denominador;
            return new Fraccion (numeradorFinal, denominadorFinal);
        }
    }

    @Override
    public String toString(){
        return  numeradorFinal + "/" + denominadorFinal;
    }
}
