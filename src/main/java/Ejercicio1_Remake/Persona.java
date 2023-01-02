package Ejercicio1_Remake;

public class Persona {

    private String nombre;
    private String apellidos;
    private String DNI;

    public Persona(String nombre, String apellidos){
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Persona(String nombre, String apellidos, String DNI){
        this(nombre, apellidos);
        this.DNI = DNI;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellidos(){
        return apellidos;
    }

    @Override
    public String toString(){
        String info = "";
        info += nombre + " " + apellidos;

        if(DNI != null)
            info += "\nDNI: " + DNI;

        return  info;
    }

}
