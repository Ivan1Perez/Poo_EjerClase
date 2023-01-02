package Ejercicio6;

public enum Mes {
    ENERO("Enero", new int[] {31}),
    FEBRERO("Febrero",new int[] {28,29}),
    MARZO("Marzo", new int[] {31}),
    ABRIL("Abril", new int[] {30}),
    MAYO("Mayo", new int[] {31}),
    JUNIO("Junio", new int[] {30}),
    JULIO("Julio", new int[] {31}),
    AGOSTO("Agosto", new int[] {31}),
    SEPTIEMBRE("Septiembre", new int[] {30}),
    OCTUBRE("Octubre", new int[] {31}),
    NOVIEMBRE("Noviembre", new int[] {30}),
    DICIEMBRE("Diciembre", new int[] {31});


    private String nombreMes;

    private int[] diasMes;

    public int[] getDiasMes(){
        return diasMes;
    }

    public int diasTotales(int anyo){
        if(!nombreMes.equalsIgnoreCase("Febrero"))
            return diasMes[0];
        else {
            if (esBisiesto(anyo))
                return diasMes[1];
            else return diasMes[0];
        }
    }

//    public int calendarioAnual(int anyo){
//        for(int i=0;diasTotales())
//
//    }

    public boolean esBisiesto(int anyo){
        if(anyo%4==0) {
            if(anyo%100==0) {
                if (anyo % 400 == 0)
                    return true;
                else return false;
            }else return true;
        }else return false;

//        if(anyo%4==0 && anyo%100==0 && anyo%400==0)
//            return true;
//        else if(anyo%4==0 && anyo%100!=0)
//            re
    }

//    public

    Mes(String nombreMes, int[] diasMes){
        this.nombreMes = nombreMes;
        this.diasMes = diasMes;
    }


    @Override
    public String toString() {
        return nombreMes;
    }
}
